package com.CoreJava;

public class Hdfc implements Rbi
{

	public static void main(String[] args) {
		
		Hdfc j = new Hdfc();
		j.deposit();
		j.withdrawl();

	}

	@Override
	public void withdrawl() {
		System.out.println("i am overriden withdrawl from HDFC");
		
	}

	@Override
	public void deposit() {
		System.out.println("i am overriden deposit  from HDFC");
		
	}

}
