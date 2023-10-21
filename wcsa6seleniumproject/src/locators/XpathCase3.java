package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase3 {
	public static void main(String[] args) throws InterruptedException {
WebDriver	driver	=new ChromeDriver();

driver.get("https://www.flipkart.com/");
Thread.sleep(4000);
driver.findElement(By.xpath("//button[text()='✕']")).click();
Thread.sleep(4000);

driver.findElement(By.xpath("//input[contains(@placeholder,'Search for products, brands and more')]")).sendKeys("HP Laptop",Keys.ENTER);
                                                                                                                                  
Thread.sleep(4000);
driver.findElement(By.xpath("//div[contains(text(),'Lenovo IdeaPad 3 Ryzen 5 Hexa Core 5500U - (8 GB/512 GB SSD/Windows 11 Home) 15ALC6 Thin and Light Lap...')]")).click();


	}

}
