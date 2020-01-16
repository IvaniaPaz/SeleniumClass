package com.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class Task2 extends CommonMethods{
//	Open chrome browser
//	Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
//	Login to the application
//	Verify customer “Susan McLaren” is present in the table
//	Click on customer details
	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		String expectedValue="Susan McLaren";
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		for(int i=1;i<rows.size();i++) {
			String rowText=rows.get(i-1).getText();
			if(rowText.contains(expectedValue)) {
				driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+i+"]/td[i]")).click();
				break;
			}
   }
		Thread.sleep(4000);
		driver.quit();
 }
}