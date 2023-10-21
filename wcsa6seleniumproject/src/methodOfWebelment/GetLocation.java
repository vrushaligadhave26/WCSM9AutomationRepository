package methodOfWebelment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	// identify login button
	Point loginButton=driver.findElement(By.xpath(" //button[text()=' Login ']")).getLocation();
	int xaxis=loginButton.getX();
	int yaxis=loginButton.getY();
	System.out.println("the x axis is : "+xaxis + " the y axis is "+yaxis);
			
	}

}
