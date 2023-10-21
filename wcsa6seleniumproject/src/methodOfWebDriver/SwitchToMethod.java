package methodOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//use switchTo and switch the control to activeElement
		//on google searchbox
		driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);

	}

}
