package testngpgms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Robotfileuploadpgm {

	public Object keyEvent;

	public class FileuploadTestNG {

		ChromeDriver driver;
		@BeforeTest
		public void setUp()
			 {
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		

		}
		@Test
		public void fileUploadpgm() throws AWTException
		{
			
			
			driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
			fileupload("C:\\Users\\USER\\Documents\\New Microsoft Word Document.docx");
		
		}
		private void fileupload(String p) throws AWTException 
		{
			StringSelection strSelection = new StringSelection(p);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection,null);
			
			Robot robot = new Robot();
			
			robot.delay(3000);
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(2000);
			
			
            			
		}
	}
			
}
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

