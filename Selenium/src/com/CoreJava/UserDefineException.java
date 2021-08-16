package com.CoreJava;

import java.util.Scanner;


public class UserDefineException extends Exception
{
	
	public UserDefineException(String msg) 
	{
		super();
	}

	public static void main(String[] args)  {
		
		String str = null;
		Scanner sc  = new Scanner(System.in);
	
		
		while (true) 
		{
			System.out.println(" Enter 10 charater string : ");
			str = sc.next();
			sc.close();
			
			try {
				if (str.length() != 10) {
					throw new UserDefineException("string should be 10 charater string");
				}

				else {
					System.out.println("Entered the string : " + str);
				break;
				}
				
			} 
			
			catch (UserDefineException e) 
			{
				e.printStackTrace();
			} 
		}
	}

}
