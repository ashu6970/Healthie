package com.healthie.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.healthie.basepage.BasePage;
import com.healthie.utils.*;


public class LoginPage extends BasePage {

	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = ContantFile.LOGIN_SIGNIN_BUTTON)
	public WebElement signIn;
	
	@FindBy(xpath = ContantFile.LOGIN_USERNAME)
	public WebElement username;
	
	@FindBy(xpath = ContantFile.LOGIN_PASSWORD)
	public WebElement password;
	
	@FindBy(xpath = ContantFile.LOGIN_BUTTON)
	public WebElement loginButton;
	
	
	public void dologin(String user,String pass) throws Exception
	{
		safeJavaScriptClick(signIn);
		username.sendKeys(user);
		password.sendKeys(pass);
		safeJavaScriptClick(loginButton);
		
		
	}
	
	
	
	
}
