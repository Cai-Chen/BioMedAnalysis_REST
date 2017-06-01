/**
 * Created: 30 April 2017
 *
 * @author Cai Chen
 * @version 1.0
 * @description The thread used to update ST set
 */

package com.unimelb.comp90055.bmAnalysis.umlsAPI;

public class RetrieveSTthread extends Thread
{
	@Override
	public void run() 
	{
		while(true)
		{
			ServiceTicketManager.getInstance().refresh();
			try
			{
				sleep(100);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
	}
}
