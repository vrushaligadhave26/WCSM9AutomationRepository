package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCreateAccountByUsingContains {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("admin");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[contains(@aria-label,'Surname')]")).sendKeys("juleit");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile number or email address')]")).sendKeys("abc123acb@gmail.com");

	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[contains(@name,'reg_email_confirmation__')]")).sendKeys("abc123abc@gmail.com");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[contains(@name,'reg_passwd__')]")).sendKeys("dev");
	driver.findElement(By.xpath("//option[text()='28']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//option[contains(text(),'Jun')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//option[contains(text(),'2023')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[contains(@name,'websubmit')]")).click();
	

	}

}
