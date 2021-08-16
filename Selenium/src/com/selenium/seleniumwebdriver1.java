package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumwebdriver1 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
WebDriver driver = new  ChromeDriver();
driver.get("https://www.lazada.com.my/");
Thread.sleep(3000);
driver.manage().window().maximize();
Thread.sleep(3000);
driver.findElement(By.id("q")).sendKeys("face mask");
Thread.sleep(3000);
driver.findElement(By.className("search-box__button--1oH7")).click();
Thread.sleep(5000);
driver.quit();
	



	}

}
