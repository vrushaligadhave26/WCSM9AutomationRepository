package methodOfWebelment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://desktop-770tgdl/login.do");
		driver.findElement(By.name("remember"));
		// to check  weather the checkbox is selected or not
		       WebElement checkbox = driver.findElement(By.name("remer"));
		      boolean res = checkbox.isDisplayed();
		      System.out.println( res);
	}

}
