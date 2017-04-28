/**
 * Created: 31 March 2017
 *
 * @author Cai Chen
 * @version 1.0
 * @description The entrance of program
 */

package com.unimelb.comp90055.bmAnalysis;

import java.util.Iterator;

import org.apache.uima.UIMAException;
import org.apache.uima.UIMAFramework;
import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.analysis_engine.AnalysisEngineDescription;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.fit.factory.AnalysisEngineFactory;
import org.apache.uima.fit.factory.JCasFactory;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;
import org.apache.uima.util.XMLInputSource;

import com.unimelb.comp90055.bmAnalysis.umlsAPI.RetrieveAtoms;
import com.unimelb.comp90055.bmAnalysis.type.Candidate;
import com.unimelb.comp90055.bmAnalysis.type.Mapping;
import com.unimelb.comp90055.bmAnalysis.type.Phrase;
import com.unimelb.comp90055.bmAnalysis.type.Span;
import com.unimelb.comp90055.bmAnalysis.type.Utterance;

public class BMAnnotatorTest
{
	// Define analysis engine
	private AnalysisEngine ae;
	// Define java CAS
	private JCas jcas;
	
	// Construct function
	public BMAnnotatorTest() throws org.apache.uima.cas.CASRuntimeException,
			org.apache.uima.analysis_engine.AnalysisEngineProcessException,
			org.apache.uima.resource.ResourceInitializationException, org.apache.uima.util.InvalidXMLException,
			java.io.IOException, UIMAException
	{
		// Use xml discription to create engine
		// get Resource Specifier from XML file
		//XMLInputSource in = new XMLInputSource("desc/BMAnalysisEngineDescriptor.xml");
		//AnalysisEngineDescription desc = UIMAFramework.getXMLParser().parseAnalysisEngineDescription(in);
		// create AE here
		//this.ae = UIMAFramework.produceAnalysisEngine(desc);
		// create a JCas, given an Analysis Engine (ae)
		//this.jcas = this.ae.newJCas();
		
		// Use uimaFIT to create engine
		this.ae = AnalysisEngineFactory.createEngine(BMAnnotator.class, BMAnnotator.PARAM_LANGUAGE, "uimaFIT");
		this.jcas = this.ae.newJCas();
	}
	
	// Process the text
	public void process(String txt) throws org.apache.uima.cas.CASRuntimeException,
			org.apache.uima.analysis_engine.AnalysisEngineProcessException,
			org.apache.uima.resource.ResourceInitializationException, org.apache.uima.util.InvalidXMLException,
			java.io.IOException
	{
		// Analyze the document
		this.jcas.setDocumentText(txt);
		ae.process(this.jcas);
		displayResults(this.jcas);
		this.jcas.reset();
	}

	// Release the resource
	public void release()
	{
		
	}
	
	public void displayResults(JCas aJCas)
	{
		FSIndex utteranceIndex = aJCas.getAnnotationIndex(Utterance.type);
		Iterator utteranceIter = utteranceIndex.iterator();
		while (utteranceIter.hasNext())
		{
			Utterance utterance = (Utterance) utteranceIter.next();
			System.out.println("pmid:" + utterance.getPmid());
			System.out.println("location:" + utterance.getLocation());
			System.out.println("start:" + utterance.getStart());
			System.out.println("begin:" + utterance.getBegin());
			System.out.println("end:" + utterance.getEnd());
			System.out.println("text:" + utterance.getCoveredText());

			for (FeatureStructure phraseFeature : utterance.getPhrases().toArray())
			{
				System.out.println("  phrase text:" + ((Phrase) phraseFeature).getCoveredText());
				System.out.println("  phrase start:" + ((Phrase) phraseFeature).getStart());
				System.out.println("  phrase begin:" + ((Phrase) phraseFeature).getBegin());
				System.out.println("  phrase end:" + ((Phrase) phraseFeature).getEnd());
				System.out.println("  phrase text:" + ((Phrase) phraseFeature).getCoveredText());
				for (FeatureStructure mappingFeature : ((Phrase) phraseFeature).getMappings().toArray())
				{
					System.out.println("    mapping score:" + ((Mapping) mappingFeature).getScore());
					for (FeatureStructure candidateFeature : ((Mapping) mappingFeature).getCandidates().toArray())
					{
						System.out.println("      candidate start:" + ((Candidate) candidateFeature).getStart());
						System.out.println("      candidate begin:" + ((Candidate) candidateFeature).getBegin());
						System.out.println("      candidate end:" + ((Candidate) candidateFeature).getEnd());
						System.out.println("      candidate text:" + ((Candidate) candidateFeature).getCoveredText());
						System.out.println("      candidate score:" + ((Candidate) candidateFeature).getScore());
						System.out.println("      candidate concept:" + ((Candidate) candidateFeature).getConcept());
						System.out.println("      candidate cui:" + ((Candidate) candidateFeature).getCui());
						System.out.println("      candidate head:" + ((Candidate) candidateFeature).getHead());
						for (FeatureStructure spanFeature : ((Candidate) candidateFeature).getSpans().toArray())
						{
							System.out.println("       candidate span:" + ((Span) spanFeature).getBegin() + ","
									+ ((Span) spanFeature).getEnd());
						}
					}
				}
			}
		}
	}
	
	public static void main(String[] args) throws org.apache.uima.cas.CASRuntimeException,
			org.apache.uima.analysis_engine.AnalysisEngineProcessException,
			org.apache.uima.resource.ResourceInitializationException, org.apache.uima.util.InvalidXMLException,
			java.io.IOException, UIMAException
	{
		//BMAnnotatorTest program = new BMAnnotatorTest();
		//String doc = "A few people have the obstructive sleep apnea";
		//.process(doc);
		//program.release();
		RetrieveAtoms ra = new RetrieveAtoms();
		ra.retrieveAtoms("C0520679");
		
		
	}

}
