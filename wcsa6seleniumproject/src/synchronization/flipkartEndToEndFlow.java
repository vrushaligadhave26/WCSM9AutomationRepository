package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flipkartEndToEndFlow {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.flipkart.com/");
	 driver.findElement(By.xpath("//span[text()='✕']")).click();
	 driver.findElement(By.name("q")).sendKeys("iphone");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
	 // get the address of all the window
	 driver.findElement(By.xpath("(//div[@class='_2C41yO'])[2]")).click();

	 
	 
	 
	 
	 
	}

}
