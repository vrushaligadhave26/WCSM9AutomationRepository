package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirVistara {
	public static void main(String[] args) throws InterruptedException {
		// Hndle Notification popup
		 ChromeOptions co = new ChromeOptions();
		 co.addArguments("--disable-notifications();");
		 
		 
        WebDriver	driver	=new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get("https://www.airvistara.com/in/en");
        
        //identify depart loc
        driver.findElement(By.xpath("//input[@placeholder='Select Departure City'and (@name='flightSearchFrom')]")).sendKeys("pune",Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("kochi",Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.id("acceptAllBtn")).click();
        driver.findElement(By.xpath("//p[@class='label'])[1]")).click();
        Thread.sleep(2000);
	}

}
