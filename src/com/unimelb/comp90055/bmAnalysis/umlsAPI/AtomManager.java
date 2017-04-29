package com.unimelb.comp90055.bmAnalysis.umlsAPI;

import java.util.HashMap;
import java.util.List;


public class AtomManager
{
	private HashMap<String, List<AtomLite>> cuiMap;
	
	private static AtomManager instance = null;
	
	private AtomManager()
	{
		cuiMap = new HashMap<String, List<AtomLite>>();
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
		if(!cuiMap.isEmpty() && cuiMap.get(cui_lang) != null)
			return;
		// Otherwise add this cui, language and atom list
		cuiMap.put(cui_lang, atomList);
	}
	
	public List<AtomLite> getAtomList(String cui_lang)
	{
		if(cuiMap.isEmpty() || cuiMap.get(cui_lang) == null)
			return null;
		return cuiMap.get(cui_lang);
	}
}
