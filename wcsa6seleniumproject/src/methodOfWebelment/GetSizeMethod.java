package methodOfWebelment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {
	public static void main(String[] args) {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// identify login button
		 Dimension loginButton1 = driver.findElement(By.xpath(" //button[text()=' Login ']")).getSize();
		 int 	Height=  loginButton1.getHeight();
		 int Width = loginButton1.getWidth();
		 
		
		 System.out.println("Height of login button : "+Height+" "+"Width of login button : "+Width);
		

}
}
