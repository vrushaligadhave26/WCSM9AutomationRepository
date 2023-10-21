package methodOfWebelment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNameMethod {
	public static void main(String[] args) {
WebDriver	driver	=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://www.instagram.com/");

// to find the webelement on the webpage
WebElement usn = driver.findElement(By.name("username"));

// to get the tag name of webelement
String usnTagNme = usn.getTagName();
System.out.println(usnTagNme);

String LoginButton = driver.findElement(By.xpath("//button[@type='submit']")).getTagName();
System.out.println(LoginButton);

	}

}
