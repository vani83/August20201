package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException
	{
      WebDriver driver;
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
   
          driver.get("https://www.facebook.com");
          driver.manage().window().maximize();
          Thread.sleep(3000);



	}

}
