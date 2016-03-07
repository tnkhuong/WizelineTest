package action_built_in;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import config.GlobalVariables;

public class CheckControlExist {
	/**
	 * Description: this action is used to check whether element is existed
	 * @param control is object
	 * @param timeout is a time period waiting until the control is existed
	 * @return None
	 * @author Khuong Truong
	 */

	public CheckControlExist(WebDriver driver, By control) {
		new WaitForPageLoad(driver, GlobalVariables.DEFAULT_WAIT_4_PAGE);
		boolean present;
		try 
		{
		   driver.findElement(control);
		   present = true;
		} catch (NoSuchElementException e) {
		   present = false;
		}
		Assert.assertEquals(present, true);
	}
}
