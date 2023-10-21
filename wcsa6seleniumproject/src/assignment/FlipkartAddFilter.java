package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAddFilter {
	public static void main(String[] args) {
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	driver.findElement(By.name("q")).sendKeys("laptop");
	
	
	}

}
