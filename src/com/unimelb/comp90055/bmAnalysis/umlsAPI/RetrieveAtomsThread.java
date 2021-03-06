/**
 * Created: 30 April 2017
 *
 * @author Cai Chen
 * @version 1.0
 * @description The thread used to create the object of RetrieveAtoms
 */

package com.unimelb.comp90055.bmAnalysis.umlsAPI;

import java.util.List;

public class RetrieveAtomsThread extends Thread
{
	private String cui;
	private String language;
	
	public RetrieveAtomsThread(String cui, String language)
	{
		this.cui = cui;
		this.language = language;
	}
	
	@Override
	public void run() 
	{
		if(!AtomManager.getInstance().hasAtomList(cui + language))
		{
			RetrieveAtoms ra = new RetrieveAtoms();
			List<AtomLite> atomList = ra.retrieveAtomsList(cui, language);
			AtomManager.getInstance().addAtoms(cui + language, atomList);
		}
	}
}
