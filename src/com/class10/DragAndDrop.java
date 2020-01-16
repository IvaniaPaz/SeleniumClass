package com.class10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utils.CommonMethods;

//TC 1: Drag and Drop verification
//1.Open chrome browser
//2.Go to “https://jqueryui.com/”
//3.Click on “Droppable” link
//4.Using mouse drag “Drag me to my target” to the “Drop Here”
//5.Close the browser

public class DragAndDrop extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		setUp("chrome", "https://jqueryui.com/");
		driver.findElement(By.linkText("Droppable")).click();

		Thread.sleep(1000);

		WebElement frame = driver.findElement(By.xpath("//iFrame[@class='demo-frame']"));
		switchToFrame(frame);

		Thread.sleep(1000);

		Actions act = new Actions(driver);
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));

		act.dragAndDrop(drag, drop).perform();
		String result = drop.getText();
		if (result.equals("Dropped!")) {
			System.out.println("Success!");
			Thread.sleep(3000);
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screen = ts.getScreenshotAs(OutputType.FILE);

			try {
				FileUtils.copyFile(screen, new File("Screenshots/DragAndDrop/result.png"));

			} catch (IOException e) {
				e.printStackTrace();
			}
			
		Thread.sleep(1000);
		} else {
			System.err.println("Unsuccessful");
			Thread.sleep(3000);
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screen = ts.getScreenshotAs(OutputType.FILE);

			try {
				FileUtils.copyFile(screen, new File("Screenshots/DragAndDrop/Wrongresult.png"));

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		Thread.sleep(8000);
		driver.quit();
	}
}
