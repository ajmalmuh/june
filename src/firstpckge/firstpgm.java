package firstpckge;

import org.openqa.selenium.chrome.ChromeDriver;

public class firstpgm {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
       
        String actualtitle =driver.getTitle();
        String exp="Google";
        if(actualtitle.equals(exp))
        		{
        	System.out.println("success");
        		}
        else
        {
        	System.out.println("fail");
     
       }
	  String src =driver.getPageSource();
	  
	  if(src.contains("Gmail"))
	  {
	  
	  System.out.println("success");
	
	  }
	  else
	  {
		  System.out.println("fail");
	}
	
	
	
	}	

}
