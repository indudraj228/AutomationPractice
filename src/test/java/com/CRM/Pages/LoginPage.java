package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
  private WebDriver  driver;
  public LoginPage(WebDriver driver)
  {
	  this.driver=driver;
  }
  //locators
  By uname=By.id("email-id");
  By pass=By.name("password-name");
  By submit=By.xpath("//button[@id='submit-id']");
  public void login(String un,String ps)
  {
	  driver.findElement(uname).sendKeys(un);
	  driver.findElement(pass).sendKeys(ps);
	  driver.findElement(submit).click();
  }
  
  
}
