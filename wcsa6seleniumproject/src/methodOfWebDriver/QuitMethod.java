package methodOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
		
  WebDriver     driver  = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("http://omayo.blogspot.com/");
  Thread.sleep(2000);
  // the child browser
  driver.findElement(By.linkText("Open a popup window")).click();
  driver.close();
  Thread.sleep(2000);
  driver.quit();
  
	}

}
