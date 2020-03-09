package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page {
	WebDriver driver;

	@FindBy(xpath = "//a[contains(text(),'Phones')]")
	WebElement click_Phone;
	@FindBy(xpath = "//a[@class='btn btn-success btn-lg']")
	WebElement add_Cart1;

	@FindBy(xpath = "//a[contains(text(),'Laptops')]")
	WebElement click_Laptop;
	@FindBy(xpath = "//a[@class='btn btn-success btn-lg']")
	WebElement add_Cart2;

	@FindBy(xpath = "//a[contains(text(),'Monitors')]")
	WebElement click_Monitor;
	@FindBy(xpath = "//a[@class='btn btn-success btn-lg']")
	WebElement add_Cart3;

	public Cart_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void select_Phone(String phone) throws InterruptedException {

		click_Phone.click();
		driver.findElement(By.linkText(phone)).click();
		Thread.sleep(2000);
		add_Cart1.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

	public void select_Laptop(String laptop) throws InterruptedException {

		click_Laptop.click();
		driver.findElement(By.linkText(laptop)).click();
		Thread.sleep(2000);
		add_Cart2.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

	public void select_Monitors(String monitor) throws InterruptedException {

		click_Monitor.click();
		driver.findElement(By.linkText(monitor)).click();
		Thread.sleep(2000);
		add_Cart3.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

}