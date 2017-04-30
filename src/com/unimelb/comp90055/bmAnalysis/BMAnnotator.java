/**
 * Created: 31 March 2017
 *
 * @author Cai Chen
 * @version 1.0
 * @description The Annotator class for the analysis engine
 */

package com.unimelb.comp90055.bmAnalysis;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.AnalysisComponent;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.descriptor.ConfigurationParameter;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.IntegerArray;
import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.resource.ResourceInitializationException;

import com.unimelb.comp90055.bmAnalysis.umlsAPI.AtomLite;
import com.unimelb.comp90055.bmAnalysis.umlsAPI.AtomManager;
import com.unimelb.comp90055.bmAnalysis.umlsAPI.RetrieveAtoms;
import com.unimelb.comp90055.bmAnalysis.umlsAPI.RetrieveAtomsThread;
import com.unimelb.comp90055.bmAnalysis.umlsAPI.RetrieveSTthread;
import com.unimelb.comp90055.bmAnalysis.type.AcronymAbbrev;
import com.unimelb.comp90055.bmAnalysis.type.Atom;
import com.unimelb.comp90055.bmAnalysis.type.Candidate;
import com.unimelb.comp90055.bmAnalysis.type.CuiConcept;
import com.unimelb.comp90055.bmAnalysis.type.Document;
import com.unimelb.comp90055.bmAnalysis.type.Mapping;
import com.unimelb.comp90055.bmAnalysis.type.MatchMap;
import com.unimelb.comp90055.bmAnalysis.type.Negation;
import com.unimelb.comp90055.bmAnalysis.type.Phrase;
import com.unimelb.comp90055.bmAnalysis.type.Span;
import com.unimelb.comp90055.bmAnalysis.type.Utterance;

import gov.nih.nlm.nls.metamap.AcronymsAbbrevs;
import gov.nih.nlm.nls.metamap.ConceptPair;
import gov.nih.nlm.nls.metamap.Ev;
import gov.nih.nlm.nls.metamap.MetaMapApi;
import gov.nih.nlm.nls.metamap.MetaMapApiImpl;
import gov.nih.nlm.nls.metamap.PCM;
import gov.nih.nlm.nls.metamap.Position;
import gov.nih.nlm.nls.metamap.Result;

public class BMAnnotator extends org.apache.uima.fit.component.JCasAnnotator_ImplBase implements AnalysisComponent
{
	// MetaMap API
	private MetaMapApi api;
	// Retrieve atoms from UMLS
	// private RetrieveAtoms ra;
	// Parameters
	public static final String PARAM_LANGUAGE = "language";
	public static final String PARAM_SEMGROUP = "semGroup";
	
	@ConfigurationParameter(name = PARAM_LANGUAGE, defaultValue = "null")
	private String language;
	
	@ConfigurationParameter(name = PARAM_SEMGROUP, defaultValue = "null")
	private String semGroup;
	
	
	// Initialize method
	public void initialize(UimaContext aContext) throws ResourceInitializationException
	{
		super.initialize(aContext);
		this.api = new MetaMapApiImpl(0);
		// Option parameter
		String option = "";
		if(!semGroup.equals("null"))
			option = setSemTypeOptions(semGroup);
		
		System.out.println(option);
		if(option.length() > 0)
			this.api.setOptions(option);
		
		// ra = new RetrieveAtoms();
		// Thread to retrieve ST
		RetrieveSTthread retrieveSTthread = new RetrieveSTthread();
		retrieveSTthread.start();
	}
	
