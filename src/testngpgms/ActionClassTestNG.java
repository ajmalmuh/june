package testngpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionClassTestNG {

	ChromeDriver driver;
	@BeforeTest
	public void setUp()
		 {
	driver=new ChromeDriver();

	}
	@Test
	public void test()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement fullname=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input"));
		WebElement reddiffid=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]"));
		fullname.sendKeys("ajmal");
		Actions act=new Actions(driver);
        act.keyDown(fullname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
        act.keyDown(fullname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL); 
        act.keyDown(reddiffid,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
	    act.perform();	
	}
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

