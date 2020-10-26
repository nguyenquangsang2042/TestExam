package java_Code_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PG4 {
public void pg4(WebDriver driver) {
	String alertMessage = "";

    driver.get("http://jsbin.com/usidix/1");
    driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
    alertMessage = driver.switchTo().alert().getText();
    driver.switchTo().alert().accept();
   
    System.out.println(alertMessage);
    driver.quit();
   
}
}
