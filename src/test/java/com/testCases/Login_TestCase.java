package com.testCases;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.data.Excel_Login_Data;
import com.pages.Login_Page;
import com.utilities.WrapperClass;

public class Login_TestCase extends WrapperClass{
	Login_Page login_Page;
	
// Launching chrome browser	
@BeforeEach
public void beforeEach() 
{
	launchBrowser("chrome","https://www.demoblaze.com");	
	login_Page = new Login_Page(driver);
}


@Test
public void login() throws IOException, InterruptedException
{
	
	Excel_Login_Data data=new Excel_Login_Data();
	login_Page.click_LogIn();
	login_Page.userid(data.excel_username(1)); //read the username from excelsheet
	//lpage.next();
	login_Page.pass(data.excel_password(1));//read the password from excelsheet
	login_Page.log_in();
}

@Test
public void login1() throws IOException, InterruptedException
{
	
	Excel_Login_Data data=new Excel_Login_Data();
	login_Page.click_LogIn();
	login_Page.userid(data.excel_username(2)); //read the username from excelsheet
	//lpage.next();
	login_Page.pass(data.excel_password(2));//read the password from excelsheet
	login_Page.log_in();
}

//taking screenshot and closing the browser
@AfterEach
public void close() throws IOException
{
	//screenshot("C:\\Users\\BLTuser.BLT1022\\Desktop\\project\\login.png");
	quit();
}
}
