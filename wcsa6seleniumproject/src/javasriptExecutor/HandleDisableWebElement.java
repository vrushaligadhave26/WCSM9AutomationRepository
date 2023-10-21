package javasriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableWebElement {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Dinesh%20Gadhave/Desktop/html/javasript.html");
	// identify username
	WebElement usn = driver.findElement(By.id("Id1"));
	usn.sendKeys("admin");
	Thread.sleep(5000);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	 jse.executeScript("document.getElementBy.id2" , jse);
	
	}

}
