/**
 * Created: 30 April 2017
 *
 * @author Cai Chen
 * @version 1.0
 * @description The span class for the text
 */

package com.unimelb.comp90055.bmAnalysis.restService;

public class Span
{
	private int begin;
	private int end;
	
	public Span()
	{
		begin = -1;
		end = -1;
	}

	public int getBegin()
	{
		return begin;
	}

	public void setBegin(int begin)
	{
		this.begin = begin;
	}

	public int getEnd()
	{
		return end;
	}

	public void setEnd(int end)
	{
		this.end = end;
	}
	
}
