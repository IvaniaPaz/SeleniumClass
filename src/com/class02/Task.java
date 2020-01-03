package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.newtours.demoaut.com/");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("firstName")).sendKeys("Ivania");
		driver.findElement(By.name("lastName")).sendKeys("Paz");
		driver.findElement(By.name("phone")).sendKeys("703-474-7810");
		driver.findElement(By.id("userName")).sendKeys("ivaniap53@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("7909 Vernon Dr.");
		driver.findElement(By.name("city")).sendKeys("Fort Washington");
		driver.findElement(By.name("state")).sendKeys("Maryland");
		driver.findElement(By.id("email")).sendKeys("ivaniap53@gmail.com");
		driver.findElement(By.name("password")).sendKeys("ivaniapaz13");
		driver.findElement(By.name("confirmPassword")).sendKeys("ivaniapaz13");
		driver.findElement(By.name("register")).click();
		
		Thread.sleep(2000);
		
		
	}
}
