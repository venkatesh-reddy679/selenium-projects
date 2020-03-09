package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckItem_Page {

	WebDriver driver;

	public CheckItem_Page(WebDriver driver) {
		this.driver = driver;
	}

	public void count_Item() {
		List<WebElement> items = driver.findElements(By.className("success"));
		System.out.println("Number of Items in the Cart is:" + items.size());
	}

	public void delete_Item(String itemName) {
		List<WebElement> items = driver.findElements(By.className("success"));
		for (WebElement item : items) {
			if (item.getText().contains(itemName)) {
				driver.findElement(By.linkText("Delete")).click();
			}
		}

	}
	
	public void purchase(String name,String country,String city,String credit_card,String month,String year) throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("#name")).sendKeys(name);
		 driver.findElement(By.cssSelector("#country")).sendKeys(country);
		 driver.findElement(By.cssSelector("#city")).sendKeys(city);
		 driver.findElement(By.cssSelector("#card")).sendKeys(credit_card);
		 driver.findElement(By.cssSelector("#month")).sendKeys(month);
		 driver.findElement(By.cssSelector("#year")).sendKeys(year);
		 driver.findElement(By.cssSelector("#orderModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
		//String details= driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		 
		 
		 
		
	}

}
