package dropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// to launch the single select dropdow
		driver.get("file:///C:/Users/Dinesh%20Gadhave/Desktop/html/dropDown.html");
		
		
	WebElement dropDownElement = driver.findElement(By.name("menu"));
	
	   Select sel = new Select(dropDownElement);
	   // to read all options from dropdown
	     List<WebElement> allOptions = sel.getOptions();
	     
	     // to list the list of webelement use for the loop
	     for(int i=0 ; i<allOptions.size() ; i++)
	     {
	    	 if(allOptions.get(i).getText().equals("tea"))
	    	 {
	    		 Thread.sleep(4000);
	    		 allOptions.get(i).click();
	    		 break;
	    	 }
	     }
	     
	     // use for each loop
	    // for (WebElement opt:allOptions)
	  //  {
	   // 	String op = opt.getText();
	    //	Thread.sleep(2000);
	    //	System.out.println(op);
	    // }
	}

}
