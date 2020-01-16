package com.class10;

import org.openqa.selenium.By;

import com.utils.CommonMethods;
import com.utils.Constants;

//TC 
//2: HRMS Login
//3.Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//4.Login to the application by writing xpath based on “following and preceding siblings”

public class ClassTask2 extends CommonMethods{

	public static void main(String[] args) {
		
		setUp("chrome",Constants.HRMS_URL);
		driver.findElement(By.xpath("//span[@class='form-hint']/preceding-sibling:: input[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//span[@class='form-hint']/preceding-sibling::input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//input[@class='button']")).click();
		driver.quit();
	
	}
}
