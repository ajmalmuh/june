package firstpckge;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathpgm {
	
       ChromeDriver driver;


@Before
public void setUp()
		 {
	driver=new ChromeDriver();
	
}
@Test
public void test1()

{
	driver.get("https://www.facebook.com");
	driver.findElement(By.xpath("//input[@placeholder='email address or phone number']")).sendKeys("xyz@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys("xyz");
	driver.findElement(By.xpath("//button[@type='submit']")).click();

}





}