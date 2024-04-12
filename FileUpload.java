package PopupTopic_2024Batch;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload 
{

	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.guru99.com/test/upload/");
	// Here we clicking on choose file	
		driver.findElement(By.id("file_wraper0")).click(); 
		Thread.sleep(4000);
	
	// To upload the file in runtime	
		Runtime.getRuntime().exec("C:\\Users\\admin\\Desktop\\try2.exe");  /* exec(  Location\\filename.extension  )   */
		
		
	}

}
