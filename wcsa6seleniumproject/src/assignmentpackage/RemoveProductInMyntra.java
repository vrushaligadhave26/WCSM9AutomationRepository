package assignmentpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveProductInMyntra {
	public static void main(String[] args) {
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.myntra.com/");
		  // get the address of parent window
		      String parentHandle = driver.getWindowHandle();
		 // search the shoes in search box
		 driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("shoes");
		 
		 // click on search icon
		 
		 
	}

}
