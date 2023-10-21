package methodOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://desktop-770tgdl/login.do");
	// identify username textbox and pass the input as admin
	//to identify we use findelement method
	// once the webelement found it return webelement[i] and adress of webelement
	WebElement UsernameTextbox = driver.findElement(By.name("username"));
	UsernameTextbox.sendKeys("admin");
	System.out.println(UsernameTextbox);
	
		
			
	}

}
