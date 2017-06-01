/**
 * Created: 30 April 2017
 *
 * @author Cai Chen
 * @version 1.0
 * @description The ST manager
 */

package com.unimelb.comp90055.bmAnalysis.umlsAPI;

import java.util.Comparator;
import java.util.Date;
import java.util.PriorityQueue;

import com.unimelb.comp90055.bmAnalysis.restService.Config;


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
	
	public static ServiceTicketManager getInstance()
	{
		if(instance == null)
			instance = new ServiceTicketManager();
		return instance;
	}
		
	public synchronized String getST()
	{
		if(!stQueue.isEmpty())
			return stQueue.poll().getSt();
		return null;
	}
	
	public synchronized void refresh()
	{
		// Delete expired STs
		while(!stQueue.isEmpty() && (new Date().getTime() - stQueue.peek().getCreatedTime().getTime()) > 240000)
			stQueue.poll();
		int size = stQueue.size();
		// If the number of ST is 10, then return
		if(size == 10)
			return;
		// Add new STs
		// Read the username and password
		String username = Config.getUmlsUsername();
		String password = Config.getUmlsPassword();
		// Initialize RestTicketClient
		RestTicketClient ticketClient = new RestTicketClient(username, password);
		String tgt = ticketClient.getTgt();

		String st = ticketClient.getST(tgt);
		if (st != null)
			stQueue.add(new ServiceTicket(st, new Date()));

	}
}
