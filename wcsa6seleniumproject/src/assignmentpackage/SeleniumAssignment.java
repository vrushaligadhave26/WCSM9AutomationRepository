package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment {
public static void main(String[] args) throws InterruptedException {
WebDriver	driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.selenium.dev/");
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'Downloads')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//p[contains(text(),'Java')]")).click();
}
}
