package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPopUp {
	public class AssignmentOnRobotAndActions {

	}

	public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.selenium.dev/");
	 Thread.sleep(2000);
	// press ctrl and  p to generate print popup
	      Robot robot = new Robot();
	      
	      // press ctrl button
	      robot.keyPress(KeyEvent.VK_CONTROL);
	      // press the button
	      robot.keyPress(KeyEvent.VK_P);
	      // release ctrl button
	      robot.keyRelease(KeyEvent.VK_CONTROL);
	      // release p button
	      robot.keyRelease(KeyEvent.VK_P);
	      
	      

	      
	      
	      
	      
	      
	}

}
