package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		// to launch the EdgeBrowser create obj
	WebDriver	driver= new EdgeDriver();
	
	// stop the execustion of script for 2 second
	Thread.sleep(20000);
	
	// Close the Edge Browser by calling method of webdriver
	  driver.close();
	}
}
