package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTask {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("pazvanita1@hotmail.com");
		driver.findElement(By.name("pass")).sendKeys("Ivanianpaz13!");
		driver.findElement(By.id("u_0_b")).click();
		
		
		
		
		
	}
}
