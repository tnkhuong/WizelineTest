package thuong.actionBuiltin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


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
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.visibilityOfElementLocated(control));
	 }
}
