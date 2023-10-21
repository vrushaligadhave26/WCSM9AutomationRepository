package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	// to use  multiselect dropdown
	driver.get("file:///C:/Users/Dinesh%20Gadhave/Desktop/html/dropDownMultiple.html");
	WebElement dropDownElement = driver.findElement(By.name("menu"));
	
	           Select sel = new Select(dropDownElement);
	           
	           // select multiple options
	           for(int i=0 ; i<4 ; i++) 
	           {
	        	   Thread.sleep(2000);
	        	   sel.selectByIndex(i);
	           }
	           // get the option that is selected first
	               WebElement firstOpt = sel.getFirstSelectedOption();
	               System.out.println(firstOpt.getText());
	        	   
	           
	}

}
