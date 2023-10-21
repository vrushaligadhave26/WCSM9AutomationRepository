package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChromeBrowser {
 
	public static void main(String[] args) throws InterruptedException {
		// to launch chrome browser crate the obj
	WebDriver	driver=new ChromeDriver();
	
	// Stop the Execustion of Srcipt for 2 second
	   Thread.sleep(2000);
	
		//Close the Browser by calling method of webdriver
	  //driver.close();
	   
	   driver.get("https://www.facebook.com/");
	
		
	}
}
