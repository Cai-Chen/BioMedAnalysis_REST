package com.unimelb.comp90055.bmAnalysis.test;

import static com.jayway.restassured.RestAssured.given;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;


public class Test
{

	public static void main(String[] args)
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		
		Log log = LogFactory.getLog("testLog");
		log.info("Test started at | " + formatter.format(new Date()));
		
		String text = "A few people have the obstructive sleep apnea";
		String semGroup = "Chemicals & Drugs,Disorders";
		String language = "ENG";		
		Response response = null;
		RestAssured.baseURI = "http://localhost:9998/annoService/query";
		response = given()
				.request().with()
				.param("text", text)
				.param("semGroup", semGroup)
				.param("language", language).expect().when().get();
		if(response.statusCode() == 200)
		{
			log.info("Retrieved at | " + formatter.format(new Date()));
		}
	}

}
