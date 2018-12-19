package com.healthie.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.healthie.pages.LoginPage;
import com.healthie.testcases.basetest.BaseTest;
import com.healthie.utils.ContantFile;

public class LoginTest extends BaseTest {
	
	@Test
	public void doToLogin() throws Exception
	{
		init("Chrome");
		LoginPage loginpage=new LoginPage(driver);
		PageFactory.initElements(driver, loginpage);
		loginpage.dologin(ContantFile.USERNAME,ContantFile.PASSWORD);

		
	}
	

}
