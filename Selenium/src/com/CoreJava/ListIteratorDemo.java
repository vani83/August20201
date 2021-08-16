package com.CoreJava;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args)
	{
	
		ArrayList<String> a  = new ArrayList<String>();
		a.add("java");
		a.add("corejava");
		a.add("oracle");
		a.add("softq");
		
		System.out.println(a);
		 ListIterator<String> val = a.listIterator();
		 while (val.hasNext()) 
		 {
			String var = val.next();
			if (var.equals("java"))
			val.set("soft");
			
			else
				val.remove();
			}
		 System.out.println(a);
	}

}
