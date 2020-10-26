package linkTextAndPartialLink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyClassLinkTextAndPartialLink {
 public void myClassLinkTextAndPartialLink(WebDriver driver)
 {
	 String baseUrl = "http://demo.guru99.com/test/link.html";
	 driver.get(baseUrl);					
     driver.findElement(By.linkText("click here")).click();					
     System.out.println("title of page is: " + driver.getTitle());							
     driver.quit();			
 }		
 }

