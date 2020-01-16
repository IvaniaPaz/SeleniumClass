package com.class08;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class WebTable extends CommonMethods {

	public static void main(String[] args) {
		setUp("chrome", Constants.SYNTAX_PRACTICE_URL);
		driver.findElement(By.linkText("Table")).click();
		driver.findElement(By.linkText("Table Data Search")).click();

		// find how many rows of data table has
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
		System.out.println("# of rows: " + rows.size());
		System.out.println("----Printing rows------");
		Iterator<WebElement> rowsIt = rows.iterator();
		while (rowsIt.hasNext()) {
			String rowData = rowsIt.next().getText();
			System.out.println(rowData);
		}

		// number of columns
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
		System.out.println("# of columns: " + cols.size());

		System.out.println("---Printing cloumn header------");
		for (WebElement col : cols) {
			String header = col.getText();
			System.out.println(header);
		}
	}
}
