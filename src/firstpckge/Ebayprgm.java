package firstpckge;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebayprgm {


ChromeDriver driver;


@Before
public void setUp()
	 {
driver=new ChromeDriver();

}
@Test
public void test3()
{
	 driver.get("https://www.ebay.com");
	 driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).sendKeys("Mobiles",Keys.ENTER);
	 
	 
	 driver.findElement(By.xpath("//*[@id='gh-minicart-hover']/div/a")).click();

	 driver.findElement(By.xpath("//*[contains(@data-test-id,'start-shopping')]")).click();

	 driver.findElement(By.xpath("//*[contains(@_sp,'p2481888.m1381.l3250')]")).click();

	 
	 


}	 



}