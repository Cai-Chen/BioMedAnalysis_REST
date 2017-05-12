/**
 * Created: 12 April 2017
 *
 * @author Cai Chen
 * @version 1.0
 * @description The class invoking the REST API of UMLS to get a TGT and ST
 */

package com.unimelb.comp90055.bmAnalysis.umlsAPI;

import static com.jayway.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Headers;
import com.jayway.restassured.response.Response;

public class RestTicketClient
{
	private String service = "http://umlsks.nlm.nih.gov";
	private String username = null;
	private String password = null;
	private String authUri = "https://utslogin.nlm.nih.gov";
	private String apikey = null;

	public RestTicketClient(String username, String password)
	{

		this.username = username;
		this.password = password;
	}

	public RestTicketClient(String apikey)
	{
		this.apikey = apikey;
	}

	public String getTgt()
	{
		String tgt = getExistedTgt();
		if(tgt != null)
			return tgt;
		
		System.out.println("TGT Creating Start Time " + new java.util.Date());
		if (this.username != null && this.password != null)
		{
			RestAssured.baseURI = authUri;
			Response response = given()// .log().all()
					.request().with().param("username", username).param("password", password).expect().statusCode(201)
					.when().post("/cas/v1/tickets");

			Headers h = response.getHeaders();
			tgt = h.getValue("location").substring(h.getValue("location").indexOf("TGT"));

		} 
		else if (apikey != null)
		{
			RestAssured.baseURI = authUri;
			Response response = given()// .log().all()
					.request().with().param("apikey", apikey).expect().statusCode(201).when().post("/cas/v1/api-key");

			Headers h = response.getHeaders();
			tgt = h.getValue("location").substring(h.getValue("location").indexOf("TGT"));
		}
		setNewTgt(tgt);
		System.out.println("TGT Creating End Time " + new java.util.Date());
		
		return tgt;
	}
	
	// Get the TGT which was retrieved before and is not expired 
	private String getExistedTgt()
	{
		String tgt = null, createdTime = null;
		Scanner inputStream = null;
		try
		{
			// Date format
			SimpleDateFormat formatter = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
			// Read the TGT file
			inputStream = new Scanner(new FileInputStream("resources/TGT.txt"));
			inputStream.useDelimiter("\n");
			// If the file is empty
			if(!inputStream.hasNext())
			{
				inputStream.close();
				return null;
			}
			// Read the record
			String[] record = new String[2];
			record = inputStream.next().split("\\|");
			
			tgt = record[0];
			createdTime = record[1];
			// If the tgt is expired
			if( (new java.util.Date().getTime() - formatter.parse(createdTime).getTime()) / 3600000 > 8)
			{
				inputStream.close();
				return null;
			}
			
		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{
			inputStream.close();
		}
		
		return tgt;
	}
	
	// Write new tgt into file
	private void setNewTgt(String tgt)
	{
		PrintWriter outputStream = null;
		try
		{
			// Date format
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			outputStream = new PrintWriter(new FileOutputStream("resources/TGT.txt"));
			outputStream.println(tgt + "|" + formatter.format(new java.util.Date()));
			
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} finally
		{
			outputStream.close();
		}
	}

	public String getST(String tgt)
	{
		System.out.println("ST Creating Start Time " + new java.util.Date().getTime());
		RestAssured.baseURI = authUri;
		Response response = given()
				.request().with().param("service", service).expect().when()
				.post("/cas/v1/tickets/" + tgt);
		if(response.statusCode() != 200)
			return null;
		
		String st = response.getBody().asString();
		System.out.println("ST Creating End Time " + new java.util.Date().getTime());
		return st;
	}
	
	
	public String getSTFromQueue()
	{
		return ServiceTicketManager.getInstance().getST();
	}


}
