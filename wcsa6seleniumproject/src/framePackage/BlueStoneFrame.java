package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneFrame {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.bluestone.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("denyBtn")).click();
	
	// this chat box is design under the frame
	// handle frame frist by ientify it
	//driver.switchTo().frame(3); ....we handle frame by using index 
	//driver.switchTo().frame("fc_widget");....we handle frame by using name
	
	    WebElement frameElement = driver.findElement(By.id("fc_widget"));
	    driver.switchTo().frame(frameElement);
	
	WebElement chatBox = driver.findElement(By.id("chat-icon"));
	chatBox.click(); 
	
	//switch controls to main page
	//driver.switchTo().parentFrame();
	driver.switchTo().defaultContent();
	
	driver.findElement(By.id("chat-fc-name")).sendKeys("admin");
	driver.findElement(By.id("chat-fc-email")).sendKeys("admin@gmail.com");
	driver.findElement(By.id("chat-fc-phone")).sendKeys("1234567890");
	
	
	
	
	
	
	
	}

}
