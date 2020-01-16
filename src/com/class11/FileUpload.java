package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class FileUpload extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome", "https://the-internet.herokuapp.com");
		driver.findElement(By.linkText("File Upload")).click();
		// to upload file you can use sendKeys(); method and provide FULL path to the
		// file
//		driver.findElement(By.id("file-upload"))
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Ivania Paz\\Desktop\\ivania.png");
		Thread.sleep(3000);

		// clicking on the upload button
		driver.findElement(By.id("file-submit")).click();

		// verify element file upload is displayed
		WebElement upload = driver.findElement(By.xpath("//div[@id='uploaded-files']/preceding-sibling::h3"));

		if (upload.isDisplayed()) {
			System.out.println("File successfully uploaded!");

			TakesScreenshot ts = (TakesScreenshot) driver;
			File screen = ts.getScreenshotAs(OutputType.FILE);

			try {
				FileUtils.copyFile(screen, new File("Screenshots//FileUpload//uploadedsuccess.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {
			System.err.println("File unsuccessfully uploaded");
		}

		Thread.sleep(2000);
		driver.quit();
	}
}
