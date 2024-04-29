package config;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility
{
   public static void capture(WebDriver driver)
   {
	TakesScreenshot sc_shot=(TakesScreenshot)driver;
	File tempfile=sc_shot.getScreenshotAs(OutputType.FILE);
	File dest=new File(System.getProperty("user.dir")+"//ScreenShot//crm"+System.currentTimeMillis()+".png");
	try {
		FileHandler.copy(tempfile, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
