package PopupTopic_2024Batch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EasyMyTrip 
{

	public static void main(String[] args) throws AWTException, InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.easemytrip.com/");
		
	Thread.sleep(2000);	
	
// Steps to handle Notification popup-by Robot class
	
// Create the object of Robot class	, It will throws exception -handle AWT exception
		Robot r=new Robot();
		
// keypress which is used to press key in the keyboard	
		r.keyPress(KeyEvent.VK_TAB);
// keyRelease which is used to Release key in the keyboard
		r.keyRelease(KeyEvent.VK_TAB);

		Thread.sleep(2000);
		
// keypress which is used to press key in the keyboard	
				r.keyPress(KeyEvent.VK_ENTER);
// keyRelease which is used to Release key in the keyboard
				r.keyRelease(KeyEvent.VK_ENTER);
				
				
				
				


	}

}
