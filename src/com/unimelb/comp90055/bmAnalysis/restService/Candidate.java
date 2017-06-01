/**
 * Created: 30 April 2017
 *
 * @author Cai Chen
 * @version 1.0
 * @description The candidate class for the annotation result
 */

package com.unimelb.comp90055.bmAnalysis.restService;

import java.util.ArrayList;

import com.unimelb.comp90055.bmAnalysis.umlsAPI.AtomLite;

public class Candidate
{
	private ArrayList<Span> spanList;
	private String cui;
	private ArrayList<AtomLite> atomList;
	
	public Candidate()
	{
		spanList = new ArrayList<Span>();
		cui = "";
		atomList = new ArrayList<AtomLite>();
	}

	public ArrayList<Span> getSpanList()
	{
		return spanList;
	}

	public void setSpanList(ArrayList<Span> spanList)
	{
		this.spanList = spanList;
	}

	public String getCui()
	{
		return cui;
	}

	public void setCui(String cui)
	{
		this.cui = cui;
	}

	public ArrayList<AtomLite> getAtomList()
	{
		return atomList;
	}

	public void setAtomList(ArrayList<AtomLite> atomList)
	{
		this.atomList = atomList;
	}
	
	
}
