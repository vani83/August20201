package com.CoreJava;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) 
	
	{
		ArrayList<Object> a = new ArrayList<Object>();
		a.add(10);
		a.add("vani");
		a.add(20);
		a.add(30);
		a.add(10);
		a.add("krishna");
		a.add(12.34f);
		 
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.size());
        System.out.println(a.isEmpty());
        
        System.out.println(a.indexOf("vani"));
        System.out.println(a.contains("vani"));

	}

}
