package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;
import com.utils.Constants;

public class ExplicitWait extends CommonMethods {
	/*Navigate to the page
	 * click on other
	 * select dynamic data loading
	 * click on get now user
	 * validate the first and last name elements are displayed
	 */
	
	public static void main(String[] args) throws InterruptedException {
		
	setUp("chrome",Constants.SYNTAX_PRACTICE_URL);
	driver.findElement(By.linkText("Others")).click();
	driver.findElement(By.linkText("Dynamic Data Loading")).click();
	driver.findElement(By.id("save")).click();
	
	//webdriver wait or explicit wait - wait for specific element to appear on the page
	//it will wait until the expected condition is met or the specified time
	WebDriverWait wait=new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("First-Name")));
	
	boolean displayed=driver.findElement(By.id("First-Name")).isDisplayed();
	if(displayed) {
		System.out.println("Pass");
	}else {
		System.err.println("Failed");
	 }
	Thread.sleep(3000);
	driver.quit();
	}
}
