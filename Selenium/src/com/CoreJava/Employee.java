package com.CoreJava;

public class Employee {
	
	int ENo;
	String EName;
	
	public Employee()
	{
	System.out.println("I am Testing");
	
	}
	
	

	public Employee(int ENo,String EName)
	{
		this.ENo = ENo;
		this.EName = EName; 
	
	}
	
	public Employee(int ENo)
	{
		this.ENo = ENo;
		
	}
	public static void main(String[] args) {
	Employee E1 = new Employee();
	System.out.println("----------------");
	
	System.out.println(E1.ENo);
	System.out.println(E1.EName);
	System.out.println("----------------");

	Employee E2 = new Employee(1234);
	System.out.println(E2.ENo);
	System.out.println(E2.EName);
	System.out.println("----------------");
	Employee E3 = new Employee(12345, "Vani");
	System.out.println(E3.ENo);
	System.out.println(E3.EName);
	System.out.println("----------------");
	
	
	}

}
