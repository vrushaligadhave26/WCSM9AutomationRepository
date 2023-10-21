package popUpHandling;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUP {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the BrowserValue!!");
		   String browserValue = sc.next();
		   
		   if(browserValue.equalsIgnoreCase("chrome"));
		   {
			   // handle notification popup in chrome
			  ChromeOptions co = new ChromeOptions();
			  co.addArguments("--disable-notification");
			  Thread.sleep(2000);
			  WebDriver driver  =new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			  driver.get("https://www.airvistara.com/in/en");
		   }
			  
			     
	
		 
		 
		 
		 
		 
		
		
		
	}

}
