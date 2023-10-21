package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoitUploaadFile {
	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		Thread.sleep(2000);
		
		driver.findElement(By.id("pickfiles")).click();
	}

}
