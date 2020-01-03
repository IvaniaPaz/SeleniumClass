package com.class04;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class CheckBoxesDemo extends CommonMethods {

	public static final String SYNTAX_URL_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";

	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", SYNTAX_URL_PRACTICE_URL);
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Input Forms")).click();

		driver.findElement(By.linkText("Checkbox Demo")).click();

		WebElement ageCheckBox = driver.findElement(By.id("isAgeSelected"));
		// Checking if the checkbox is selected
		if (!ageCheckBox.isSelected()) { //clicks only if not selected
			ageCheckBox.click();
		}
		Thread.sleep(3000);
		ageCheckBox.click();

		System.out.println("----Group of check box-----");

		List<WebElement> groupCheckbox = driver.findElements(By.xpath("//input[@class='cb1-elementm']"));

		if (!groupCheckbox.isEmpty()) {

			Iterator<WebElement> it = groupCheckbox.iterator();
			while (it.hasNext()) {
				it.next().click();
				Thread.sleep(2000);
			}
		} else {
			System.err.println("List is empty, check your xpath");
		}

	}
}
