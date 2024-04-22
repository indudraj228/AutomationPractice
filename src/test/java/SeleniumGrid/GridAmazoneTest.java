package SeleniumGrid; 
import java.net.MalformedURLException;
import java.net.URL; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeOptions; 
import org.openqa.selenium.edge.EdgeOptions; 
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter; 
import org.testng.annotations.Test;

public class GridAmazoneTest 
{
	  @Test
	  public void testingOnChrome() throws MalformedURLException, InterruptedException
	  { 
		  ChromeOptions op=new ChromeOptions();
		  Reporter.log("Test executing on Chrome!", true);
		  WebDriver d=new RemoteWebDriver(new URL("http://localhost:4444/"),op);
		  Reporter.log("Driver session established with server", true);
	       Thread.sleep(5000);
	       d.get("https://amazon.in"); 
	       Reporter.log("Test is executing for amazone appln", true);
	       System.out.println(d.getCurrentUrl());
	       Thread.sleep(15000);
	       
	       d.quit(); 
	       Reporter.log("Test executing on chrome completed", true);
	   } 
	/*  @Test
	  public void testingOnEdge() throws MalformedURLException, InterruptedException 
	  { 
		  EdgeOptions op=new EdgeOptions(); 
	  Reporter.log("Test executing on Edge!", true);
	  WebDriver d=new RemoteWebDriver(new URL("http://localhost:4444/"),op); 
	  Thread.sleep(5000);
	  d.get("https://amazon.in");
	  Thread.sleep(15000); 
	  System.out.println(d.getCurrentUrl()); 
	  d.quit(); 
	  }
	  @Test 
	  public void testingOnFirefox() throws MalformedURLException, InterruptedException
	  {
		  FirefoxOptions op=new FirefoxOptions(); 
		  Reporter.log("Test executing on Firefox!", true);
		  WebDriver d=new RemoteWebDriver(new URL("http://localhost:4444/"),op);
		  Thread.sleep(5000); 
		  d.get("https://amazon.in");
		  Thread.sleep(15000);
	       System.out.println(d.getCurrentUrl());
	       d.quit();
	  }*/
	 
}
