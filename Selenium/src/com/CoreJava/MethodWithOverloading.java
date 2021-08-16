package com.CoreJava;

public class MethodWithOverloading {
	
       public void m1(int x)
       {  
		System.out.println(x);
		
       }
       public void m1(float x)
       {  
   		System.out.println(x);
   		
       }
       public void m1(String x)
       {  
   		System.out.println(x);
   		
       }
       public void m1(Number x)
       {  
   		System.out.println(x);
   		
       }
       public void m1(Integer x)
       {  
   		System.out.println(x);
   		
       }
       public void m1(Object x)
       {  
   		System.out.println(x);
   		
       }
       
       
	public static void main(String[] args) 
	{
		MethodWithOverloading obj = new MethodWithOverloading();
		obj.m1(100);
		obj.m1(19.898f);
		obj.m1(19440);
		obj.m1("vani");
		obj.m1("chennupati");
		obj.m1(128.39f);
				
				
	}

}
