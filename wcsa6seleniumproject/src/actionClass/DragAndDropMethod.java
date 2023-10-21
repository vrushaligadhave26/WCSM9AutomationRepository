package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragAndDropMethod {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	// identify src webelement
	WebElement src1 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
	 WebElement src2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
	 
	WebElement src3 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
    WebElement src4 = driver.findElement(By.xpath("//a[text()=' 5000']"));
	 
	}

}
