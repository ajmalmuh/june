package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FBloginpage;

public class FBlogintest {
	
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
	    FBloginpage ob=new FBloginpage(driver);	
	    ob.setValues("ajmal123@gmail","aj123");
	    ob.loginClick();
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
