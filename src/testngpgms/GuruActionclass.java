package testngpgms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GuruActionclass {

	
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
		 {
	driver=new ChromeDriver();

	}
	@Test
	public void test()
	{
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act=new Actions(driver);
		WebElement rht=driver.findElement(By.xpath("//*[@id='authentication']/span"));
		act.contextClick(rht);
		act.perform();
		driver.findElement(By.xpath("//*[@id='authentication']/ul/li[1]")).click();
		driver.switchTo().alert().accept();
		WebElement doubleclick=driver.findElement(By.xpath("//*[@id='authentication']/button"));
		act.doubleClick(doubleclick);
		act.perform();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

