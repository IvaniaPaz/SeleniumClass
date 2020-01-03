package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class Task extends CommonMethods {
	
//	TC 2: Radio Buttons Practice  
//	Open chrome browser
//	Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//	Click on “Input Forms” links
//	Click on “Radio Buttons Demo” links
//	Click on any radio button in “Radio Button Demo” section.
//	Verify correct checkbox is clicked
//	Click on any radio button in “Group Radio Buttons Demo” section.
//	Verify correct checkbox is clicked
//	Quit browser
//	Collapse
	public static void main(String[] args) {
		
	CommonMethods.setUp("chrome", "http://jiravm.centralus.cloudapp.azure.com:8081/index.html");	
	
	WebElement inputForms= driver.findElement(By.xpath("//a[text()='Input Forms']"));
	inputForms.click();
	
	driver.findElement(By.linkText("Radio Buttons Demo")).click();
	WebElement femaleButton=driver.findElement(By.xpath("//input[@type='radio' and @value='Female' and @name='optradio']"));
	femaleButton.click();
		
		
	}
}
