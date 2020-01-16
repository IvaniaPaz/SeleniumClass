package com.class09;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utils.CommonMethods;
import com.utils.Constants;

public class ScreenShot extends CommonMethods {

	public static void main(String[] args) {

		setUp("chrome", Constants.HRMS_URL);
		// login into HRMS
		String userName = "Admin";
		String passWord = "Hum@nhrm123";
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(passWord);
		driver.findElement(By.id("btnLogin")).click();

		String welcomeText = driver.findElement(By.id("welcome")).getText();
		if (welcomeText.contains(userName)) {
			System.out.println("Test pass");

			TakesScreenshot ts = (TakesScreenshot) driver;
			File screen = ts.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screen, new File("Screenshots/HMRS/Adminlogin.jpg"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Test fail");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screen = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screen, new File("Screenshots/HMRS/Wronglogin.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		driver.quit();
	}
}
