package testngpgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePicTestNG {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
		 {
	      driver=new ChromeDriver();
	      driver.get("https://www.booking.com/index.en-gb.html?label=gen173nr-1BCAEoggI46AdIM1gEaGyIAQGYAQm4ARfIAQzYAQHoAQGIAgGoAgO4Asek7qgGwAIB0gIkODlhZjQxZmMtNTVmOS00NDZkLThiYWQtZjdiODA1MDQ5MmMx2AIF4AIB&sid=c30fd29de11d227f6d9eb33649e88715&keep_landing=1&sb_price_type=total&");	
		  driver.manage().window().maximize();
		  driver.navigate().refresh();
	      
	     }
	@Test
	public void test()
	   {
         driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div/button[1]")).click();
         while(true)
         {
        	//WebElement month=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3"));
        	WebElement month=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3"));
        	
        	String monthtext=month.getText();
        	if(monthtext.equals("October 2023"))
        	{
        		month.click();
        		break;
        	}
        	else
        	{
        		driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button")).click();
        	}
        	 
	     }
		
         List<WebElement> alldate=driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr/td/span/span"));
		 for(WebElement dateelement:alldate)
		{
			String date=dateelement.getText();
			if(date.equals("15"))
			{
				dateelement.click();
				break;
			}
		}	
		
	}		
		
}
