package testngpgms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatadrivenFB {
	
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
		 {
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
		 }
	

	@Test
	public void test()  throws IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\USER\\Desktop\\selenium\\FBBook.xlsx");
		try (XSSFWorkbook wb = new XSSFWorkbook(f)) {
			XSSFSheet sh =wb.getSheet("sheet1");
			    int row= sh.getLastRowNum();
			    for(int i=1;i<=row;i++)
			    {
			    	
			        String email=sh.getRow(i).getCell(0).getStringCellValue();
			    	System.out.println("email="+email);
			        String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			        System.out.println("pswd="+pswd);
			        driver.findElement(By.name("email")).sendKeys(email);
			        driver.findElement(By.name("pass")).sendKeys(pswd);
			        driver.findElement(By.name("login")).click();
			    
			    
			    
			    }
		}
		    
		    
	}
		
}
