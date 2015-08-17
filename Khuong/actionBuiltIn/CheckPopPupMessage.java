package actionBuiltIn;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckPopPupMessage {
	/**
	 * Description: this action is used to switch to popup window and work with it
	 * @return None
	 * @author Thuong Le
	 */
	public static void execute(WebDriver driver, String expectedMesg, String closepopup)
	{
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals(alert.getText(), expectedMesg);
		
		if (closepopup.equalsIgnoreCase("yes"))
		{
			alert.dismiss();
		}
		else if (closepopup.equalsIgnoreCase("no"))
		{
			return;
		}
		else
		{
			System.out.println("The value inputed invalid!");
		}
	}
}
