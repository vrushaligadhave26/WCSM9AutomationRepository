package methodOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) {
		//it is use to get the url of current webpage
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch the actitime
		driver.get("http://desktop-770tgdl/login.do");
		//Read the url of login page
	String urlOfLoginPage = driver.getCurrentUrl();
	System.out.println(urlOfLoginPage);
	
		

	}

}
