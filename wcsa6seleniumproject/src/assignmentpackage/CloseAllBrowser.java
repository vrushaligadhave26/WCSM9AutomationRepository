package assignmentpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBrowser {
	public static void main(String[] args) throws InterruptedException {
WebDriver	driver	=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
// get add the parent browser
driver.get("http://omayo.blogspot.com/");
     Thread.sleep(2000);
       WebElement childBrowser = driver.findElement(By.partialLinkText("Open a popup window"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
     // jse.executeScript("arguments[0].scrollInView(true)",childBrowser);
      
      // click the link
      childBrowser.click();
      Thread.sleep(2000);
      driver.quit();
      
	}

}
