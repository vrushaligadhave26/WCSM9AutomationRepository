package assignmentpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartFindElementsMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys(" laptop");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();

	Thread.sleep(2000);
	//click on core is
	driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Core i5']")).click();
	
	Thread.sleep(2000);
	//click on os
	driver.findElement(By.xpath("//div[text()='Operating System']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Brand']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Windows 11']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("Operating System")).click();
	Thread.sleep(2000);
	//identify all the suggetions of laptop
List<WebElement> MobileSuggetions = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
Thread.sleep(2000);
List<WebElement> PriceSuggetions = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
Thread.sleep(2000);
			//identify all the suggestions to price of laptop
			//use looping statements to read list
	
	for(int i=0; i<MobileSuggetions.size(); i++)
	{
	String nameOfLaptop = MobileSuggetions.get(i).getText();
	
			
	//	System.out.println(MobileSuggetions);	
		
		 Thread.sleep(2000);
		 for(int j=i; j<=i; j++);
	      {
	    	String Price = PriceSuggetions.get(i).getText();
	    	Thread.sleep(2000);
	      }
		
	}
         
      
	
		
	
	
	
		
		
		

	}
	
}
	


