package com.class08;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class Task1 extends CommonMethods {

	public static void main(String[] args) {

		setUp("chrome", Constants.SYNTAX_PRACTICE_URL);
		driver.findElement(By.linkText("Table")).click();
		driver.findElement(By.linkText("Table Data Search")).click();
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));

		List<WebElement> cols = driver.findElements(By.xpath("//table[@class='table']/thead[2]/tr/th"));
		System.out.println("# of rows: " + rows.size() + " and " + "# of columns: " + cols);

		System.out.println("--Printing column headers----");
		Iterator<WebElement> it = cols.iterator();
		while (it.hasNext()) {
			WebElement column = it.next();
			System.out.println(column.getText());
		}

		System.out.println("-- Printing row data----");
		for (WebElement row : rows) {
			String rowText = row.getText();
			System.out.println(rowText);
		}

		System.out.println("---Printing data cell by cell using advanced for loop-----");
		/*xpath
		 * 1. //table[@class='table'] - table element
		 * 2. /tbody - from table going inside tbody
		 * 
		 */
		List<WebElement>cells=driver.findElements(By.xpath("//table[@class='table']/tbody/tr/td"));
		for(WebElement cell:cells) {
			String cellData=cell.getText();
			System.out.println(cellData);
		}
		System.out.println("---Printing data cell by cell using for look-----");
		for(int i=1;i<=rows.size();i++) {//controlling rows
			for (int y=1;y<=cols.size();y++) {//controlling cols
				String cellText=driver.findElement(By.xpath("//table[@class='table']/tbody/tr[\"+i+\"]/td[\"+y+\"]")).getText();
				System.out.println(cellText);
			}
		}
		
		
		
		driver.quit();
	}

}
