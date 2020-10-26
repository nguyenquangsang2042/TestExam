package mouseAndKeuboardEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {
public void keyboard(WebDriver driver)
{
	String baseUrl = "http://www.facebook.com/"; 
	driver.get(baseUrl);
	WebElement txtUsername = driver.findElement(By.id("email"));
	Actions builder = new Actions(driver);
	Action seriesOfActions = builder
		.moveToElement(txtUsername)
		.click()
		.keyDown(txtUsername, Keys.SHIFT)
		.sendKeys(txtUsername, "hello")
		.keyUp(txtUsername, Keys.SHIFT)
		.doubleClick(txtUsername)
		.contextClick()
		.build();
		
	seriesOfActions.perform() ;
}
}
