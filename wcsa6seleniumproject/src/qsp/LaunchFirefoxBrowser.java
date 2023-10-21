package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		// To launch the browser to crate the obj
		WebDriver driver=new FirefoxDriver();
		
		// To maximize the browser
		driver.manage().window().maximize();
		//stop the execution for 2 second
		Thread.sleep(20000);
		
		// to close the browser
		driver.close();
		
	}
}
