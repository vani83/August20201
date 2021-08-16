package com.CoreJava;

import java.util.Scanner;

public class StudentGradeCalculation {

	public static void main(String[] args) {
	
		int mark[] = new int[5];
		int i;
		float sum = 0, avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks obtained in 5 subjects : ");
		  sc.close();
	
		for(i=0; i<5; i++)
		{
			mark[i] =sc.nextInt();
			sum = sum + mark[i];
		}
	
       System.out.println("sum of 5 subjects : " + sum);
       
       avg = sum/5;
       System.out.println("Average of subjects is : " + avg);
       if (avg>80)
       {
		System.out.println("Grade : A");
	}
       else if (avg>60 && avg <=80)
       {
		System.out.println("Grade : B");
	}
       else if (avg>40 && avg<=60)
       {
		System.out.println("Grade : C");
	}
       else
	{
     System.out.println("Grade : D");
     
	}  
     sc.close();
  }
	 
	   
}
