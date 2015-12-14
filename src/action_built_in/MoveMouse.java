package action_built_in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MoveMouse {

	public MoveMouse(WebDriver driver,By control) {
		// find the menu that have the dropdown showing when we mouse over it.   
		WebElement element = driver.findElement(control);
		//Create instance of action class
		Actions action = new Actions(driver);
		//move mouse over the menu.
		action.moveToElement(element).build().perform();
	}

}
