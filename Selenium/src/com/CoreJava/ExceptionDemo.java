package com.CoreJava;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		int nr, dr, result;
		Scanner sc = new Scanner(System.in);
		
		
		while (true)
		{
			System.out.println("Enter the nr value : ");
			nr = sc.nextInt();
			System.out.println("Enter the dr vale : ");
			dr = sc.nextInt();
			
			try {
				result = nr / dr;
				System.out.println("The vale is :" + result);
              
				break;
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			} 
		}sc.close();
	}
		
		

}
