package com.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class DropDownRecap extends CommonMethods {
	public static final String SYNTAX_URL_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";

	public static void main(String[] args) throws InterruptedException {

		// The method is opening Syntax practice website using chrome browser
		CommonMethods.setUp("chrome", SYNTAX_URL_PRACTICE_URL);

		// find the element input form and click on it
		driver.findElement(By.linkText("Input Forms")).click();
		Thread.sleep(2000);
		// find the element select drop down list and click on it
		driver.findElement(By.linkText("Select Dropdown List")).click();

		WebElement dd = driver.findElement(By.id("select-demo"));

		// to work with dd, if the tagname starts with select, then we have to create an
		// object of select class
		Select select = new Select(dd); // this select class will identify the parent element
		select.selectByIndex(3);
		// Selecting value by visible text
		select.selectByVisibleText("Friday");
		// Selecting an item from the drop down list using value attribute
		select.selectByValue("Sunday");

		// how to get the count of a drop down items?
		List<WebElement> options = select.getOptions();
		// this will give you the number of items present in dd
		System.out.println(options.size());
		
		//Storing the list of options in iterator so we can loop through
		Iterator<WebElement> op = options.iterator();
		while (op.hasNext()) { //loop through iterator if it has next element
			op.next().click();
			Thread.sleep(2000);	
		}
		
		System.out.println("Does this dd support multi-select? "+select.isMultiple());
		driver.close();
	}
}