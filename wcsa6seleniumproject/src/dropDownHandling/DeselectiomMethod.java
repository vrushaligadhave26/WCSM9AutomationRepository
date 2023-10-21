package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectiomMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Dinesh%20Gadhave/Desktop/html/dropDownMultiple.html");
	WebElement dropDownEle = driver.findElement(By.name("menu"));
	               Select sel = new Select(dropDownEle);
	               
	              // select single option from multiselect dropdown
	              // sel.selectByIndex(2);
	             //  Thread.sleep(2000);
	               // deselect single option from multiselect dropdown
	               //sel.deselectByIndex(2);
	               
	               sel.selectByVisibleText("milkShake");
	               Thread.sleep(2000);
	               sel.deselectAll();
	               
	               // select multiple options 
	               for(int i= 0 ; i<3 ; i++)
	               {
	            	   Thread.sleep(2000);
	            	 sel.selectByIndex(i);
	               }
	               Thread.sleep(2000);
	               sel.deselectAll();
	            	 
	            	 
	            	 
	               }
	}


