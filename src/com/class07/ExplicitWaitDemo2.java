package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class ExplicitWaitDemo2 extends CommonMethods{
	public static void main(String[] args) throws InterruptedException {
	setUp("chrome","https://google.com");
	driver.manage().window().maximize();
	//send wegmans text and hit enter
	driver.findElement(By.name("q")).sendKeys("Wegmans", Keys.ENTER);
	//click on the first link on results page
	driver.findElement(By.xpath("//h3[@class='LC20lb']")).click();
	//click on login
	
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("sign-in")));
	
	driver.findElement(By.id("sign-in")).click();
	
	Thread.sleep(3000);
	driver.quit();		
	}
}
