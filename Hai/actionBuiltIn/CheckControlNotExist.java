package actionBuiltIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CheckControlNotExist {
	/**
	 * Description: this action is used to check whether element is exist or not
	 * @param control is object
	 * @return None
	 * @author Hai Vu
	 */
	public CheckControlNotExist (WebDriver driver,By control)
	{
		WebElement element=driver.findElement(control);
		boolean exist= element.isDisplayed();
		Assert.assertEquals(exist, false);
	}
}
