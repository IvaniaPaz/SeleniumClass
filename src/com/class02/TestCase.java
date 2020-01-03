package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Jane");
//		driver.findElement(By.name("reg_email_")).sendKeys("janesmith@hotmail.com");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ivy123!");
//		driver.findElement(By.name("websubmit")).click();

		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Jane");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Doe");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("Jane.doe@gmail.com");
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();
	}
}
