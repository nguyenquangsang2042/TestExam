package java_Code_Example;

import org.openqa.selenium.WebDriver;

public class PG3 {
 public void pg3(WebDriver driver) {
	 driver.get("http://www.popuptest.com/popuptest2.html");
     driver.close();  // using QUIT all windows will close
 }
}
