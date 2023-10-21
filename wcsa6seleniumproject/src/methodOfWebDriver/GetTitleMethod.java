package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) {
		//it is use to get title of current webpage
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch  the instaram
		
		driver.get("https://www.instagram.com/");
		
		// read the title of login page
		String titleOfPage = driver.getTitle();
		System.out.println(titleOfPage);
		driver.close();
		
		

	}

}
