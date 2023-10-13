package testngpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollDown {
	
	   ChromeDriver driver=new ChromeDriver();
	   @BeforeTest
	   public void setup()
	   {
		   driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=4421093299329769975&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9040212&hvtargid=kwd-10573980&hydadcr=14453_2316415");
	   }
	   
	   @Test
	   public void test()
	   {
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		   js.executeScript("window.scrollBy(0,document.body.scrollHight)");
		   driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[5]/table/tbody/tr[1]/td[5]/a/span")).click();
		   
	   }
	   
	

}
