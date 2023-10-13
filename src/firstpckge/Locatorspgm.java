package firstpckge;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorspgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("am7054660@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("ajmal@1542.");
        driver.findElement(By.id("login")).click();   
	}

}
