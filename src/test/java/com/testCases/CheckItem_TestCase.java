package com.testCases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.pages.Cart_Page;
import com.pages.CheckItem_Page;
import com.pages.Login_Page;
import com.utilities.WrapperClass;

public class CheckItem_TestCase extends WrapperClass {
	 
	CheckItem_Page checkItem_Page;
	@BeforeEach
	public void beforeEach() 
	{
		launchBrowser("chrome","https://www.demoblaze.com");	
		checkItem_Page = new CheckItem_Page(driver);
	}
	@Test
	public void checkItem() throws InterruptedException {
		Login_Page  login_Page = new Login_Page(driver);
		login_Page.click_LogIn();
		login_Page.userid("naveen");
		Thread.sleep(2000);
		login_Page.pass("naveen");
		login_Page.log_in();
		Thread.sleep(2000);
		click_Cart();
		checkItem_Page.count_Item();
		//checkItem_Page.delete_Item("Apple monitor 24");
		//checkItem_Page.count_Item();
		checkItem_Page.purchase("venkateswara reddy", "India", "Chennai", "123456789", "jan", "2025");
	
	}
	 @AfterEach
	  public void afterEach() {
		  quit();
	  }

}
