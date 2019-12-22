package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyntaxURL {
//	Task #2: Syntax Page URL Verification: 
//		1.Open Chrome browser
//		2.Navigate to “https://www.syntax.com/”
//		3.Navigate to “https://www.google.com/”
//		4.Navigate back to syntax Page
//		5.Refresh current page
//	    6.Verify URL contains “Syntax”

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver obj=new ChromeDriver();
		//obj.get("https://www.google.com");
		
		obj.navigate().to("https://syntaxtechs.com/");
		obj.navigate().to("https://google.com/");
		obj.navigate().back();
		
		String urlMatch= obj.getCurrentUrl();
		System.out.println(urlMatch);
		//String expectedUrl="https://syntaxtechs.com/";
		
		if(urlMatch.contains("Syntax")) {
			System.out.println("it contains syntax");
		}else {
			System.out.println("it doesn't contain it");
		}
		
		
		obj.close();
		
	}

}
