package testngpgms;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebaylinkcheck {

	ChromeDriver driver;
	@BeforeTest
	public void setUp()
		 {
	driver=new ChromeDriver();

	}
	@Test
	public void test()
	{
		driver.get("http://www.ebay.com");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("Total No.of links="+links.size());
		 for(WebElement link:links){
			 System.out.println((link.getText() + " - " + link.getAttribute("href")));
			 }
}
	
	
    @Test
    public void test1()
    {
    	WebElement button=driver.findElement(By.xpath("//input[@id='gh-btn']"));
    
    
        if(button.isEnabled())
        {
        	
        	System.out.println("is Enabled");
        }
	
        else
        {
        	System.out.println("is disabled");
        }
    
    }
        
     @Test
     public void test2()
     {
    Boolean logo=driver.findElement(By.xpath("//*[@id='gh-la']")).isDisplayed();
     
    if(logo)
    {
    	System.out.println("is displayed");
    	
    }
    else
    {
    	System.out.println("is not displayed");
    }
       
     }

   
    
   @Test
   public void test3()
   {
   String sourceCode=driver.getPageSource();
   if(sourceCode.contains("Daily Deals"))
   {
	   System.out.println("pass");
   }
   else
   {
	   System.out.println("fail");
   }
    
   }   
}
