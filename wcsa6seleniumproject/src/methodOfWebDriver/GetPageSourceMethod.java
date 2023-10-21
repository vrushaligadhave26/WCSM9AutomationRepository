package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
	//it is use get the source code of current webpage

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch the actitime
		driver.get("http://desktop-770tgdl/login.do");
		// read the sorce code of login page
		String loginPageSourcecode = driver.getPageSource();
		System.out.println(loginPageSourcecode);

	}

}
