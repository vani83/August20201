package com.CoreJava;

public abstract class FirstAbstract {
	
	int x = 100;
	
	public void m1() {
		
		System.out.println("i am m1 concret from FirstAbstract");
	}
	
	public abstract void m2();
	
	public static void main(String[] args) {
		
		FirstAbstract i = new ChildClass();
		i.m1();
		i.m2();
	}
		
		
	

}


