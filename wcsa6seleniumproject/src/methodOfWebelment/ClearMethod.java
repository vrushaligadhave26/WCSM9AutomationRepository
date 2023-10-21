package methodOfWebelment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {
WebDriver driver	=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("http://desktop-770tgdl/login.do");
//identify username textbox and pass the invalid input-
 driver.findElement(By.name("username")).sendKeys("admin123");
//identify password textbox and pass the valid input
WebElement passwordTB = driver.findElement(By.name("pwd"));
passwordTB.sendKeys("manager");

//identify loginbutton and click
WebElement loginButton = driver.findElement(By.id("loginButton"));
loginButton.click();
Thread.sleep(2000);

//identify usernmae text box and clear the inputs

driver.findElement(By.name("username")).clear();

	}

}
