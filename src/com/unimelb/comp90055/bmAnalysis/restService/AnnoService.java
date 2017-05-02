package com.unimelb.comp90055.bmAnalysis.restService;

import java.util.ArrayList;
import java.util.Iterator;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.fit.factory.AnalysisEngineFactory;
import org.apache.uima.jcas.JCas;

import com.unimelb.comp90055.bmAnalysis.bmAnalysisEngine.BMAnnotator;
import com.unimelb.comp90055.bmAnalysis.type.Atom;
import com.unimelb.comp90055.bmAnalysis.umlsAPI.AtomLite;

@Path("annoService")
public class AnnoService
{
	// This method is called if XML is request
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello()
	{
		return "Hello, AnnoService";
	}	
	
	@GET
	@Path("query")
	@Produces(MediaType.APPLICATION_JSON)
	public AnnoResult getAnnotation(
			@QueryParam("text") String text,
			@QueryParam("language") String language,
			@QueryParam("semGroup") String semGroup) throws Exception
	{
		AnalysisEngine ae = AnalysisEngineFactory.createEngine(BMAnnotator.class, 
				BMAnnotator.PARAM_LANGUAGE, language,
				BMAnnotator.PARAM_SEMGROUP, semGroup);
		
		JCas jcas = ae.newJCas();
		
		jcas.setDocumentText(text);
		ae.process(jcas);
		
		AnnoResult annoRst = getAnnoResult(jcas, text);
		
		return annoRst;
	}
	
	private AnnoResult getAnnoResult(JCas jcas, String text)
	{
		AnnoResult annoRst = new AnnoResult();
		annoRst.setDocument(text);
		ArrayList<Candidate> candidateList = new ArrayList<Candidate>();
		
		@SuppressWarnings("rawtypes")
		FSIndex candidateIndex = jcas.getAnnotationIndex(com.unimelb.comp90055.bmAnalysis.type.Candidate.type);
		@SuppressWarnings("rawtypes")
		Iterator candidateIter = candidateIndex.iterator();
		while(candidateIter.hasNext())
		{
			Candidate candidate = new Candidate();
			com.unimelb.comp90055.bmAnalysis.type.Candidate currentCandidate = (com.unimelb.comp90055.bmAnalysis.type.Candidate) candidateIter.next();
			ArrayList<Span> spanList = new ArrayList<Span>();
			for(FeatureStructure spanFeature : currentCandidate.getSpans().toArray())
			{
				Span span = new Span();
				span.setBegin(((com.unimelb.comp90055.bmAnalysis.type.Span) spanFeature).getBegin());
				span.setEnd(((com.unimelb.comp90055.bmAnalysis.type.Span) spanFeature).getEnd());
				spanList.add(span);
			}
			candidate.setSpanList(spanList);
			
			candidate.setCui(currentCandidate.getCui());
			
			ArrayList<AtomLite> atomList = new ArrayList<AtomLite>();
			for(FeatureStructure spanFeature : currentCandidate.getAtoms().toArray())
			{
				AtomLite atom= new AtomLite();
				atom.setUi(((Atom)spanFeature).getAui());
				atom.setName(((Atom)spanFeature).getName());
				atom.setLanguage(((Atom)spanFeature).getLanguage());
				atomList.add(atom);
			}
			candidate.setAtomList(atomList);
			
			candidateList.add(candidate);
		}
		annoRst.setCandidateList(candidateList);
		System.out.println("Final End End Time " + new java.util.Date().getTime());
		return annoRst;
	}
}
