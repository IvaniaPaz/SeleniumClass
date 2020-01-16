package com.review;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Alert extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome","");
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(3000);
		
		acceptAlert();
	
	}
}
