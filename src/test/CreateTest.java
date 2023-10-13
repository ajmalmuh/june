package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreatePage;


public class CreateTest {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
		 {
	driver=new ChromeDriver();
  
	}
	@Test
	public void test()
	{
		driver.get("https://www.facebook.com/");
	    CreatePage ob=new CreatePage(driver);
	    ob.createclick();
	    ob.getstrtClick();
    }
}