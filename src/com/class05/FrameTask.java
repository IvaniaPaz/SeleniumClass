package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class FrameTask extends CommonMethods{
	public static final String SYNTAX_URL_PRACTICE_URL = "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
	
		CommonMethods.setUp("chrome", SYNTAX_URL_PRACTICE_URL);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Others")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Iframe")).click();
		driver.switchTo().frame("FrameOne");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("FrameTwo");
		WebElement text=driver.findElement(By.xpath("//img[@src='https://syntaxtechs.com/wp-content/uploads/2018/12/syntax-logo.png']"));
		System.out.println(text.isDisplayed());
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}
}
