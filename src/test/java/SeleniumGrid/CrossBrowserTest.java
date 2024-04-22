package SeleniumGrid;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CrossBrowserTest 
{ 
	
  public WebDriver driver;
  @Parameters({"browsername"})
  @Test
  public void browserTest(String browsername) throws MalformedURLException, InterruptedException
  {
	  if(browsername.equals("chrome"))
	  {
		  ChromeOptions op=new ChromeOptions();
		  Reporter.log("Test executing on Chrome!", true);
		  driver=new RemoteWebDriver(new URL("http://localhost:4444/"),op);
		  Reporter.log("Driver session established with server", true); 
	  }
	  else if(browsername.equals("edge"))
	  {
		  EdgeOptions op=new EdgeOptions();
		  Reporter.log("Test executing on Edge!", true);
		  driver=new RemoteWebDriver(new URL("http://localhost:4444/"),op);
		  Reporter.log("Driver session established with server", true);   	
	  }
      else if(browsername.equals("firefox"))
	  {
    	  FirefoxOptions op=new FirefoxOptions();
		  Reporter.log("Test executing on Firefox!", true);
		  driver=new RemoteWebDriver(new URL("http://localhost:4444/"),op);
		  Reporter.log("Driver session established with server", true);   	
	  }
	  Thread.sleep(5000);
	  driver.get("https://amazon.in"); 
      Reporter.log("Test is executing for amazone appln", true);
      System.out.println( driver.getCurrentUrl());
      Thread.sleep(15000);
  }
}
