package com.class07;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class HomeWork3 extends CommonMethods{

	public static void main(String[] args) {

		setUp("chrome","https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.xpath("//button[@onclick='swapInput()']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
		


	}

}
