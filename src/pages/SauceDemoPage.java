package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SauceDemoPage {
	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement SDusername;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement SDpswd;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement SDloginbutton;
	
	@FindBy(xpath="//button[//*[//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement Addtocartbackpack;
	
	@FindBy(xpath="//button[//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
	WebElement Addtocartbikelight;
	
	@FindBy(xpath="//button[//*[//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]]")
	WebElement Addtocartbolttshirt;
	
	@FindBy(xpath="//button[//*[//*[//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]]")
	WebElement Addtocartfleecejacket;
	
	@FindBy(xpath="//button[//*[//*[//*[//*[@id=\"add-to-cart-sauce-labs-onesie\"]]")
	WebElement Addtocartonesie;
	
	@FindBy(xpath="//button[//*[//*[//*[//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]]")
	WebElement Addtocartredtshirt;
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a]")
	WebElement Carticon;
	
	@FindBy(name="checkout")
	WebElement Checkoutbutton;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement Firstname;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement Lastname;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
