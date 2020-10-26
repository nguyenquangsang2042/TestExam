package handleWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UsingAttributesAsPredicates {
public void usingAttributesAsPredicates(WebDriver driver)
{
	String baseUrl = "http://demo.guru99.com/test/newtours/";
	driver.get(baseUrl);
	String innerText = driver.findElement(By
		.xpath("//table[@width=\"270\"]/tbody/tr[4]/td"))
		.getText(); 		
	System.out.println(innerText); 
	driver.quit();
}
}
