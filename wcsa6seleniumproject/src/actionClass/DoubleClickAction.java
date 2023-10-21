package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubleClickAction {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-770tgdl/login.do");
		
		driver.findElement(By.name("username")).sendKeys(";admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		// click on setting module
		driver.findElement(By.xpath("//div[text()='Settings']following_sibling::img]")).click();
		
		// click on logo and color scheme
		driver.findElement(By.xpath("))
		
		

	}
}
