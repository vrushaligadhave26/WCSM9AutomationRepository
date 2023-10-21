package methodOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
public static void main(String[] args) throws InterruptedException {
WebDriver	driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
Thread.sleep(2000);
// switch the controls to activeelment
driver.switchTo().activeElement().sendKeys("poha");
Thread.sleep(2000);
// identify the  suggestion of poha element 
List<WebElement> PohaSuggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
System.out.println(PohaSuggestions);
Thread.sleep(2000);
// TO print the list use looping statments
for( int i=0; i<PohaSuggestions.size(); i++);

 
{
	
	
	
	
	System.out.println(PohaSuggestions  );
	
	
	
	// by using advance for loop read the list
	
for(WebElement Poha:PohaSuggestions);

System.out.println(PohaSuggestions);
	
}
}
}




