package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//login Amazon website
public class Login_Page {
	WebDriver driver;
	@FindBy(xpath = "//a[@id='login2']")
	WebElement clickLogIn;

	@FindBy(xpath = "//input[@id='loginusername']")
	WebElement username;
	@FindBy(xpath = "//input[@id='loginpassword']")
	WebElement password;
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	WebElement login1;

	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

//click the sigin option
	public void click_LogIn() {
		clickLogIn.click();
	}

// enter username
	public void userid(String userName) {
		username.clear();
		username.sendKeys(userName);
	}

	public void pass(String passWord) {
		password.clear();
		password.sendKeys(passWord);
	}

//click the login button
	public void log_in() throws InterruptedException {
		login1.click();
		Thread.sleep(5000);
	}
}