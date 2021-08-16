package com.selenium;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 30;
		
		System.out.println("P is True && Q is True : " + ((a<b)&&(b>a)));
		System.out.println("P is true && Q is false : " + ((a<b)&&(b<a)));
		System.out.println("P is false && Q is true : " + ((a>b)&&(b>a)));
		System.out.println("P is false && Q is false : " + ((a>b)&&(b<a)));
		
		System.out.println("    ");

		System.out.println("P is True || Q is True : " + ((a<b)||(b>a)));
		System.out.println("P is true || Q is false : " + ((a<b)||(b<a)));
		System.out.println("P is false || Q is true : " + ((a>b)||(b>a)));
		System.out.println("P is false || Q is false : " + ((a>b)||(b<a)));;
		
	}

}