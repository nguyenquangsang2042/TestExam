package linkTextAndPartialLink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P2 {
	public void p2(WebDriver driver)
	{
		 String baseUrl = "http://demo.guru99.com/test/newtours/";	
		 driver.get(baseUrl);					
	        String theLinkText = driver.findElement(By					
	                .partialLinkText("egis"))			
	                .getText();		
	        System.out.println(theLinkText);					
	        theLinkText = driver.findElement(By					
	                .partialLinkText("EGIS"))			
	                .getText();		
	        System.out.println(theLinkText);					

	        driver.quit();	
	}
}
