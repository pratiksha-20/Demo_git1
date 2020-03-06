package com.jbk;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class Json_Write {
	@Test
	public void test() throws FileNotFoundException
	{
		 // creating JSONObject
	JSONObject jo=new JSONObject();
	   // putting data to JSONObject 
	jo.put("firstName", "pratiksha");
	jo.put("lastName", "Gunjal");
	jo.put("age", "24");
    // for address data, first create LinkedHashMap 
	Map m=new LinkedHashMap(4);
	m.put("streetAddess","Gunjalwadi");
	m.put("city","sangamner");
	m.put("state","maharashatra");
	m.put("postalcode","422605");
	jo.put("address",m);
	
	   
    // for phone numbers, first create JSONArray 
	JSONArray ja=new JSONArray();
	m=new LinkedHashMap(2);
	m.put("type","home");
	m.put("number", "02425");
    // adding map to list 
	ja.put(m);
	m=new LinkedHashMap(2);
	m.put("type", "fax");
	m.put("number", "123456");
	//adding map to list
	ja.put(m);
	   // putting phoneNumbers to JSONObject
	jo.put("phonenumber", ja);
	// writing JSON to file:"JSONExample.json" in cwd 
	PrintWriter pw=new PrintWriter("jsonnn.json");
	pw.write(jo.toString());
	pw.flush();
	pw.close();
	
	
	
	
	
	
	
		
	}

}
