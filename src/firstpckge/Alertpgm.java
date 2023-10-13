package firstpckge;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
ChromeDriver driver;


@Before
public void setup()
{
	driver=new ChromeDriver();
}
@Test

	public void test1()
	{
	driver.get("file:///C:/Users/USER/Documents/.Html");
	driver.findElement(By.xpath("/html/body/input[1]")).click();
    Alert a= driver.switchTo().alert();
    String alertext=a.getText();
    System.out.println(alertext);
    a.accept();
    
	driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("aj");
	driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("ab");
	driver.findElement(By.xpath("/html/body/input[4]")).click();
	
	}

}
