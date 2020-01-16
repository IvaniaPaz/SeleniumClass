package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class Homework1 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
	setUp("chrome","https://the-internet.herokuapp.com/");
	driver.findElement(By.linkText("Dynamic Loading")).click();
	driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
	driver.findElement(By.xpath("//button[text()='Start']")).click();
	
	WebDriverWait obj=new WebDriverWait(driver,30);
	obj.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
	
	boolean displayed=driver.findElement(By.xpath("//h4[text()='Hello World!']")).isDisplayed();
	
	if(displayed) {
		System.out.println("Test case passed");
	}else {
		System.err.println("Something is wrong");
	}
	
	Thread.sleep(2000);
	driver.quit();
		
	}
}
