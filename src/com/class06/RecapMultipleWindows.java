package com.class06;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class RecapMultipleWindows extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome","http://jiravm.centralus.cloudapp.azure.com:8081/window-popup-modals-demo.html");
		driver.findElement(By.linkText("Follow On Instagram")).click();
		/*1 get windowHandles()
		 * identify parent and child
		 * switch
		 */
		Set<String>allWindows=driver.getWindowHandles();
		Iterator<String> stringIt=allWindows.iterator();
		String parent=stringIt.next();
		String child=stringIt.next();
	
		driver.switchTo().window(child);
		String childTitle=driver.getTitle();
		System.out.println(childTitle);
		
		driver.switchTo().window(parent);
		String parentTitle=driver.getTitle();
		System.out.println(parentTitle);
	
		Thread.sleep(3000);
		driver.quit();
	}
}
