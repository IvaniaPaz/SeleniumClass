package com.class06;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class MultipleWindows extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","http://jiravm.centralus.cloudapp.azure.com:8081/window-popup-modals-demo.html");
		//store 1 parent id
		String mainW=driver.getWindowHandle();	
		
		driver.findElement(By.linkText("Follow On Instagram")).click();
		driver.findElement(By.linkText("Like us on Facebook")).click();
		driver.findElement(By.linkText("Follow Instagram & Facebook")).click();
		
		//collect all window id
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows.size());
		
		Iterator<String> it= allwindows.iterator();
		// This function can perform any operation you want to do
		while(it.hasNext()) {
			String child=it.next();
			if(!child.equals(mainW)) {
				driver.switchTo().window(child);
				System.out.println(driver.getTitle());
				driver.close();
				driver.switchTo().window(mainW);
			}
		}
		Thread.sleep(2000);
		driver.close();
	
	}
}
