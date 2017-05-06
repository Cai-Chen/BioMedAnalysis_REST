package com.unimelb.comp90055.bmAnalysis.restService;

import java.net.URI;

import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.ResourceConfig;


public class AnnoServiceStart
{
	public static void main(String[] args) throws Exception
	{
		ResourceConfig config = new ResourceConfig(AnnoService.class);
		 
		JettyHttpContainerFactory.createServer(new URI("http://localhost:" + Config.getServerPort()), config);
		
	}
}
