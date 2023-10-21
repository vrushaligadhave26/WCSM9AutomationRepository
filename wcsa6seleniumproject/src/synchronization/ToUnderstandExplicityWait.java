package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToUnderstandExplicityWait {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
	driver.get("https://www.shoppersstack.com/");
	// click of any of the product
	driver.findElement(By.cssSelector("img[alt='jeans']")).click();
	//identify  box of pin code
	driver.findElement(By.id("Check Delivery")).sendKeys("411033");
	//click on check button
	WebElement CheckButton = driver.findElement(By.id("Check"));
	// use explacity wait
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(By.id("Check"))).click();
	
	
	
	
	}
	//public static webelement explicit wait(WebDriver driver,int sec,WebElement ele)
	{
	//WebDriverWait wait = new WebDriverWait(driver.Duration.ofSeconds(sec));
	//el = wait.until(ExpectedCondition.elementToBeClickable(ele));
	//return el;
		
	}

}
