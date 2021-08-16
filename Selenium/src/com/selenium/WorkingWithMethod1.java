package com.selenium;

public class WorkingWithMethod1 {
	
	
    public static void ADD() {
	int a = 20;
	int b = 30;
	System.out.println("Addition of two values :" + (a+b));
}
    public static void SUB() {
	int a = 500;
	int b = 30;
	System.out.println("Subtration of two values :" + (a-b));
}
    public static void MUL() {
	int a = 20;
	int b = 30;
	System.out.println("Multiplication of two values :" + (a*b));
}

	public static void main(String[] args) {
		ADD();
		SUB();
		MUL();

	}

}
