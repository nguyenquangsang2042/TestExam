package linkTextAndPartialLink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P3 {
 public void p3(WebDriver driver)
 {
	 String baseUrl = "http://demo.guru99.com/test/block.html";
	 driver.get(baseUrl);					
     driver.findElement(By.partialLinkText("Inside")).click();					
     System.out.println(driver.getTitle());					
     driver.navigate().back();			
     driver.findElement(By.partialLinkText("Outside")).click();					
     System.out.println(driver.getTitle());					
     driver.quit();	
 }
}
