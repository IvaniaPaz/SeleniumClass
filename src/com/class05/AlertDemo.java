package com.class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class AlertDemo extends CommonMethods{
	
	public static final String SYNTAX_URL_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";

	public static void main(String[] args) throws InterruptedException {
		//the method is opening syntax practice website using chrome browser 
		CommonMethods.setUp("chrome", SYNTAX_URL_PRACTICE_URL);
		Thread.sleep(2000);
		//find the element alerts and modals and clicking on it
		driver.findElement(By.xpath("//a[@href='#' and text()='Alerts & Modals']")).click();
		//finding Javascript alerts and clicking on it
		driver.findElement(By.linkText("Javascript Alerts")).click();
		//finding the button and click on it
		driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
		Thread.sleep(2000);
		
		
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		
		//get text from the alert box. Before you hand the alert
		System.out.println("Alert text:  "+alert.getText());
		
		//accept alert any positive action. it could be OK, Yes, Accept, proceed.
		alert.accept();
		Thread.sleep(2000);
		
		
		//get the text from the UI or main window
		String text=driver.findElement(By.xpath("//p[text()='Click the button to display an alert text']")).getText();
		System.out.println(text);
		
		
		
		
	}
}
