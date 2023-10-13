package testngpgms;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazongGetWindows {

	public static final String[] allWindowshandles = null;
	public Object keyEvent;
	public String mobile;
	public String mobiles;
	public String parentWindow;

	public class FileuploadTestNG {

		ChromeDriver driver;
		@BeforeTest
		public void setUp()
			 {
		driver=new ChromeDriver();
			 }
		

		@Test
		public void test()  throws InterruptedException
		{
			driver.get("https://www.amazon.in/");
			 
			
			driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles",Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[2]/h2/a/span"));
		
			Set<String>allWindowHandles = driver.getWindowHandles();
			
			for(String mobile : allWindowHandles)
			{
			
			if(!mobile.equalsIgnoreCase(parentWindow))	
			{
		       driver.switchTo().window(mobiles);
		       driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		       driver.findElement(By.xpath("")).click();	
		}
     }
	}	
	}
}
