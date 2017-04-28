package com.unimelb.comp90055.bmAnalysis.restService;

import java.util.ArrayList;

public class AnnoResult
{
	private String document;
	private ArrayList<Candidate> candidateList;
	
	public AnnoResult()
	{
		document = "";
		candidateList = new ArrayList<Candidate>();
	}
	
	public String getDocument()
	{
		return document;
	}
	
	public void setDocument(String document)
	{
		this.document = document;
	}

	public ArrayList<Candidate> getCandidateList()
	{
		return candidateList;
	}

	public void setCandidateList(ArrayList<Candidate> candidateList)
	{
		this.candidateList = candidateList;
	}
	
}
