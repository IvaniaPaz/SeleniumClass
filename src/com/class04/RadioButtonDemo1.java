package com.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class RadioButtonDemo1 extends CommonMethods {

	public static final String SYNTAX_URL_PRACTICE_URL="http://166.62.36.207/syntaxpractice/index.html";
	
	public static void main(String[] args) throws InterruptedException {
		//Opening browser with url
		CommonMethods.setUp("chrome", SYNTAX_URL_PRACTICE_URL);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		
		//find group of web element of type radio button
		List<WebElement> radioButtons=driver.findElements(By.name("optradio"));
		
		for(WebElement element:radioButtons) {
			String text=element.getAttribute("value");
			if(text.equals("")) {
				
			}
		}
		
	}

}
