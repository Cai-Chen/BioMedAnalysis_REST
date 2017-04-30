package com.unimelb.comp90055.bmAnalysis.umlsAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class AtomManager
{
	private HashMap<String, List<AtomLite>> cuiMap;
	private ArrayList<String> retrievedCui;
	
	private static AtomManager instance = null;
	
	private AtomManager()
	{
		cuiMap = new HashMap<String, List<AtomLite>>();
		retrievedCui = new ArrayList<String>();
	}
	
	public static synchronized AtomManager getInstance()
	{
		if(instance == null)
			instance = new AtomManager();
		return instance;
	}
	
	public void addAtoms(String cui_lang, List<AtomLite> atomList)
	{
		// If the cui and language exists
		if(retrievedCui.contains(cui_lang))
			return;
		// Otherwise add this cui, language and atom list
		cuiMap.put(cui_lang, atomList);
		retrievedCui.add(cui_lang);
	}
	
	public boolean hasAtomList(String cui_lang)
	{
		return retrievedCui.contains(cui_lang);
	}
	
	public List<AtomLite> getAtomList(String cui_lang)
	{
		return cuiMap.get(cui_lang);
	}
}
