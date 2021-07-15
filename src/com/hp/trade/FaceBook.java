package com.hp.trade;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaceBook extends BaseClass {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		driver=browserLaunch("chrome");
		opentheUrl("");
		driver.manage().window().maximize();
	
	WebElement username=driver.findElement(By.name("username"));
	passtheValues(username,"sher123@gmail.com");
	
	WebElement password=driver.findElement(By.name("password"));
	passtheValues(password,"12345");
	
	//WebElement login =driver.findElement(By.xpath("//button[@type='submit']"));
	//clickonElement(login);
	

}
}