package actionBuiltIn;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckPopUpMessage {
	/**
	 * Description: this action is used to switch to popup window and work with it
	 * @return None
	 * @author Thuong Le
	 */
	public CheckPopUpMessage (WebDriver driver, String expectedMesg)
	{
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals(alert.getText(), expectedMesg);
		alert.dismiss();
	}

}
