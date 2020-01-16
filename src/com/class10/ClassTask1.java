package com.class10;

import org.openqa.selenium.By;

import com.utils.CommonMethods;
import com.utils.Constants;

//TC
//1: HRMS Login1.Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//2.Login to the application by writing xpath based on “parent and child relation”
public class ClassTask1 extends CommonMethods{

	public static void main(String[] args) {
		setUp("chrome",Constants.HRMS_URL);
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
//		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.xpath("//div[@class='textInputContainer']/input[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//div[@id='divPassword']/input[1]")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//div[@id='divLoginButton']/input[1]")).click();
		driver.quit();
	}
}