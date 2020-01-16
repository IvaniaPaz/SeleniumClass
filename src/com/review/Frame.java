package com.review;

import org.openqa.selenium.By;

import com.utils.CommonMethods;
import com.utils.Constants;

public class Frame extends CommonMethods{
	public static void main(String[] args) throws InterruptedException {
		setUp("chrome", Constants.AMAZON_URL);
		Thread.sleep(3000);
		switchToFrame(driver.findElement(By.xpath("//div[@id='ape_Gateway_right-2_desktop_placement']/iframe")));
		/*
		 * xpath to locate frame
		 * div[@id='ape_Gateway_right-2_desktop_placement']/iframe
		 */
		driver.findElement(By.className("clickthrough")).click();

	}

}
