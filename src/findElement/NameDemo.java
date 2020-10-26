package findElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NameDemo {

	public void namedemo(WebDriver driver) {
		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/ajax.html");

		// Find the radio button for “No” using its ID and click on it
		driver.findElement(By.id("yes")).click();
			
		//Click on Check Button
		driver.findElement(By.id("buttoncheck")).click();
	}
}
