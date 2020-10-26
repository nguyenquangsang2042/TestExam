package updown;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {

	public void uploadmenthod(WebDriver driver)
	{
		WebElement uploadElement=driver.findElement(By.id("uploadfile_0"));
		// enter the file path onto the file-selection input field
        uploadElement.sendKeys("/Users/nguyensang/Downloads/apple-logo.png");

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
	}
}
