package com.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class DropDownDemo extends CommonMethods {
	public static final String SYNTAX_URL_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";

	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", SYNTAX_URL_PRACTICE_URL);
		driver.findElement(By.linkText("Input Forms")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Select Dropdown List")).click();
		WebElement weekDropDown= driver.findElement(By.id("select-demo"));
		Select select=new Select(weekDropDown);
		
		/*We can select values from DD in 3ways
		 * by index
		 * by visible text
		 * by value attribute and you have to pass the value
		 */
		
		select.selectByIndex(4);
		Thread.sleep(2000);
		select.selectByVisibleText("Sunday");
		Thread.sleep(2000);
		select.selectByValue("Friday");
		
		//to find the size of the drop down 
		List<WebElement> option=select.getOptions();
		System.out.println(option.size());
		
		//select.deselectByIndex(4); with single select DD you cannot deselect a value
		
		System.out.println("Is this DD mutli-select? "+select.isMultiple()); //boolean value..is it multi-select? if it's true=yes, no =false
		System.out.println("--------------");
		
		WebElement multiDD=driver.findElement(By.id("multi-select"));
		Select select2=new Select(multiDD);
		select2.selectByIndex(2);
		select2.selectByIndex(3);
		select2.selectByIndex(4);
		select2.deselectByIndex(3);
		
		
		
		
	}
}
