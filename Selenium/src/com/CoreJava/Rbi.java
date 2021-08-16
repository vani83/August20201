package com.CoreJava;

public interface Rbi {
	
	void withdrawl();
	void deposit();
	
public static void main(String[] args) {
	Rbi i;
	i = new Icici();
	i.deposit();
	i.withdrawl();
	
	i = new Hdfc();
	i.deposit();
	i.withdrawl();
}
}
