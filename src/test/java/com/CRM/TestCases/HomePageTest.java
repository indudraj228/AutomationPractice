package com.CRM.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class HomePageTest extends BaseClass
{
  @Test(priority=1)
  public void verifyUrl() 
  {
	  String currentUrl=hp.getAppUrl();
	  Assert.assertTrue( currentUrl.contains("crm"),"Wrong URL");
	  System.out.println("Valid Url"+hp.getAppUrl());
	 
  }
  @Test(priority=2)
  public void verifyTitle() 
  {
	 
	Assert.assertTrue(hp.getAppTitle().contains("Service"),"Title is not matched");
	System.out.println("Title is  matched"+hp.getAppTitle());
	 
  }
  @Test(priority=3)
  public void verifySignIn() 
  {
	hp.clickSignIn();  
	Assert.assertTrue(hp.getAppUrl().contains("login"), "Test failed,Invalid URL");
	System.out.println("Test pased,Login Page is opened"+hp.getAppUrl());
	 
  }
}
