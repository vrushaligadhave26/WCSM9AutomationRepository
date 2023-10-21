package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Dinesh%20Gadhave/Desktop/html/confirm.html");
	
	// generate confirmation popup
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	
	// handle confirmation popup by using switch to()
	    Alert al = driver.switchTo().alert();
	    Thread.sleep(2000);
	   // al.accept();// accept the confirmation popup
	    //al.dismiss(); // dismiss the confirmation popup
	    
	    System.out.println(al.getText());
	    al.accept();
	    Thread.sleep(2000);
	
	
	    driver.close();
	}

}
