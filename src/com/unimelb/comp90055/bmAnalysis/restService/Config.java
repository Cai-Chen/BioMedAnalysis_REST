package com.unimelb.comp90055.bmAnalysis.restService;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config
{
	public static String getServerPort()
	{
		InputStream inputStream = AnnoServiceStart.class.getClassLoader().getResourceAsStream("config.properties");
		Properties p = new Properties();
		try
		{
			p.load(inputStream);
		} catch (IOException e)
		{
			e.printStackTrace();
		}   
		return p.getProperty("port");
	}

	public static String getUmlsUsername()
	{
		InputStream inputStream = AnnoServiceStart.class.getClassLoader().getResourceAsStream("config.properties");
		Properties p = new Properties();
		try
		{
			p.load(inputStream);
		} catch (IOException e)
		{
			e.printStackTrace();
		}   
		return p.getProperty("username");
	}
	
	public static String getUmlsPassword()
	{
		InputStream inputStream = AnnoServiceStart.class.getClassLoader().getResourceAsStream("config.properties");
		Properties p = new Properties();
		try
		{
			p.load(inputStream);
		} catch (IOException e)
		{
			e.printStackTrace();
		}   
		return p.getProperty("password");
	}
}	
