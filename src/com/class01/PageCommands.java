package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); //when you create a new class always add this
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://www.amazon.com");
		
		final String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("The actual and expected title did match");
		}else {
			System.err.println("The actual and expected title didn't match");
		}
		System.out.println("***********************");
		
		String actualUrl=driver.getCurrentUrl();
		
		System.out.println(actualUrl);
		String expectedUrl="https://www.amazon.com/";
		
		
		if(expectedUrl.equals(actualUrl)) {
			System.out.println("Both URL matched");
		}else {
			System.err.println("Actual and expected URl didn't match");
		}
		
		
		driver.close();
		
		
		
	}

}
