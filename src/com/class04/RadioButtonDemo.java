package com.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class RadioButtonDemo  extends CommonMethods{
	public static final String SYNTAX_URL_PRACTICE_URL="http://166.62.36.207/syntaxpractice/index.html";
	
	public static void main(String[] args) throws InterruptedException {
	//opening browser with url	
	CommonMethods.setUp("chrome", SYNTAX_URL_PRACTICE_URL);	
	driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
	Thread.sleep(1000);
//	driver.findElement(By.xpath("//a[text()='Input Forms']//following::a[3]"));
	driver.findElement(By.linkText("Radio Buttons Demo")).click();	
		
	WebElement maleRadio=driver.findElement(By.xpath("//input[@name='optradio' and @value='Male'"));	
	
	System.out.println(maleRadio.isSelected()); //false
	maleRadio.click();	
	System.out.println(maleRadio.isSelected()); //true
	System.out.println("--------------------------");	
	
	
	List<WebElement> radioButtons=driver.findElements(By.name("otpradio"));
	
	for(int i=0; i<radioButtons.size();i++) {
		
			radioButtons.get(i).click();
		}
	}
}
