package testngpgms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseclassSauceDemo {
	public static WebDriver driver;

@BeforeTest 
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
    driver.manage().window().maximize();
    }

}
