package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLoginPage {

	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.netflix.com/in/Login");
    Thread.sleep(2000);
    //identify  email or phone textbox
    driver.findElement(By.id("id_userLoginId")).sendKeys("Admin");
    Thread.sleep(2000);
    
    // identify password textbox
    driver.findElement(By.id("id_password")).sendKeys("Admin123");
    Thread.sleep(2000);
    
    // identify sign in button
    driver.findElement(By.className("Sign In")).click();
    Thread.sleep(2000);
	}

}
