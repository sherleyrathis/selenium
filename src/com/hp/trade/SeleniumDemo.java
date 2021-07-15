package com.hp.trade;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	//Webdriver methods
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sherl\\eclipse-workspace\\Selenium_Class\\driver\\chromedriver.exe");
			//parent				//child
			WebDriver driver =new ChromeDriver();//upcasting
			
			driver.get("https://www.myntra.com/");
			
			//maximize the chrome window
			driver.manage().window().maximize();
			
			String title = driver.getTitle();
			System.out.println(title);

			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
			
			//String pageSource = driver.getPageSource();
			//System.out.println(pageSource);
							//to--->navigate to next URL
			driver.navigate().to("https://www.myntra.com/shop/kids");
			//back-->back to previous page
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
			//close-->it close the current tab
			//quit-->it will close the browser
			driver.quit();
			
		}
}
