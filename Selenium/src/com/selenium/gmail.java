package com.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	public static void main(String[] args) throws InterruptedException
	{	
		//System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement( By.id("identifierId")).sendKeys("vaniyalamanchi@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
	    Thread.sleep(2000);
	    String at = driver.getTitle();
	    String et =  "gmail";
	    driver.close();
	    if(at.equalsIgnoreCase(et))
	    
	    {
	    	
	    	System.out.print("Test Sucessful");
	    }
	    
	    else
	    	
	    {
	    	
	    	System.out.print("Test Failure");
	    }
	
	    }
		
		

	}


