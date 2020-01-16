package com.class11;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

//TC 1: Upload file and Take Screenshot
//
//Navigate to “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
//Upload file
//Verify file got successfully uploaded and take screenshot

public class Homework1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		setUp("chrome", "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload");
		driver.findElement(By.xpath("//input[@id='gwt-debug-cwFileUpload']"))
				.sendKeys("C:\\\\Users\\\\Ivania Paz\\\\Desktop\\\\ivania.png");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@class='gwt-Button']")).click();

		Alert alert = driver.switchTo().alert();
		String alertTxt = alert.getText();
		alert.accept();
		System.out.println("this alert text box contains: " + alertTxt);

		WebElement upload = driver.findElement(By.xpath("//button[@type='button']"));
		if (upload.isDisplayed()) {
			System.out.println("Verification success!");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screen = ts.getScreenshotAs(OutputType.FILE);

			try {
				FileUtils.copyFile(screen, new File("Screenshots//Homework1//fileupload.png"));

			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.err.println("Unsuccessfull,Keep trying!");
		}
		Thread.sleep(3000);
		driver.quit();
	}
}