	// Set semantic type option from parameter
	private String setSemTypeOptions(String semGroup)
	{
		String option = "";
		// Get parameters of Semantic files and group
		String semTypeFile = "resources/SemanticTypes_2013AA.txt";
		String semGroupFile = "resources/SemGroups_2013.txt";
		String[] semGroupArray = semGroup.split(",");
		List<String> semGroupList = new ArrayList<String>(Arrays.asList(semGroupArray));
		// TUI list to store type unique identifier
		List<String> tuiList = new ArrayList<String>();
		// Semantic type abbreviation list
		List<String> typeAbbrevList = new ArrayList<String>();
		// Input scanner
		Scanner inputStream = null;
		try
		{
			// Read the semantic group file
			inputStream = new Scanner(new FileInputStream(semGroupFile));
			inputStream.useDelimiter("\n");
			// Loop to check each row of semantic group file
			// Format:Semantic Group Abbrev|Semantic Group Name|TUI|Full
			// Semantic Type Name
			String[] record_group = new String[4];
			while (inputStream != null && inputStream.hasNextLine())
			{
				// Split data by |
				record_group = inputStream.next().split("\\|");
				// If find the group, add the TUI into list
				if (semGroupList.contains(record_group[1]))
					tuiList.add(record_group[2]);
			}

			// Read the semantic type file
			inputStream = new Scanner(new FileInputStream(semTypeFile));
			inputStream.useDelimiter("\n");
			// Loop to check each row of semantic type file
			// Format:Abbreviation|Type Unique Identifier (TUI)|Full Semantic
			// Type Name
			String[] record_type = new String[3];
			while (inputStream != null && inputStream.hasNextLine())
			{
				// Split data by |
				record_type = inputStream.next().split("\\|");
				// If find the TUI, add the abbreviation into list
				if (tuiList.contains(record_type[1]))
					typeAbbrevList.add(record_type[0]);
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		// Option to Restrict semantic types
		// The second expression is to remove the first [ and last ] and ' '
		option = "--restrict_to_sts " + typeAbbrevList.toString().substring(0, typeAbbrevList.toString().length() - 1)
				.substring(1).replaceAll("\\s", "");
		return option;

	}
	
	// Set semantic type option from xml discription
	private String setSemTypeOptionsXML(UimaContext aContext)
	{
		String option = "";
		// Get parameters of Semantic files and group
		String semTypeFile = (String) aContext.getConfigParameterValue("SemTypeFile");
		String semGroupFile = (String) aContext.getConfigParameterValue("SemGroupFile");
		String[] semGroup = (String[]) aContext.getConfigParameterValue("SemGroup");
		List<String> semGroupList = new ArrayList<String>(Arrays.asList(semGroup));
		// TUI list to store type unique identifier
		List<String> tuiList = new ArrayList<String>();
		// Semantic type abbreviation list
		List<String> typeAbbrevList = new ArrayList<String>();
		// Input scanner
		Scanner inputStream = null;
		try
		{
			// Read the semantic group file
			inputStream = new Scanner(new FileInputStream(semGroupFile));
			inputStream.useDelimiter("\n");
			// Loop to check each row of semantic group file
			// Format:Semantic Group Abbrev|Semantic Group Name|TUI|Full
			// Semantic Type Name
			String[] record_group = new String[4];
			while (inputStream != null && inputStream.hasNextLine())
			{
				// Split data by |
				record_group = inputStream.next().split("\\|");
				// If find the group, add the TUI into list
				if (semGroupList.contains(record_group[1]))
					tuiList.add(record_group[2]);
			}

			// Read the semantic type file
			inputStream = new Scanner(new FileInputStream(semTypeFile));
			inputStream.useDelimiter("\n");
			// Loop to check each row of semantic type file
			// Format:Abbreviation|Type Unique Identifier (TUI)|Full Semantic
			// Type Name
			String[] record_type = new String[3];
			while (inputStream != null && inputStream.hasNextLine())
			{
				// Split data by |
				record_type = inputStream.next().split("\\|");
				// If find the TUI, add the abbreviation into list
				if (tuiList.contains(record_type[1]))
					typeAbbrevList.add(record_type[0]);
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		// Option to Restrict semantic types
		// The second expression is to remove the first [ and last ] and ' '
		option = "--restrict_to_sts " + typeAbbrevList.toString().substring(0, typeAbbrevList.toString().length() - 1)
				.substring(1).replaceAll("\\s", "");
		return option;

	}
	
	private void createThreadToRetrieveAtoms(List<Result> resultList) throws Exception
	{
		for(Result result : resultList)
			for (gov.nih.nlm.nls.metamap.Utterance utterance : result.getUtteranceList())
				for (PCM pcm : utterance.getPCMList())
					for(gov.nih.nlm.nls.metamap.Mapping map : pcm.getMappingList())
						for (Ev ev : map.getEvList())
						{
							RetrieveAtomsThread thread = new RetrieveAtomsThread(ev.getConceptId(), language);
							thread.start();
						}
	}
	
	@Override
	public void process(JCas jcas) throws AnalysisEngineProcessException
	{
		// Get the text to be analyzed
		String docText = jcas.getDocumentText();
		// Invoke the query of the API
		List<Result> resultList = this.api.processCitationsFromString(docText.trim());
		// Create threads to retrieve atoms
		try
		{
			createThreadToRetrieveAtoms(resultList);

		} catch (Exception e1)
		{
			e1.printStackTrace();
		}
		// Index of each result in result List
		int resultStartIndex = 0;
		// Loop to traverse the result List
		for (Result result : resultList)
		{
			if (result != null)
			{
				try
				{
					// Start position of result in whole text
					int citationStart = docText.indexOf(result.getInputText(), resultStartIndex);
					// Assign 0 if not match
					if (citationStart == -1)
						citationStart = 0;
					
					List<Candidate> candidates = processCandidates(jcas, result, citationStart);
					FSArray candidateArray = new FSArray(jcas, candidates.size());
					candidateArray.copyFromArray(candidates.toArray(new Candidate[0]), 0, 0, candidateArray.size());
					candidateArray.addToIndexes(jcas);

				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
			// Increase the index of the result
			resultStartIndex = resultStartIndex + result.getInputText().length();
		}
	}
	
	private List<Candidate> processCandidates(JCas jcas, Result result, int citationStart)
			throws Exception
	{
		Candidate currentCandidate;
		List<Candidate> candidates = new ArrayList<Candidate>();
		
		for (gov.nih.nlm.nls.metamap.Utterance utterance : result.getUtteranceList())
			for (PCM pcm : utterance.getPCMList())
				for(gov.nih.nlm.nls.metamap.Mapping map : pcm.getMappingList())
					for (Ev ev : map.getEvList())
					{
						int begin = 9999;
						int end = 0;
						for (Position pos : ev.getPositionalInfo())
						{
							begin = Math.min(begin, (int) pos.getX());
							end = Math.max(end, pos.getX() + pos.getY());
						}
						int start = citationStart + begin;
						int finish = citationStart + end;
						
						currentCandidate = new Candidate(jcas, start, finish);
						currentCandidate.setCui(ev.getConceptId());
						currentCandidate.setConcept(ev.getConceptName());
						
						StringArray sourceArray = new StringArray(jcas, ev.getSources().size());
						// ev.getSources().toArray()
						sourceArray.copyFromArray(ev.getSources().toArray(new String[0]), 0, 0, ev.getSources().size());
						currentCandidate.setSources(sourceArray);
						sourceArray.addToIndexes();
						
						StringArray semTypeArray = new StringArray(jcas, ev.getSemanticTypes().size());
						// ev.getSemanticTypes().toArray()
						semTypeArray.copyFromArray(ev.getSemanticTypes().toArray(new String[0]), 0, 0,
								ev.getSemanticTypes().size());
						currentCandidate.setSemanticTypes(semTypeArray);
						semTypeArray.addToIndexes();
						
						FSArray fsArray = createSpanFSArray(jcas, ev.getPositionalInfo(), citationStart);
						currentCandidate.setSpans(fsArray);
						fsArray.addToIndexes();
						
						// Add atoms to the candidate	
						List<Atom> atoms = new ArrayList<Atom>();
						Atom atom;
						List<AtomLite> atomLiteList = null;
						// Wait until the result of atoms is retrieved
						boolean hasAtomList = false;
						do
						{
							hasAtomList = AtomManager.getInstance().hasAtomList(ev.getConceptId() + language);
							if(hasAtomList)
								atomLiteList = AtomManager.getInstance().getAtomList(ev.getConceptId() + language);
						}
						while(!hasAtomList);
						if(atomLiteList != null)
							for(AtomLite atomLite : atomLiteList)
							{
								atom = new Atom(jcas);
								atom.setAui(atomLite.getUi());
								atom.setName(atomLite.getName());
								atom.setLanguage(atomLite.getLanguage());
								atoms.add(atom);
							}
						FSArray atomsArray = new FSArray(jcas, atomLiteList == null ? 0 : atomLiteList.size());
						atomsArray.copyFromArray(atoms.toArray(new Atom[0]), 0, 0, atomsArray.size());
						currentCandidate.setAtoms(atomsArray);
						atomsArray.addToIndexes();
						
						candidates.add(currentCandidate);
						currentCandidate.addToIndexes();
					}
		
		return candidates;
	}
	
	/*@Override
	public void process(JCas jcas) throws AnalysisEngineProcessException
	{
		// Get the text to be analyzed
		String docText = jcas.getDocumentText();
		// Invoke the query of the API
		List<Result> resultList = this.api.processCitationsFromString(docText.trim());
		// Create threads to retrieve atoms
		try
		{
			createThreadToRetrieveAtoms(resultList);
			
		} catch (Exception e1)
		{
			e1.printStackTrace();
		}
		// Index of each result in result List
		int resultStartIndex = 0;
		// Loop to traverse the result List
		for(Result result : resultList)
		{
			if(result != null)
			{
				try
				{
					// Start position of result in whole text
					int citationStart = docText.indexOf(result.getInputText(), resultStartIndex);
					// Assign 0 if not match
					if (citationStart == -1)
						citationStart = 0;
					// Create a Document instance 
					Document item = new Document(jcas, citationStart, 
							citationStart + result.getInputText().length());
					
					// Create list of AcronymAbbrev
					List<AcronymAbbrev> acronymsAbbrevs = processAcronymsAbbrevs(jcas,
							result.getAcronymsAbbrevsList());
					// Create a FSArray based on the list of AcronymAbbrev
					FSArray aaArray = new FSArray(jcas, acronymsAbbrevs.size());
					aaArray.copyFromArray(acronymsAbbrevs.toArray(new AcronymAbbrev[0]), 0, 0, aaArray.size());
					// Set the acronymAbbrevs feature
					item.setAcronymAbbrevs(aaArray);
					// Add this FSArray to the indexes of jcas
					aaArray.addToIndexes(jcas);
					
					// Create list of Negation
					List<Negation> negations = processNegations(jcas, result.getNegationList(),	citationStart);
					// Create a FSArray based on the list of Negation
					FSArray negationArray = new FSArray(jcas, negations.size());
					negationArray.copyFromArray(negations.toArray(new Negation[0]), 0, 0, negationArray.size());
					// Set the negations feature
					item.setNegations(negationArray);
					// Add this FSArray to the indexes of jcas
					negationArray.addToIndexes(jcas);
					
					// Create list of Utterance
					List<Utterance> utterances = processUtterances(jcas, result.getUtteranceList(),	citationStart);
					// Create a FSArray based on the list of Utterance
					FSArray utteranceArray = new FSArray(jcas, utterances.size());
					utteranceArray.copyFromArray(utterances.toArray(new Utterance[0]), 0, 0,
							utteranceArray.size());
					// Set the utterances feature
					item.setUtterances(utteranceArray);
					// Add this FSArray to the indexes of jcas
					utteranceArray.addToIndexes(jcas);

					item.addToIndexes(jcas);
					
				} catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			// Increase the index of the result
			resultStartIndex = resultStartIndex + result.getInputText().length();
		}
	}*/
	
	// Generate the List of user-defined AcronymAbbrev according to the original List of acronyms 
	// retrieved from API of MetaMap
	/*private List<AcronymAbbrev> processAcronymsAbbrevs(JCas jcas,
			List<AcronymsAbbrevs> acronymsAbbrevsList) throws Exception
	{
		List<AcronymAbbrev> acronymAbbrevList = new ArrayList<AcronymAbbrev>(acronymsAbbrevsList.size());
		// Loop for each record in the List of acronyms
		for (AcronymsAbbrevs aa : acronymsAbbrevsList)
		{
			// New record of user-defined AcronymAbbrev
			AcronymAbbrev currentAA = new AcronymAbbrev(jcas);
			// Set acronym and expansion features
			currentAA.setAcronym(aa.getAcronym());
			currentAA.setExpansion(aa.getExpansion());
			// Transfer countList from aa
			int i = 0;
			int[] countVector = new int[aa.getCountList().size()];
			for (Integer count : aa.getCountList())
			{
				countVector[i] = count.intValue();
				i++;
			}
			// Create an IntegerArray of countList feature
			IntegerArray countArray = new IntegerArray(jcas, countVector.length);
			countArray.copyFromArray(countVector, 0, 0, countVector.length);
			// Set countList feature
			currentAA.setCountList(countArray);
			// Add this IntegerArray to the indexes of jcas
			countArray.addToIndexes(jcas);
			// Create a StringArray of cuiList feature
			StringArray cuiArray = new StringArray(jcas, aa.getCUIList().size());
			cuiArray.copyFromArray(aa.getCUIList().toArray(new String[0]), 0, 0, aa.getCUIList().size());
			// Set cuiList feature
			currentAA.setCuiList(cuiArray);
			// Add this StringArray to the indexes of jcas
			cuiArray.addToIndexes(jcas);
			// Put this new record into list
			acronymAbbrevList.add(currentAA);
			// Add this new record to the indexes of jcas
			currentAA.addToIndexes(jcas);
		}
		return acronymAbbrevList;
	}*/
	
	// Generate the list of Negation according to the original list of Negation retrieved from MetaMap 
	/*private List<Negation> processNegations(JCas jcas, List<gov.nih.nlm.nls.metamap.Negation> aNegationList, int citationStart)
			throws Exception
	{
		List<Negation> negationList = new ArrayList<Negation>(aNegationList.size());

		CuiConcept currentCuiConcept = null;
		List<CuiConcept> cuiConcepts = null;
		// Loop for each record of the list of Negations
		for (gov.nih.nlm.nls.metamap.Negation neg : aNegationList)
		{
			// New record of user-defined Negation
			Negation currentNegation = new Negation(jcas);
			// Initialize the list of CuiConcept
			cuiConcepts = new ArrayList<CuiConcept>();
			// Set the negType and negTrigger features
			currentNegation.setNegType(neg.getType());
			currentNegation.setNegTrigger(neg.getTrigger());
			// Create a FASarray of ntSpans feature
			FSArray fsArray = createSpanFSArray(jcas, neg.getTriggerPositionList(), citationStart);
			// Set ntSpans feature
			currentNegation.setNtSpans(fsArray);
			// Add this FASarray to the indexes of jcas
			fsArray.addToIndexes();
			// Transfer values to the cuiConcepts
			for (ConceptPair conceptPair : neg.getConceptPairList())
			{
				currentCuiConcept = new CuiConcept(jcas);
				// Set negExCui feature
				currentCuiConcept.setNegExConcept(conceptPair.getPreferredName());
				// Set negExConcept feature
				currentCuiConcept.setNegExCui(conceptPair.getConceptId());
				// Put into the list of CuiConcept
				cuiConcepts.add(currentCuiConcept);
				currentCuiConcept.addToIndexes();
			}
			// Assign with values of ncSpans feature
			fsArray = createSpanFSArray(jcas, neg.getConceptPositionList(), citationStart);
			// Set ncSpans feature
			currentNegation.setNcSpans(fsArray);
			// Add this FASarray to the indexes of jcas
			fsArray.addToIndexes();
			// Assign with values of cuiConcepts feature
			fsArray = new FSArray(jcas, cuiConcepts.size());
			fsArray.copyFromArray(cuiConcepts.toArray(new CuiConcept[0]), 0, 0, fsArray.size());
			// Set cuiConcepts feature
			currentNegation.setCuiConcepts(fsArray);
			fsArray.addToIndexes();
			currentNegation.addToIndexes();
			// Put current Negation into list
			negationList.add(currentNegation);
		}
		return negationList;
	}*/
	
	private FSArray createSpanFSArray(JCas jcas, List<Position> positionList, int citationStart)
	{
		List<Span> spans = createSpanList(jcas, positionList, citationStart);
		FSArray fsArray = new FSArray(jcas, spans.size());
		fsArray.copyFromArray(spans.toArray(new Span[0]), 0, 0, fsArray.size());
		return fsArray;
	}
	
	private List<Span> createSpanList(JCas jcas, List<Position> positionList, int citationStart)
	{
		List<Span> spans = new ArrayList<Span>();
		for (Position pos : positionList)
		{
			Span currentSpan = new Span(jcas);
			if (pos != null)
			{
				currentSpan.setBegin(citationStart + pos.getX());
				currentSpan.setEnd(citationStart + pos.getX() + pos.getY()); // getY()
																				// actually
																				// is
																				// the
																				// Span
																				// length
																				// (http://skr.nlm.nih.gov/Help/MMO_08_Info.html)
			} else
			{
				System.err.println("Null positional information in pos: " + pos);
			}
			spans.add(currentSpan);
			// currentSpan.addToIndexes();
		}
		return spans;
	}
	
	// Generate the list of Utterance according to the original list of Utterance retrieved from MetaMap
	/*private List<Utterance> processUtterances(JCas jcas, List<gov.nih.nlm.nls.metamap.Utterance> anUtteranceList, int citationStart)
			throws Exception
	{
		String docText = jcas.getDocumentText().replace("\n", " ");
		
		List<Utterance> utteranceList = new ArrayList<Utterance>(anUtteranceList.size());

		for (gov.nih.nlm.nls.metamap.Utterance utterance : anUtteranceList)
		{
			int utteranceStart = docText.indexOf(utterance.getString(), citationStart + utterance.getPosition().getX());
			
			 * if indexOf can't find text because of missing spaces or newlines
			 * replaced by spaces then trust values UIMA is providing.
			 
			if (utteranceStart == -1)
			{
				utteranceStart = citationStart + utterance.getPosition().getX();
			}
			Utterance currentUtterance = new Utterance(jcas, utteranceStart, utteranceStart + utterance.getPosition().getY());
			currentUtterance.setPmid(utterance.getId());
			processPCMList(jcas, utterance, currentUtterance, citationStart);
			currentUtterance.addToIndexes();
			utteranceList.add(currentUtterance);
		}
		return utteranceList;
	}*/
	
	/*private void processPCMList(JCas jcas, gov.nih.nlm.nls.metamap.Utterance utterance,
			Utterance currentUtterance, int citationStart) throws Exception
	{
		String docText = jcas.getDocumentText();
		Phrase currentPhrase;
		List<Phrase> phrases = null;
		List<Candidate> candidates = null;
		List<Mapping> mappings = null;
		phrases = new ArrayList<Phrase>();
		mappings = new ArrayList<Mapping>();

		for (PCM pcm : utterance.getPCMList())
		{
			int phraseStart = docText.indexOf(pcm.getPhrase().getPhraseText(),
					citationStart + pcm.getPhrase().getPosition().getX());
			
			 * if indexOf can't find text because of missing spaces or newlines
			 * replaced by spaces then trust values UIMA is providing.
			 
			if (phraseStart == -1)
			{
				phraseStart = citationStart + pcm.getPhrase().getPosition().getX();
			}

			currentPhrase = new Phrase(jcas, phraseStart, phraseStart + pcm.getPhrase().getPosition().getY());
			phrases.add(currentPhrase);

			candidates = processCandidates(jcas, pcm.getCandidateList(), citationStart);
			FSArray fsArray = new FSArray(jcas, candidates.size());
			fsArray.copyFromArray(candidates.toArray(new Candidate[0]), 0, 0, fsArray.size());
			currentPhrase.setCandidates(fsArray);
			fsArray.addToIndexes();

			mappings = processMappings(jcas, pcm, citationStart);
			fsArray = new FSArray(jcas, mappings.size());
			fsArray.copyFromArray(mappings.toArray(new Mapping[0]), 0, 0, fsArray.size());
			currentPhrase.setMappings(fsArray);
			fsArray.addToIndexes();
			currentPhrase.addToIndexes();
		}
		int beginUtteranceEnd = utterance.getId().indexOf(".");
		int endUtteranceEnd = utterance.getId().lastIndexOf(".");
		currentUtterance.setLocation(utterance.getId().substring(beginUtteranceEnd, endUtteranceEnd));
		FSArray fsArray = new FSArray(jcas, phrases.size());
		fsArray.copyFromArray(phrases.toArray(new Phrase[0]), 0, 0, fsArray.size());

		currentUtterance.setPhrases(fsArray);
		fsArray.addToIndexes();
	}*/
	
	/*private List<Candidate> processCandidates(JCas jcas, List<Ev> candidateList, int citationStart)
			throws Exception
	{
		Candidate currentCandidate;
		List<Candidate> candidates = new ArrayList<Candidate>();

		for (Ev ev : candidateList)
		{
			int begin = 9999;
			int end = 0;
			for (Position pos : ev.getPositionalInfo())
			{
				begin = Math.min(begin, (int) pos.getX());
				end = Math.max(end, pos.getX() + pos.getY());
			}
			int start = citationStart + begin;
			int finish = citationStart + end;

			currentCandidate = new Candidate(jcas, start, finish);
			currentCandidate.setScore(ev.getScore());
			currentCandidate.setCui(ev.getConceptId());
			currentCandidate.setConcept(ev.getConceptName());
			currentCandidate.setPreferred(ev.getPreferredName());
			currentCandidate.setHead(ev.isHead());
			currentCandidate.setOvermatch(ev.isOvermatch());

			List<MatchMap> matchMaps = new ArrayList<MatchMap>();
			MatchMap currentMatchMap;
			for (gov.nih.nlm.nls.metamap.MatchMap matchMap : ev.getMatchMapList())
			{
				currentMatchMap = new MatchMap(jcas);
				currentMatchMap.setPhraseMatchStart(matchMap.getPhraseMatchStart());
				currentMatchMap.setPhraseMatchEnd(matchMap.getPhraseMatchEnd());
				currentMatchMap.setConceptMatchStart(matchMap.getConceptMatchStart());
				currentMatchMap.setConceptMatchEnd(matchMap.getConceptMatchEnd());
				currentMatchMap.setLexVariation(matchMap.getLexMatchVariation());
				matchMaps.add(currentMatchMap);
			}
			FSArray matchMapArray = new FSArray(jcas, ev.getMatchMapList().size());
			matchMapArray.copyFromArray(matchMaps.toArray(new MatchMap[0]), 0, 0, matchMapArray.size());
			currentCandidate.setMatchMap(matchMapArray);
			matchMapArray.addToIndexes();

			StringArray sourceArray = new StringArray(jcas, ev.getSources().size());
			// ev.getSources().toArray()
			sourceArray.copyFromArray(ev.getSources().toArray(new String[0]), 0, 0, ev.getSources().size());
			currentCandidate.setSources(sourceArray);
			sourceArray.addToIndexes();

			StringArray semTypeArray = new StringArray(jcas, ev.getSemanticTypes().size());
			// ev.getSemanticTypes().toArray()
			semTypeArray.copyFromArray(ev.getSemanticTypes().toArray(new String[0]), 0, 0,
					ev.getSemanticTypes().size());
			currentCandidate.setSemanticTypes(semTypeArray);
			semTypeArray.addToIndexes();

			StringArray matchedWordArray = new StringArray(jcas, ev.getMatchedWords().size());
			matchedWordArray.copyFromArray(ev.getMatchedWords().toArray(new String[0]), 0, 0,
					ev.getMatchedWords().size());
			currentCandidate.setMatchedwords(matchedWordArray);
			matchedWordArray.addToIndexes();

			FSArray fsArray = createSpanFSArray(jcas, ev.getPositionalInfo(), citationStart);
			currentCandidate.setSpans(fsArray);
			fsArray.addToIndexes();
			
			// Add atoms to the candidate	
			List<Atom> atoms = new ArrayList<Atom>();
			Atom atom;
			List<AtomLite> atomLiteList = null;
			do
			{
				atomLiteList = AtomManager.getInstance().getAtomList(ev.getConceptId() + language);
			}
			while(atomLiteList == null);
			for(AtomLite atomLite : atomLiteList)
			{
				atom = new Atom(jcas);
				atom.setAui(atomLite.getUi());
				atom.setName(atomLite.getName());
				atom.setLanguage(atomLite.getLanguage());
				atoms.add(atom);
			}
			FSArray atomsArray = new FSArray(jcas, atomLiteList.size());
			atomsArray.copyFromArray(atoms.toArray(new Atom[0]), 0, 0, atomsArray.size());
			currentCandidate.setAtoms(atomsArray);
			atomsArray.addToIndexes();

			candidates.add(currentCandidate);
			currentCandidate.addToIndexes();
		}
		return candidates;
	}*/
	
	/*private List<Mapping> processMappings(JCas jcas, PCM pcm, int citationStart) throws Exception
	{
		Mapping currentMapping;
		List<Candidate> candidates;
		List<Mapping> mappings = new ArrayList<Mapping>();

		for (gov.nih.nlm.nls.metamap.Mapping map : pcm.getMappingList())
		{
			currentMapping = new Mapping(jcas);

			candidates = processCandidates(jcas, map.getEvList(), citationStart);

			FSArray mappedCandidatesFSArray = new FSArray(jcas, candidates.size());
			mappedCandidatesFSArray.copyFromArray(candidates.toArray(new Candidate[0]), 0, 0,
					mappedCandidatesFSArray.size());
			currentMapping.setCandidates(mappedCandidatesFSArray);
			mappedCandidatesFSArray.addToIndexes();
			mappings.add(currentMapping);
			currentMapping.setScore(map.getScore());
			currentMapping.addToIndexes();
		}
		return mappings;
	}*/
	
}
