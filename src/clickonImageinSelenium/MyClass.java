package clickonImageinSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyClass {

	public void myclass(WebDriver driver)
	{
		String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";	
        driver.get(baseUrl);					
		driver.findElement(By.linkText("English (UK)")).click();				

        //click on the "Facebook" logo on the upper left portion		
			driver.findElement(By.cssSelector(".fb_logo")).click();					
			
			//verify that we are now back on Facebook's homepage		
			if (driver.getCurrentUrl().equals("https://en-gb.facebook.com/")) {							
            System.out.println("We are back at Facebook's homepage");					
        } else {			
            System.out.println("We are NOT in Facebook's homepage");					
        }		
	}
}
