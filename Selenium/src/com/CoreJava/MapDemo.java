package com.CoreJava;

import java.util.LinkedHashMap;



public class MapDemo {

	public static void main(String[] args)
	
	{
      LinkedHashMap<String, Object> h = new LinkedHashMap<String, Object>();
		
		h.put("EmpId", 1098);
		h.put("EmpName","vani" );
		h.put("Address", "Vizag");
		h.put("ContactNo", 900095322);
		
		System.out.println(h);
		System.out.println(h.get("EmpName"));
		
		System.out.println(h.size());
		System.out.println(h.hashCode());
		System.out.println(h.isEmpty());
		
        
		

	}

}
