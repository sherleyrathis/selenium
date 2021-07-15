package com.hp.trade;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebElement {

	public static void main(String[] args) {
		// WebElements
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sherl\\eclipse-workspace\\Selenium_Class\\driver\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.instagram.com/");
			
			driver.manage().window().maximize();
			//pass the username
			WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
			user.sendKeys("sher@gmail.com");
			
			WebElement pass = driver.findElement(By.name("password"));
			pass.sendKeys("1234");
			 
			driver.findElement(By.)
			
			
	
	}
}
