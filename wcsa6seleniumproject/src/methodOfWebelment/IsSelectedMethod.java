package methodOfWebelment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	public static void main(String[] args) {
WebDriver	driver	=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("http://desktop-770tgdl/login.do");
// to check or select the checkbox
driver.findElement(By.name("remember" )).click();
// to check weather the check box is selected or not
WebElement CheckBox = driver.findElement(By.name("remember"));
boolean result = CheckBox.isSelected();
System.out.println( result);

// to check weather the checkbox is displayed or not
boolean res = CheckBox.isDisplayed();
System.out.println( res);


	}

}
