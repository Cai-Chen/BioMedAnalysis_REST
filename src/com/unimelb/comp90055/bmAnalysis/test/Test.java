/**
 * Created: 30 April 2017
 *
 * @author Cai Chen
 * @version 1.0
 * @description The test class
 */

package com.unimelb.comp90055.bmAnalysis.test;

import static com.jayway.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

public class Test
{

	public static void main(String[] args)
	{
		/*HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("thread 1", "A few people have the obstructive sleep apnea, diabetic foot and kidney stones,plantar fasciitis,subarachnoid hemorrhage,metatarsal fracture,bloom syndrome,Glycogen storage disease,Leigh Syndrome,idiopathic neuropathy,nephritis,systemic,lupus erythematosus,neonatal hypoglycemia");
		map.put("thread 2", "A few people have the plantar fasciitis, subarachnoid hemorrhage and metatarsal fracture.");
		map.put("thread 3", "A few people have the bloom syndrome, Glycogen storage disease and Leigh Syndrome.");
		map.put("thread 4", "A few people have the idiopathic neuropathy, nephritis and systemic lupus erythematosus.");
		map.put("thread 5", "A few people have the obstructive sleep apnea, diabetic foot and neonatal hypoglycemia.");
		
		for (Entry<String, String> entry : map.entrySet())
		{
			TestThread thread = new TestThread(entry.getKey(), entry.getValue(), "Chemicals & Drugs,Disorders", "GER");
			thread.start();
		}*/
		
		String text = "A few people have the obstructive sleep apnea, diabetic foot and kidney stones,plantar fasciitis,subarachnoid hemorrhage,metatarsal fracture,bloom syndrome,Glycogen storage disease,Leigh Syndrome,idiopathic neuropathy,nephritis,systemic,lupus erythematosus,neonatal hypoglycemia";
		String semGroup = "Chemicals & Drugs,Disorders";
		String language = "GER";
		for(int i = 1 ; i <= 100; i++)
			testService(i, text, semGroup, language);
		
	}
	
	private static void testService(int id, String text, String semGroup, String language)
	{
		Log log = LogFactory.getLog("testLog");
		
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
