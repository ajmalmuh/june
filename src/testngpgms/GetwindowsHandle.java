package testngpgms;


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetwindowsHandle {

	public static final String[] allWindowshandles = null;
	public Object keyEvent;

	public class FileuploadTestNG {

		ChromeDriver driver;
		@BeforeTest
		public void setUp()
		{
		driver=new ChromeDriver();
		
		}
		
		@Test
		public void test()  
		{
			driver.get("https://demo.guru99.com/popup.php");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			String parentWindow = driver.getWindowHandle();
			
			System.out.println("Parent Window Title "+ driver.getTitle());
			driver.findElement(By.xpath("/html/body/p/a")).click();
		
			Set<String>allWindowHandles = driver.getWindowHandles();
			
			for(String handle : allWindowHandles)
			{
			
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle);
			
			
			
		 driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abcd@gmail");
			
			driver.close();
			}
		}
		
		driver.switchTo().window(parentWindow);		
	}

}

}


