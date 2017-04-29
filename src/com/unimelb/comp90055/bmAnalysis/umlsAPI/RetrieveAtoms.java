package com.unimelb.comp90055.bmAnalysis.umlsAPI;

import static com.jayway.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;

public class RetrieveAtoms
{
	private RestTicketClient ticketClient;
	// TGT
	private String tgt;
	
	public RetrieveAtoms()
	{
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
			
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		// Initialize RestTicketClient
		ticketClient = new RestTicketClient(username, password);
		System.out.println("TGT Creating Start Time " + new java.util.Date());
		//tgt = ticketClient.getTgt();
		System.out.println("TGT Creating End Time " + new java.util.Date());
	}

	public void retrieveAtoms(String cui)
	{
		String path = "/rest/content/current/CUI/" + cui + "/atoms";
		AtomLite[] atoms;
		int page = 1;
		int pageCount;
		int numberOfAtoms = 0;
		// UMLS CUI may have hundreds of atoms, so we've set up a way to page
		// through them here.
		do
		{
			System.out.println("Page " + page);
			System.out.println("***********");
			RestAssured.baseURI = "https://uts-ws.nlm.nih.gov";
			Response response = given()// .log().all()
					.request().with()
					// we need a new service ticket for each call since we're
					// requesting multiple pages.
					.param("ticket", ticketClient.getST(tgt))
					// .param("language", "ENG")
					// .param("ttys","PT")
					// .param("sabs","SNOMEDCT_US")
					.param("pageSize", 1000)
					.param("pageNumber", page).expect().statusCode(200).when().get(path);
			// response.then().log().all();;

			String output = response.getBody().asString();
			Configuration config = Configuration.builder().mappingProvider(new JacksonMappingProvider()).build();
			pageCount = JsonPath.using(config).parse(output).read("$.pageCount");
			atoms = JsonPath.using(config).parse(output).read("$.result", AtomLite[].class);

			for (AtomLite atom : atoms)
			{
				System.out.println("AUI: " + atom.getUi());
				System.out.println("Name: " + atom.getName());
				/*System.out.println("Term Type: " + atom.getTermType());
				System.out.println("Obsolete: " + atom.getObsolete());
				System.out.println("Vocabulary: " + atom.getRootSource());
				System.out.println("UMLS Concept: " + atom.getConcept());
				System.out.println("Source Concept: " + atom.getSourceConcept());
				System.out.println("Source Descriptor: " + atom.getSourceDescriptor());
				System.out.println("Source Code: " + atom.getCode());*/
				System.out.println("Source Language: " + atom.getLanguage());
				System.out.println("-------");
			}

			numberOfAtoms += atoms.length;
			page++;

		}
		while (page <= pageCount);

		System.out.println("Retrieved " + numberOfAtoms + " atoms for " + cui);
	}
	
	public List<AtomLite> retrieveAtomsList(String cui, String language)
	{
		System.out.println("Atom Retrieve Start Time " + new java.util.Date().getTime());
		String path = "/rest/content/current/CUI/" + cui + "/atoms";
		AtomLite[] atoms;
		List<AtomLite> atomsList = new ArrayList<AtomLite>();
		int page = 1;
		int pageCount = 999;
		do
		{
			// If ST is not retrieved, then wait
			if(!ticketClient.hasSTFromQueue())
				continue;
			Response response = null;
			RestAssured.baseURI = "https://uts-ws.nlm.nih.gov";
			System.out.println("Atom Retrieve Start_1 Time " + new java.util.Date().getTime());
			if(language.equals("null"))
				response = given()// .log().all()
						.request().with()
						//.param("ticket", ticketClient.getST(tgt))
						.param("ticket", ticketClient.getSTFromQueue())
						.param("pageSize", 1000)
						.param("pageNumber", page).expect().statusCode(200).when().get(path);
			else
				response = given()// .log().all()
							.request().with()
							//.param("ticket", ticketClient.getST(tgt))
							.param("ticket", ticketClient.getSTFromQueue())
							.param("language", language)
							.param("pageSize", 1000)
							.param("pageNumber", page).expect().statusCode(200).when().get(path);
			System.out.println("Atom Retrieve Start_2 Time " + new java.util.Date().getTime());
			String output = response.getBody().asString();
			System.out.println("Atom Retrieve Start_3 Time " + new java.util.Date().getTime());
			Configuration config = Configuration.builder().mappingProvider(new JacksonMappingProvider()).build();
			System.out.println("Atom Retrieve Start_4 Time " + new java.util.Date().getTime());
			pageCount = JsonPath.using(config).parse(output).read("$.pageCount");
			System.out.println("Atom Retrieve Start_5 Time " + new java.util.Date().getTime());
			atoms = JsonPath.using(config).parse(output).read("$.result", AtomLite[].class);
			System.out.println("Atom Retrieve Start_6 Time " + new java.util.Date().getTime());
			atomsList.addAll(Arrays.asList(atoms));
			page++;

		}
		while (page <= pageCount);
		System.out.println("Atom Retrieve End Time " + new java.util.Date().getTime());
		return atomsList;
	}
}
