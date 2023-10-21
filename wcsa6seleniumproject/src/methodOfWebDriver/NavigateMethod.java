package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	//use the navigate method and launch the webapplication
	driver.navigate().to("https://www.google.com");
	//use navigate perform backword operation
	Thread.sleep(20000);
	driver.navigate().back();
	// use the navigate perform forward operation
	Thread.sleep(20000);
	driver.navigate().forward();
	// use navigate perform refresh opration
	driver.navigate().refresh();
	

	}

}
