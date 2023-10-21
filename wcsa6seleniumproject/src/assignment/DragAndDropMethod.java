package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://jqueryui.com/droppable/");
	
	driver.findElement(By.xpath("//a[text()='Demos']")).click();
	driver.findElement(By.xpath("//a[text()='Droppable']")).click();
	WebElement src = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
	driver.findElement(By.xpath("))
	 
	
	
	}

}
