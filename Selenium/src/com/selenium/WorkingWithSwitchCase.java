package com.selenium;

public class WorkingWithSwitchCase {

	public static void main(String[] args) {
		
		int x = 5;
		
		switch (x) {
		
		case 1: System.out.println("Value of x is 1");
		     break;
		case 2: System.out.println("Value of x is 2");
		     break;
		case 3: System.out.println("Value of x is 3");
		     break;
		case 4: System.out.println("Value of x is 4");
		      break;
		case 5: System.out.println("Value of x is 5");
	      break;
		case 6: System.out.println("Value of x is 6");
		      break;
		case 7: System.out.println("Value of x is 7");
		
	         	break;

		default: System.out.println("Value of x is not found");
			break;
		}

	}

}
