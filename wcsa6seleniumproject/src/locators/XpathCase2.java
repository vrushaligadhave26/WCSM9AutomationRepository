package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase2 {
	// xpath by using text() or .
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	// identify web element by using xpath
	
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	Thread.sleep(2000);
	// login button by using text() function
	driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	Thread.sleep(2000);
	}

}
