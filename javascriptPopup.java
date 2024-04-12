package PopupTopic_2024Batch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptPopup 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://letcode.in/test");
	
// To click on dialog		
		driver.findElement(By.xpath("//a[text()='Dialog']")).click();
	
// To click on simple alart button		
		driver.findElement(By.id("accept")).click();
	//	Thread.sleep(2000);
// To click on Ok button		
		driver.switchTo().alert().accept();
		
/*		
// To confirm popup:-
		
	// To click on confirm --	
		driver.findElement(By.xpath("//a[text()='Dialog']")).click();
	// To click on confirm alart button	--
		driver.findElement(By.id("confirm")).click();
	// To click on dismis button--	
		driver.switchTo().alert().dismiss();  
		
	//	String text = driver.switchTo().alert().getText();  // for getting text we have to  first comment out above dismiss line or this line we have to written before dismiss method then only will get text
	//	System.out.println(text);

	*/	
		
/*		
// To prompt popup:-
		
		// To click on Dialog	
				driver.findElement(By.xpath("//a[text()='Dialog']")).click();
		// To click on prompt alart button	
				driver.findElement(By.id("prompt")).click();
		// To enter the name	
				driver.switchTo().alert().sendKeys("Suraj");
		// To click on OK button	
				driver.switchTo().alert().accept();
				
		
		*/
		
		
		
	}

}
