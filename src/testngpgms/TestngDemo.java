package testngpgms;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo {

	@BeforeTest
	
	public void setup()
	{
		System.out.println("Browser open");
	}
	
	@BeforeMethod
	
	public void urlloading()
	{
		System.out.println("url details");
		
	}
	
	@Test(priority=2,dependsOnMethods= {"test2"})
	
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(priority=1,enabled=true)
	
	public void test2()
	{
		System.out.println("test2");
	}
	
	@AfterMethod
	
	public void methodclose()
	{
		System.out.println("aftermethod");
	}
	
	
	@AfterTest()
	
	public void tearDown()
	{
		System.out.println("browser close");
	}
	
	
}