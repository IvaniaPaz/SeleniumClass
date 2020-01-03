package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
	
	public static void main(String[] args) {
	
       System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sohilaryan");
		
		
		
		
		
	}
}
