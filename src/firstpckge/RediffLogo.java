package firstpckge;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class RediffLogo {
	ChromeDriver driver;


	@Before
	public void setUp()
		 {
	driver=new ChromeDriver();

	}
	@Test
	public void test1()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		Boolean logo =driver.findElement(By.xpath("//img[@title='Rediff.com']")).isDisplayed();
		if(logo)
		{
			System.out.println("sucesess");
		}
		else
		{
			System.out.println("not displayed");
			
		}
		
		
	
	
	
	}
	
}