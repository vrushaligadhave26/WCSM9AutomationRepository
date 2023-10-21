package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUP {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Dinesh%20Gadhave/Desktop/html/alert.html");
	
	// generate the alert popup
	WebElement button = driver.findElement(By.xpath("//button[text()='Click me!']"));
	button.click();
	// handle alert popup by switching the controls to alert
	    Alert al = driver.switchTo().alert();
	    Thread.sleep(2000);
	   // al.accept();
	    //al.dismiss();
	    System.out.println(al.getText());
	    Thread.sleep(2000);
	    driver.close();
	}
		
	}


