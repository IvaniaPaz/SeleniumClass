package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {
	
//	Task #1 Amazon Page Title Verification: 
//	1.Open Chrome browser
//	2.Go to “https://www.amazon.com/”
//	3.Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” 
//	is displayed

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver1= new ChromeDriver();
		driver1.get("https://www.amazon.com");
		
	final String expectedTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		String actualTitle=driver1.getTitle();
		
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("they matched");
		}else {
			System.err.println("try again");
		}
		
		driver1.close();
		
		
	}

}
