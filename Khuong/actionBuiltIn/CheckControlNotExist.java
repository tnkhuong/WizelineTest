package actionBuiltIn;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import config.GlobalVariables;

public class CheckControlNotExist {

	public CheckControlNotExist(WebDriver driver,By control) {
		/*WebElement element=driver.findElement(control);
		boolean exist= element.isDisplayed()();
		Assert.assertEquals(exist, false);*/
		//new WaitForPageLoad(driver, GlobalVariables.DEFAULT_WAIT_4_PAGE);
		boolean present;
		try 
		{
		   driver.findElement(control);
		   present = true;
		} catch (NoSuchElementException e) {
		   present = false;
		}
		Assert.assertEquals(present, false);
	}
}
