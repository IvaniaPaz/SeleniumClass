package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

//TC 1:Table headers and rows verification
//1.Open chrome browser
//2.Go to “https://www.aa.com/homePage.do”
//3.Enter From and To
//4.Select departure as May 14 of 2020
//5.Select arrival as November 8 of 2020
//6.Verify “Choose flights” text is displayed
//7.Close browser

public class Homework1 extends CommonMethods{

	public static void main(String[] args) {
	
		setUp("chrome","https://www.aa.com/homePage.do");
		
		driver.findElement(By.id("//input[@id='reservationFlightSearchForm.originAirport']")).click();
		WebElement From=driver.findElement(By.id("//input[@id='reservationFlightSearchForm.originAirport']"));
		From.clear();
		From.sendKeys("DCA");
		
		driver.findElement(By.id("//input[@id='reservationFlightSearchForm.destinationAirport']")).click();
		WebElement To=driver.findElement(By.id("//input[@id='reservationFlightSearchForm.destinationAirport']"));
		To.clear();
		To.sendKeys("MIA");
		
		
	}
}