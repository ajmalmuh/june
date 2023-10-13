package firstpckge;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpath {
	 ChromeDriver driver;


	 @Before
	 public void setUp()
	 		 {
	 	driver=new ChromeDriver();
	 	
	 }
	 @Test
	 public void test1()
	 {
		 driver.get("https://www.amazon.in");
		 driver.findElement(By.xpath("//input[@placeholder='twotabsearchtextbox']")).sendKeys("Mobiles");
		 driver.findElement(By.xpath("//[@type='submit']")).click();



}
}