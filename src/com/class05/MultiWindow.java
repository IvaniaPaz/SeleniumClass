package com.class05;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class MultiWindow extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", "http://accounts.gooogle.com/signup");
		Thread.sleep(2000);
		System.out.println("Title of the main window"+driver.getTitle());
		
		driver.findElement(By.linkText("Help")).click();
		
		//to get the ID of each windows we use getWindowHandle();
		Set<String> allWindowsID=driver.getWindowHandles(); //this will give me the windows
		System.out.println("How many windows currently open? "+allWindowsID.size());// how many windows are open
		
		Iterator<String> it=allWindowsID.iterator();
		String parentWindow=it.next();
		String childWindow=it.next();
		
		System.out.println("Parent ID: "+parentWindow);
		System.out.println("Child ID: "+childWindow);
		
		driver.switchTo().window(childWindow);
		
		System.out.println("Title of child window: "+driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\\\"seach-form\"]/input[1]")).sendKeys("Window practice");
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}
}
