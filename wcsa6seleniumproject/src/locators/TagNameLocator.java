package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Dinesh%20Gadhave/Desktop/html/design.html");
	//identify username textbox by using tagname locator
	Thread.sleep(2000);
	driver.findElement(By.tagName("input")).sendKeys("Admin");
	//identify password textbox by using tagname locator
	Thread.sleep(2000);
	driver.findElement(By.tagName("input")).sendKeys("manager");

	}

}
