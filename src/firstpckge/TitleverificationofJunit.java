package firstpckge;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleverificationofJunit {
ChromeDriver driver;

	@Before
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	}
	
	@Test
	public void test1()
	{
		 
	        String actualtitle =driver.getTitle();
	        String exp="Google";
	        if(actualtitle.equals(exp))
	        		{
	        	System.out.println("success");
	        		}
	        else
	        {
	        	System.out.println("fail");
	     
	        }
	}
	@Test
	public void test2()
	{
		String src =driver.getPageSource();
		  
		  if(src.contains("Gmail"))
		  {
		  
		  System.out.println("success");
		
		  }
		  else
		  {
			  System.out.println("fail");
		}
	}		
	@After
	public void close()
	{
	driver.close();
	}
}



