package com.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utils.CommonMethods;
/*Navigate to HMRS application
 * enter uid and pwd
 * click on login with mouse
 */
import com.utils.Constants;

public class ActionsClass extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome",Constants.HRMS_URL);
	
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
		
		//to perform mouse or keyboard operation we need to have an Object on the Action Class
		Actions act=new Actions(driver);
		
		// identify an element on which to perform mouse click
		WebElement loginBt=driver.findElement(By.cssSelector("input#btnLogin"));
		//clicking on the mouse and to complete the action we need to call perform method.
		act.moveToElement(loginBt).click().perform();
		//to perform right click
//		act.moveToElement(loginBt).contextClick().perform();
//		Thread.sleep(5000);
		//to perform double click
//		act.moveToElement(loginBt).doubleClick().perform();
		Thread.sleep(5000);
		//hover over the element
		WebElement pimLink=driver.findElement(By.linkText("PIM"));
		act.moveToElement(pimLink).perform();
		Thread.sleep(5000);
		WebElement addemp=driver.findElement(By.linkText("Add Employee"));
		act.click(addemp).perform();
		
		
		
		Thread.sleep(10000);
		driver.quit();
		
	}
}
