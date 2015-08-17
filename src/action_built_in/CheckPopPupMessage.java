package action_built_in;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckPopPupMessage {
	/**
	 * Description: this action is used to switch to popup window and check its mesg
	 * @parm expectedMesg is the expected message displaying on the popup
	 * @return None
	 * @author Thuong Le
	 */
	public CheckPopPupMessage(WebDriver driver, String expectedMesg)
	{
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals(alert.getText().trim(), expectedMesg.trim());
	}
}
