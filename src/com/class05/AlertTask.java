package com.class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class AlertTask extends CommonMethods {
public static final String SYNTAX_URL_PRACTICE_URL = "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";

	public static void main(String[] args) throws InterruptedException {
		
	CommonMethods.setUp("chrome", SYNTAX_URL_PRACTICE_URL);
	driver.findElement(By.xpath("//a[@href='#' and text()='Alerts & Modals']")).click();
	driver.findElement(By.linkText("Javascript Alerts")).click();
	driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
	Thread.sleep(2000);
	
	Alert alert=driver.switchTo().alert();
	Thread.sleep(2000);
	System.out.println(alert.getText());	
	alert.accept();
	Thread.sleep(2000);
	
	String text = driver.findElement(By.xpath("//p[text()='Click the button to display an alert box:']")).getText();
	System.out.println(text);
		
		
		
	}
}
