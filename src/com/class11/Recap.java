package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utils.CommonMethods;

public class Recap extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome","https://google.com");
		driver.findElement(By.name("q")).sendKeys("iPhone 11 pro",Keys.ESCAPE);
		Thread.sleep(5000);
		Actions act=new Actions(driver);	
		//identify an element
		WebElement button=driver.findElement(By.name("btnK"));
		
		//1st way 
//		act.moveToElement(button).click().perform();
		
		//2nd way
		act.click(button).perform();
		Thread.sleep(3000);
		driver.quit();
 }
}