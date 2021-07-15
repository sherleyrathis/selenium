package com.hp.trade;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
//webdriver methods
	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("CHrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sherl\\eclipse-workspace\\Selenium_Class\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.out.println("invalid");
		}
		//maximize the browser
		driver.manage().window().maximize();
		return driver;
	}
		public static void closethePage(){
			driver.close();//close
		}
		public static void quittheBrowser(){
			driver.quit();//quit
	}
		public static void opentheUrl(String str) {
			driver.get(str);//get
			}
		//public static void currentTitle(String st) {
			//driver.getTitle(st);//gettitle
		//}
		//public static void openCurrentUrl(String s) {
			//driver.getCurrentUrl(s);//getcurrent url
			//}
		public static void backendCoding() {
			driver.getPageSource();//getpagesource
		}
		//web Element Methods
		public static void clickonElement(WebElement element) {
		element.click();	
			}
		public static  void passtheValues(WebElement ele, String str) {
			ele.sendKeys(str);
		}
		
		
}