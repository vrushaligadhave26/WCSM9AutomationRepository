package methodOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod1 {

	public static void main(String[] args) {
	 // lauch the browsers
WebDriver	driver	=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("http://desktop-770tgdl/login.do");


// identify usernameTextBox
WebElement usnTB = driver.findElement(By.name("username"));
System.out.println(usnTB);
usnTB.sendKeys("admin");
		


	}

}
