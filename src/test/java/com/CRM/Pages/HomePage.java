package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.Utility;

public class HomePage
{   
	//Encapsulation=data+method
	private WebDriver driver;
	public HomePage(WebDriver driver)//driver from base class
	{
		this.driver=driver;
	}
  
	//Locators
	By signIn=By.linkText("Sign In");
	//method
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	public String getAppTitle() 
	{
	   return driver.getTitle();	
	}
	public void clickSignIn() 
	{   Utility.capture(driver);
		driver.findElement(signIn).click();
		 Utility.capture(driver);
	}
}
