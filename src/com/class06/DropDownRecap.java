package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class DropDownRecap extends CommonMethods{
public static void main(String[] args) throws InterruptedException {

	setUp("chrome","https://www.ebay.com/");
	WebElement dd=driver.findElement(By.cssSelector("select#'gh-cat'"));
	
	Select obj=new Select(dd);
	List<WebElement>options=obj.getOptions();
	for(WebElement op:options) {
		op.click();
		Thread.sleep(1000);
	}
	Thread.sleep(1000);
	driver.quit();	
 }
}
