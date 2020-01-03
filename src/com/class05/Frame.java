package com.class05;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Frame extends CommonMethods {
	public static final String SYNTAX_URL_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";

	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUp("chrome", SYNTAX_URL_PRACTICE_URL);

		/*
		 * Opening the web page, the focus of webdriver will be in the main window by
		 * default some actions in the main window, I'm getting some text from the main
		 * window Now I want to do some action inside the frame now I have to switch to
		 * that frame Now here inside the frame I want to do some other actions
		 */

		driver.findElement(By.linkText("Others")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Iframe")).click();

		//this is a main window text
		String MainWText = driver.findElement(By.xpath("//h2[text()='IFrame practice']")).getText();
		System.out.println("this text is from main window :" + MainWText); // printing out main window text
		Thread.sleep(1000);
		driver.switchTo().frame("FrameOne"); // you can switch frame by string,index,or web element=xpath
		String frameText = driver.findElement(By.xpath("//h4[text()='Practice Selenium Automation Testing Online']")).getText();
		System.out.println("inside the frame text says :" + frameText);
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		boolean TD = driver.findElement(By.xpath("//h2[text()='IFrame practice']")).isDisplayed();
		System.out.println(TD);
		

	}
}
