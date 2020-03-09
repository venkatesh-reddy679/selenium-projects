package com.testCases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.pages.Cart_Page;
import com.pages.Login_Page;
import com.utilities.WrapperClass;

public class Cart_TestCase extends com.utilities.WrapperClass{
	 Cart_Page cart_Page;
	
	@BeforeEach
	public void beforeEach() 
	{
		launchBrowser("chrome","https://www.demoblaze.com");	
		cart_Page = new Cart_Page(driver);
	}
	@Test
	public void cart_Test() throws InterruptedException {
		
		Login_Page  login_Page = new Login_Page(driver);
		login_Page.click_LogIn();
		login_Page.userid("naveen");
		login_Page.pass("naveen");
		login_Page.log_in();
		Thread.sleep(2000);
		cart_Page.select_Phone("Samsung galaxy s6");
		Thread.sleep(2000);
		click_Home();
		Thread.sleep(2000);
		cart_Page.select_Laptop("MacBook air");
		Thread.sleep(2000);
		click_Home();
		Thread.sleep(2000);
		cart_Page.select_Monitors("Apple monitor 24");
		Thread.sleep(2000);
		click_Cart();
		Thread.sleep(2000);
		click_logOut();
	}

  @AfterEach
  public void afterEach() {
	  quit();
  }
}