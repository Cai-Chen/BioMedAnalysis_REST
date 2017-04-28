package com.unimelb.comp90055.bmAnalysis.umlsAPI;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties({"classType","attributes","definitions","relations","contentViewMemberships"})
@JsonIgnoreProperties({"classType","attributes","definitions","relations","contentViewMemberships",
	"termType", "suppressible", "obsolete", "rootSource", "concept", "code", "sourceConcept",
	"sourceDescriptor", "parents", "children", "ancestors", "descendants"})

public class AtomLite
{
	private String ui;
	private String name;
	private String language;
	
	public String getUi()
	{
		return ui;
	}
	public void setUi(String ui)
	{
		this.ui = ui;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getLanguage()
	{
		return language;
	}
	public void setLanguage(String language)
	{
		this.language = language;
	}
	
}
