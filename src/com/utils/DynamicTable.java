package com.utils;

import org.openqa.selenium.By;

public class DynamicTable extends CommonMethods{
	public static void main(String[] args) throws InterruptedException {
		setUp("chrome",Constants.HRMS_URL);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='menu_recruitment_viewRecruitmentModule']/b")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(4000);
		driver.quit();
	}
}
