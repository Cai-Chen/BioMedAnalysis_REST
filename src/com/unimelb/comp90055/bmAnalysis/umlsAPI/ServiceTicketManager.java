package com.unimelb.comp90055.bmAnalysis.umlsAPI;

import java.io.FileInputStream;
import java.util.Comparator;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.Scanner;


public class ServiceTicketManager
{
	private PriorityQueue<ServiceTicket> stQueue;
	
	private static ServiceTicketManager instance = null;
	
	private ServiceTicketManager()
	{
		stQueue = new PriorityQueue<ServiceTicket>(10, new Comparator<ServiceTicket>()
		{
			@Override
	        public int compare(ServiceTicket s1, ServiceTicket s2) 
			{
	            return (int) (s1.getCreatedTime().getTime() - s2.getCreatedTime().getTime());
	        }
		});
	}
	
	public static synchronized ServiceTicketManager getInstance()
	{
		if(instance == null)
			instance = new ServiceTicketManager();
		return instance;
	}
	
	public void addST(ServiceTicket st)
	{
		stQueue.add(st);
	}
	
	public synchronized String getST()
	{
		if(!stQueue.isEmpty())
			return stQueue.poll().getSt();
		return null;
	}
	
	public void refresh()
	{
		// Delete expired STs
		while(!stQueue.isEmpty() && (new Date().getTime() - stQueue.peek().getCreatedTime().getTime()) > 240000)
			stQueue.poll();
		// Add new STs
		// Read the username and password
		Scanner inputStream = null;
		String username = null, password = null;
		try
		{
			inputStream = new Scanner(new FileInputStream("resources/UMLS_userpass.txt"));
			String[] userpass = new String[2];
			userpass = inputStream.next().split("\\|");
			username = userpass[0];
			password = userpass[1];

		} catch (Exception e)
		{
			e.printStackTrace();
		}
		// Initialize RestTicketClient
		RestTicketClient ticketClient = new RestTicketClient(username, password);
		String tgt = ticketClient.getTgt();
		int size = stQueue.size();
		while(size <= 10)
		{
			String st = ticketClient.getST(tgt);
			if(st != null)
			{
				stQueue.add(new ServiceTicket(st, new Date()));
				size++;
			}
		}
		
	}
}
