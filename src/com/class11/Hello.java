package com.class11;

import org.openqa.selenium.By;

import com.utils.CommonMethods;
import com.utils.Constants;

public class Hello extends CommonMethods{

	public static void main(String[] args) {
		
		setUp("chrome",Constants.HRMS_URL);
		driver.findElement(By.xpath("//span[@class='form-hint']/preceding-sibling:: input[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//span[@class='form-hint']/preceding-sibling::input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//input[@class='button']")).click();
		
		driver.findElement(By.linkText("Syntax Technologies"));
	}
}
