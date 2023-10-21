package methodOfWebelment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.instagram.com/");
	driver.navigate().to("https://www.instagram.com/");
    driver.findElement(By.name("username")).sendKeys("admin123");
    driver.findElement(By.name("password")).sendKeys("manager123");
  WebElement LoginButton = driver.findElement(By.xpath("//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']"));
boolean Button = LoginButton.isEnabled();
  System.out.println(Button);
  
  // click on the login button
  LoginButton.submit();
  System.out.println(Button);
  
}
	}


