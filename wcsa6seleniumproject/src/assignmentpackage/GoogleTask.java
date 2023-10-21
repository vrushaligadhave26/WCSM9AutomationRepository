package assignmentpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTask {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.switchTo().activeElement().sendKeys("car");
	List<WebElement> carSuggestions = driver.findElements(By.xpath("//div[@class='pcTkSc']") );  
	System.out.println(carSuggestions);
	Thread.sleep(2000);
	for(int i=0; i<carSuggestions.size();i++);
	{
 WebElement element = carSuggestions.get(0);
	String car = element.getText();
	System.out.println(car);
	}
	}

}
