package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActimeModule {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://desktop-770tgdl/login.do");
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a [text()='Login']")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("//img[@src='/img/default/pixel.gif?hash=1692528820']")).click();
	
	}

}
