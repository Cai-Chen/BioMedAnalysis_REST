/**
 * Created: 30 April 2017
 *
 * @author Cai Chen
 * @version 1.0
 * @description The class of ST
 */

package com.unimelb.comp90055.bmAnalysis.umlsAPI;

import java.util.Date;

public class ServiceTicket
{
	private String st;
	private Date createdTime;
	
	public ServiceTicket(String st, Date createdTime)
	{
		super();
		this.st = st;
		this.createdTime = createdTime;
	}
	
	public String getSt()
	{
		return st;
	}
	
	public void setSt(String st)
	{
		this.st = st;
	}
	
	public Date getCreatedTime()
	{
		return createdTime;
	}
	
	public void setCreatedTime(Date createdTime)
	{
		this.createdTime = createdTime;
	}
	
	
}
