package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class JSExecutor extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
	
		setUp("chrome",Constants.HRMS_URL);
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement Lbttn=driver.findElement(By.id("btnLogin"));
		//changes color of what you are clicking
		js.executeScript("arguments[0].style.backgroundColor='Pink'", Lbttn);
		Thread.sleep(3000);
		//clicks the button for you
		js.executeScript("arguments[0].click();",Lbttn);	
		Thread.sleep(5000);
		//scrolls down by pixels
		js.executeScript("window.scrollBy(0,250)");
		
		
		
		Thread.sleep(3000);		
		driver.quit();
	}
}
