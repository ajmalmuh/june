package testngpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
		 {
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	

	}
	@Test
	public void test()
	
	{
		WebElement element=driver.findElement(By.xpath("//*[@id='products']/div[1]/ul[1]/li[2]/a[1]"));
		WebElement elem=driver.findElement(By.xpath("//*[@id='amt7']/li[1]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(element, elem);
		act.perform();

	


	    WebElement element1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	    WebElement elem1=driver.findElement(By.xpath("//*[@id='amt8']/li[1]"));
	   
	    act.dragAndDrop(element1, elem1);
	    act.perform();
	
		
	
	    WebElement element2=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	    WebElement elem2=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	    
	    act.dragAndDrop(element2, elem2);
	    act.perform();
	    
	    
	    
	    
	    WebElement element3=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
	    WebElement elem3=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
	    
	    act.dragAndDrop(element3, elem3);
	    act.perform();
	    
	    
	    WebElement Button=driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
	    if(Button.getText().equals("perfect"))
	    {
	    	System.out.println("text is perfect");
	    }
	    else
	    {
	    	System.out.println("text is not perfect");
	    }
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	