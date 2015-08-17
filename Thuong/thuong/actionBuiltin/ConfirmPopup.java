package thuong.actionBuiltin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class ConfirmPopup {
	/**
	 * Description: this action is used to switch to popup window and work with it
	 * @param option is selected option (yes or no)
	 * @return None
	 * @author Thuong Le
	 */
	public ConfirmPopup(WebDriver driver, String option)
	{
		Alert alert = driver.switchTo().alert();
		if(option!=null)
			if (option=="yes")
				alert.accept();
			else if (option=="no")
				alert.dismiss();
	}
}
