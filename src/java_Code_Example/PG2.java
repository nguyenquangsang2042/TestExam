package java_Code_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PG2 {
 public void pg2(WebDriver driver) {
	 String baseUrl = "http://www.facebook.com";
     String tagName = "";
     
     driver.get(baseUrl);
     tagName = driver.findElement(By.id("email")).getTagName();
     System.out.println(tagName);
     driver.close();
     System.exit(0);
 }
}
