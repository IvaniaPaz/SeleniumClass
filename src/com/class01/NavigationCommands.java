package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		// system is a class and set property is a static method

		// key value
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// http - hyper text transfer protocol source
		driver.get("https://www.google.com");
		Thread.sleep(1000); // this will take 2 seconds for your system to navigate to syntax after google

		// browser navigation commands:

		// this will navigate to given URL
		driver.navigate().to("https://www.amazon.com");
		// this will navigate back
		driver.navigate().back();
		// this will navigate one step forward
		driver.navigate().forward();

		//to refresh
		driver.navigate().refresh();
	}
}
