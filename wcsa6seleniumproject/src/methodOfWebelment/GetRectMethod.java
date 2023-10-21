package methodOfWebelment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {
	public class GetSizeMethod {
		public static void main(String[] args) {
			WebDriver	driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			// identify login button
			 Rectangle sizee  = driver.findElement(By.xpath(" //button[text()=' Login ']")).getRect();
			 int Height = sizee.getHeight();
			 int width = sizee.getWidth();
			 
			 int  x =  sizee.getX();
			 int y = sizee.getY();
			 System.out.println("the Height is :"+Height +" the width is "+ width +" x axis " + x + "y axis ");

}
	}
}
