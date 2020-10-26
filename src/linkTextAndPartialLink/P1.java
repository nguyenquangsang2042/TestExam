package linkTextAndPartialLink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P1 {
 public void p1(WebDriver driver)
 {
	 String baseUrl = "http://demo.guru99.com/test/accessing-link.html";	
	 driver.get(baseUrl);					
     driver.findElement(By.partialLinkText("here")).click();					
     System.out.println("Title of page is: " + driver.getTitle());							
     driver.quit();
 }
}
