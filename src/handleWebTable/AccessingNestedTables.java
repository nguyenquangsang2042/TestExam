package handleWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccessingNestedTables {
 public void accessingNestedTables(WebDriver driver)
 {
	 String baseUrl = "http://demo.guru99.com/test/accessing-nested-table.html";
	 driver.get(baseUrl);
		String innerText = driver.findElement(
			By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]")).getText(); 		
	        System.out.println(innerText); 
		driver.quit();
 }
}
