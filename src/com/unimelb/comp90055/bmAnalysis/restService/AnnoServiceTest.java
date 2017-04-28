package com.unimelb.comp90055.bmAnalysis.restService;

import java.net.URI;

import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import com.unimelb.comp90055.bmAnalysis.umlsAPI.RetrieveSTthread;

public class AnnoServiceTest
{

	public static void main(String[] args) throws Exception
	{
		ResourceConfig config = new ResourceConfig(AnnoService.class);

		JettyHttpContainerFactory.createServer(new URI("http://localhost:9998"), config);
		
		RetrieveSTthread retrieveSTthread = new RetrieveSTthread();
		retrieveSTthread.start();
	}

}
