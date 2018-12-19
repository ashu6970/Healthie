package com.healthie.basepage;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BasePage {
	
	public WebDriver driver;
	
	public BasePage()
	{}
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	

	public boolean isElementPresent(String locator)
	{
		int s=driver.findElements(By.xpath(locator)).size();
		if(s==0)
		{
		   System.out.println("Not Find locator");
		}
		else
			
			System.out.println("Locator find");
		return true;
	}
	
	public void wait(int timeToWaitInSec)
	{
		try {
			Thread.sleep(timeToWaitInSec * 1000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void safeJavaScriptClick(WebElement element) throws Exception {
		try {
			if (element.isEnabled() && element.isDisplayed()) {
				System.out.println("Clicking on element with using java script click");

				((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			} else {
				System.out.println("Unable to click on element");
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document "+ e.getStackTrace());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM "+ e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Unable to click on element "+ e.getStackTrace());
		}
	}
	
}
