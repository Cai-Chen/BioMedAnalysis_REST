package com.unimelb.comp90055.bmAnalysis.test;

import java.util.HashMap;
import java.util.Map.Entry;

public class Test
{

	public static void main(String[] args)
	{
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("thread 1", "A few people have the obstructive sleep apnea, diabetic foot and kidney stones.");
		map.put("thread 2", "A few people have the plantar fasciitis, subarachnoid hemorrhage and metatarsal fracture.");
		map.put("thread 3", "A few people have the bloom syndrome, Glycogen storage disease and Leigh Syndrome.");
		map.put("thread 4", "A few people have the idiopathic neuropathy, nephritis and systemic lupus erythematosus.");
		map.put("thread 5", "A few people have the obstructive sleep apnea, diabetic foot and neonatal hypoglycemia.");
		
		for (Entry<String, String> entry : map.entrySet())
		{
			TestThread thread = new TestThread(entry.getKey(), entry.getValue(), "Chemicals & Drugs,Disorders", "ENG");
			thread.start();
		}
		
	}

}
