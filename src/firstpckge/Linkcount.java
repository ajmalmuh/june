package firstpckge;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
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
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("Total No.of links="+links.size());
		 for(WebElement link:links){
			 System.out.println(link.getText() + " - " + link.getAttribute("href"));
			 }
}
}