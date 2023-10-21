package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {
public static void main(String[] args) throws InterruptedException {
	//open a popup window
WebDriver	driver=new ChromeDriver();
driver.get("http://omayo.blogspot.com/");
Thread.sleep(2000);
// identify the link to child browser
driver.findElement(By.linkText("Open a popup window")).click();
// use the close method
driver.close();
// use the quit for close all browser
//driver.quit();
}
}
