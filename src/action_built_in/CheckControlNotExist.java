package action_built_in;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import config.GlobalVariables;

public class CheckControlNotExist {
	/**
	 * Description: this action is used to check whether element is not existed
	 * @param control is object
	 * @param timeout is a time period waiting until the control is disappeared
	 * @return None
	 * @author Khuong Truong
	 */

	public CheckControlNotExist(WebDriver driver, By control) {
		new WaitForPageLoad(driver, GlobalVariables.DEFAULT_WAIT_4_PAGE);
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
