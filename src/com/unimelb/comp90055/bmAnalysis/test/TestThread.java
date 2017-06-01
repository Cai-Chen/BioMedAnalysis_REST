/**
 * Created: 30 April 2017
 *
 * @author Cai Chen
 * @version 1.0
 * @description The test thread class
 */

package com.unimelb.comp90055.bmAnalysis.test;

import static com.jayway.restassured.RestAssured.given;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

class TestThread extends Thread
{
	private String id;
	private String text;
	private String semGroup;
	private String language;
	
	public TestThread(String id, String text, String semGroup, String language)
	{
		super();
		this.id = id;
		this.text = text;
		this.semGroup = semGroup;
		this.language = language;
	}


	@Override
	public void run() 
	{
		Log log = LogFactory.getLog("testLog");
		//SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		
		log.info(id + " | Test started at | " + new java.util.Date().getTime());
		
		Response response = null;
		RestAssured.baseURI = "http://readbiomed.cis.unimelb.edu.au:9999/annoService/query";
		response = given()
				.request().with()
				.param("text", text)
				.param("semGroup", semGroup)
				.param("language", language).expect().when().get();
		if(response.statusCode() == 200)
		{
			log.info(id + " | Retrieved at | " + new java.util.Date().getTime());
		}
	}
}
