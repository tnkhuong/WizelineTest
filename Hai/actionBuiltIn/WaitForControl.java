package actionBuiltIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class WaitForControl {
	/**
	 * Description: this action is used to wait for an element on web page
	 * @param control is object
	 * @param timeout is waiting time for control to appear
	 * @return None
	 * @author Thuong Le
	 */
	public WaitForControl(WebDriver driver,By control, long timeout)
	 {
		try {
			WebDriverWait wait = new WebDriverWait(driver , timeout);

			Function<WebDriver, WebElement> waitFunction = new Function<WebDriver, WebElement>() {
			//@Override
			public WebElement apply(WebDriver driver) {
				return driver.findElement(control);
			}
		};
		wait.until(waitFunction);
	  } catch (Exception e) 
	  	{
		  System.out.println("Element doesn't exist");
	  	}
	 }
}
