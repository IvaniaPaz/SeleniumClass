package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
	public static final String URL = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");// path of the value
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		
		WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		//storing it in a variable to be able to reuse
		userName.sendKeys("Admin");
		Thread.sleep(1000);
		
		userName.clear();  // will perfom a function of clearing text boxes or areas
		userName.sendKeys("Helen");
		
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("helen@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		WebElement errorMessage=driver.findElement(By.xpath("//span[@id='spanMessage']"));
		System.out.println(errorMessage.isDisplayed());
		String errorMSG=errorMessage.getText();
		
		System.out.println(errorMSG);
		
		  if(errorMessage.isDisplayed()) {
			String message=  errorMessage.getText();
			  if(message.equals("Invalid credntials")) {
				  System.out.println("correct Error messahe is Displayed");
			  }else {
				  System.err.println("wrong message is Displayed");
			  }
			  }
	}
		
	}