package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePage {
	
	 ChromeDriver driver;
	  @FindBy(xpath="//*[@id=\"reg_pages_msg\"]/a")
	  WebElement CreatePage;
	  
	  @FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div")
	  WebElement GetStarted;
	  public CreatePage(ChromeDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	public void createclick() 
	{
		CreatePage.click();	
	}
	public void getstrtClick() {
		GetStarted.click();
		
	}
		
       
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


