package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	// use to launch the single select dropdown
	// driver.get("file:///C:/Users/Dinesh%20Gadhave/Desktop/html/dropDown.html");
	
	// use to launch the multi select dropdown
	driver.get("file:///C:/Users/Dinesh%20Gadhave/Desktop/html/dropDownMultiple.html");
	          WebElement dropDownElement = driver.findElement(By.name("menu"));
	         Select sel = new Select(dropDownElement);
	         
	         // to check whether the dropdown is single select or multi select
	         System.out.println(sel.isMultiple()); // for single select : false
	                                               // for multi select : true
	
}
}
