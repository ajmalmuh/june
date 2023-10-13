package testngpgms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceDemoDataDriven {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
		 {
	driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
		 }
	

	@Test
	public void test()  throws IOException
	{
		FileInputStream S=new FileInputStream("C:\\Users\\USER\\Desktop\\selenium\\SauceDemo.xlsx");
		try (XSSFWorkbook wb = new XSSFWorkbook(S)) {
			XSSFSheet sh =wb.getSheet("sheet1");
			    int row= sh.getLastRowNum();
			    for(int i=1;i<=row;i++)
			    {
			    	
			    	 String Username=sh.getRow(i).getCell(0).getStringCellValue();
				    	System.out.println("Username="+Username);
				        String Password=sh.getRow(i).getCell(1).getStringCellValue();
				        System.out.println("Password="+Password);
				        driver.findElement(By.name("user-name")).sendKeys(Username);
				        driver.findElement(By.name("password")).sendKeys(Password);
				        driver.findElement(By.name("login-button")).click();
				    
			
			    }
		}	
		
		
		
	}
}
