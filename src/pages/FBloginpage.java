package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBloginpage {
	
	ChromeDriver driver;
	
	@FindBy(id="email")
	WebElement fbemail;
	
	@FindBy(id="pass")
	WebElement fbpass;
	
	@FindBy(name="login")
	WebElement fbloginbutton;
	
	public FBloginpage(ChromeDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setValues(String email, String pswd)
	
	{
		fbemail.sendKeys(email);
		fbpass.sendKeys(pswd);
	
	}
	
	public void loginClick()
	{
		fbloginbutton.click();
	
	
   }
}
