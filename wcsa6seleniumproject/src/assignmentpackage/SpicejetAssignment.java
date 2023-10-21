package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpicejetAssignment {
public static void main(String[] args) throws InterruptedException {
	
	// HANDLE NOTIFICATION POPPUP
 ChromeOptions co = new ChromeOptions();
 co.addArguments("--disable-notification");
 
WebDriver	driver=new ChromeDriver(co);
driver.manage().window().maximize();
driver.get("https://www.airvistara.com/in/en");
                                                                                                      



driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("kochi",Keys.ENTER);




}
}
