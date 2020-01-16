package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class Homework2 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
	setUp("chrome","https://the-internet.herokuapp.com/");	
	driver.findElement(By.linkText("Dynamic Controls")).click();
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//	driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
	driver.findElement(By.xpath("//button[text()='Remove']")).click();
	WebDriverWait wait= new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[@id='message']")));
	
	driver.findElement(By.xpath("//button[text()='Add']")).click();
	WebDriverWait wait1= new WebDriverWait(driver,30);
	wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[@id='message']")));
	
	String expectedText="It's back!";
	String actualText=driver.findElement(By.xpath("//p[@id='message']")).getText();
	System.out.println(actualText);
	
	if(actualText.equals(expectedText)) {
		System.out.println("Pass");
	}else {
		System.out.println("Failed");
	}
	Thread.sleep(3000);
	driver.quit();
	}
}