package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
public static void main(String[] args) throws InterruptedException {
WebDriver	driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://desktop-770tgdl/login.do");
// identify login Button and click
Thread.sleep(2000);
driver.findElement(By.id("loginButton")).click();

}
}
