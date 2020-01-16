package com.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class DynamicTable  extends CommonMethods{
	
	/*navigate to webdrivers
	 * login into weborders
	 * click on checkbox next to bob feather
	 */
	public static void main(String[] args) throws InterruptedException {
		setUp("chrome","http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		//search for bob
		String expectedValue="Bob Feather";
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		for(int i=1;i<rows.size();i++) {
			String rowText=rows.get(i-1).getText();
			if(rowText.contains(expectedValue)) {
				driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+i+"]/td[13]")).click();
			
		}
		Thread.sleep(4000);
		driver.quit();
  }
 }
}