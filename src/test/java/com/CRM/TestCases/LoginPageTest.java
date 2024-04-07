package com.CRM.TestCases;

import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass
{
  @Test
 public void verifyLogin() 
  {
	lp.login("indu123@gmail.com", "indu123");

  }
}
