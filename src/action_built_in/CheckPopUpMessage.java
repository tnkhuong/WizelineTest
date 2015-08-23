package action_built_in;
import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CheckPopUpMessage {
	/**
	 * Description: this action is used to switch to popup window and check its mesg
	 * @parm expectedMesg is the expected message displaying on the popup
	 * @return None
	 * @author Thuong Le
	 */
	public CheckPopUpMessage(WebDriver driver, String expectedMesg) throws UnhandledAlertException
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals(alert.getText().trim(), expectedMesg.trim());
	}
}
