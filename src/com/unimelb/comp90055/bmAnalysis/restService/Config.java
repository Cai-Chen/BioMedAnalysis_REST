package com.unimelb.comp90055.bmAnalysis.restService;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config
{
	private static final String CONFIG_PATH = "conf\\config.properties";
	
	public static String getServerPort()
	{
		File f = new java.io.File(CONFIG_PATH);
		Properties p = new Properties();
		try
		{
			InputStream inputStream = new FileInputStream(f);
			p.load(inputStream);
		} catch (IOException e)
		{
			e.printStackTrace();
		}   
		return p.getProperty("port");
	}

	public static String getUmlsUsername()
	{
		File f = new java.io.File(CONFIG_PATH);
		Properties p = new Properties();
		try
		{
			InputStream inputStream = new FileInputStream(f);
			p.load(inputStream);
		} catch (IOException e)
		{
			e.printStackTrace();
		}    
		return p.getProperty("username");
	}
	
	public static String getUmlsPassword()
	{
		File f = new java.io.File(CONFIG_PATH);
		Properties p = new Properties();
		try
		{
			InputStream inputStream = new FileInputStream(f);
			p.load(inputStream);
		} catch (IOException e)
		{
			e.printStackTrace();
		}   
		return p.getProperty("password");
	}
}	
