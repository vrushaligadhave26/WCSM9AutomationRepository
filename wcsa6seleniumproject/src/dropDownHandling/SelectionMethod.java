package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("file:///C:/Users/Dinesh%20Gadhave/Desktop/html/dropDown.html"); 
	// handle dropdown by using select  class....
	
	// identify dropdown
	WebElement dropDownEle = driver.findElement(By.id("menu"));
	  
	// create the object of select class pto access method....
	Select sel = new Select(dropDownEle);
	
	// use selection method
	Thread.sleep(4000);
	//sel.selectByIndex(3);
	Thread.sleep(4000);
	//selected option according to visible text
	//sel.selectByVisibleText("Pannipuri");
	Thread.sleep(4000);
	// selected option accroding to value
	//sel.selectByValue("v1");
	
	// launch the multiple  dropdown webpage
	driver.navigate().to("file:///C:/Users/Dinesh%20Gadhave/Desktop/html/dropDownMultiple.html");
	
	// identify dropdown
	WebElement dropaDownele1 = driver.findElement(By.id("menu"));
	 // create the object
	Select sel1 = new Select(dropaDownele1);
	//sel.selectByIndex(3)
	//select multiple options by usingfor loop
	for(int i=0 ; i<=3 ; i++)
	{
	   Thread.sleep(2000);
	   sel.selectByIndex(i);
	}

	}
}

