package com.CoreJava;

public class ChildClass extends FirstAbstract
{

	public static void main(String[] args) {
		
		ChildClass c = new ChildClass();
		 c.m1();
		 c.m2();
		 

	}

	@Override
	public void m2() {
		System.out.println("i am m2 overrider from childclass...");
	}

}
