package action_built_in;

import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmPopup {
	/**
	 * Description: this action is used to switch to popup window and work with it
	 * @param option is selected option (yes or no)
	 * @return None
	 * @author Thuong Le
	 * @throws InterruptedException 
	 */
	public ConfirmPopup(WebDriver driver, String option) throws UnhandledAlertException
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		if(option!=null)
			if (option=="yes")
				alert.accept();
			else if (option=="no")
				alert.dismiss();
	}
}
