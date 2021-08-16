package com.CoreJava;

import com.selenium.WorkingWithMethod1;

public class WorkingWithMethod {

	
public static void test () {
		System.out.println("This is the Test Method");
	}
	public static void main(String[] args) {
		
//calling the method in different package
		WorkingWithMethod1.ADD();
		WorkingWithMethod1.SUB();
		WorkingWithMethod1.MUL();
	}

}
