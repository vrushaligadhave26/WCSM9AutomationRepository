package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {
	public static void main(String[] args) {
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		// handle  hidden division  pop up
		driver.findElement(By.id("denyBtn")).click();
		
		// identify watch jewellery
		WebElement taget = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		
// perform moveHover action
		
		Actions act = new Actions(driver);
		act.moveToElement(taget).perform();
		// click on band option
		driver.findElement(By.xpath("//a[text()='Band']")).click();
	}
}
		
		 