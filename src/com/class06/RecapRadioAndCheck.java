package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class RecapRadioAndCheck extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
	
		setUp("chrome", "http://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//handle 1 radio or checkbox
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		//handle group of radio or checkbox
		List<WebElement> allChBoxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));
		
		for(WebElement el:allChBoxes) {
			
			String text=el.getAttribute("value");
			System.out.println("Text from a checkbox"+text);
			
			el.click();
			Thread.sleep(1000);
		}
	
		Thread.sleep(2000);
		driver.quit();
	
	
	
	
	
	
	
	
	
	}
}
