package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Rtp {
	public static void main(String[] args) throws InterruptedException {
		

		//to take inputs from user use Scanner class
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the BrowserValue!!");
		  String BrowserValue = sc.next();
		  
		  if(BrowserValue.equalsIgnoreCase("chrome"))
		  {
	WebDriver	driver  = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		  Thread.sleep(20000);
		  driver.close();
		  
	  
	  
	}
	  else if (BrowserValue.equalsIgnoreCase("Firefox"))
	  {
	WebDriver	driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(20000);
		 driver.close();
	  }
	  else if (BrowserValue.equalsIgnoreCase("Edge"))
	  {
	WebDriver	driver= new EdgeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(20000);
		 driver.close();
		 
	  }
	  else 
	  {
		  System.out.println("Browser value is incorrect");
		  
	  }
		 
		 
		 
		 
		 
		 
		 
		 
		 
	  }
}
