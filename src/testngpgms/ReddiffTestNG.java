package testngpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

public class ReddiffTestNG {

ChromeDriver driver;
	
    
	@BeforeTest
	public void  setup()
	{
		driver=new ChromeDriver();
	}

    @BeforeMethod
	public void urlloading()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
    
    
    @Test
    public void test1()
    {
    	WebElement radiobutton=driver.findElement(By.xpath("//input[@value='m']"));
    	if(radiobutton.isSelected())
    	{
    		System.out.println("radio button is selected");
    		
    	}
    	else
    	{
    		System.out.println("radio button is not selected");
    	}
    }
    	@Test
        public void test2()
        {
        	WebElement radiobutton=driver.findElement(By.xpath("//input[@value='m']"));
        	if(radiobutton.isEnabled())
        	{
        		System.out.println("create my account is enabled");
        		
        	}
        	else
        	{
        		System.out.println("create my account is not enabled ");
        	}
        
    
    }
    
    
    	
    	
    
    
    
    
    
    
    
    
    
 
    
}
