package testngpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FacebooktestNG {
	ChromeDriver driver;
	
    
	@BeforeTest
	public void  setup()
	{
		driver=new ChromeDriver();
	}

    @BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.facebook.com");
		
	}
    @Parameters({"email","password"})
    @Test
    public void test1(String e,String p)
    {
    	driver.findElement(By.id("email")).sendKeys(e);
    	driver.findElement(By.id("pass")).sendKeys(p);
    	driver.findElement(By.name("login")).click();
    }
    
    @AfterTest()
	
	public void tearDown()
	{
		System.out.println("browser close");
	}
	


}


