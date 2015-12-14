package action_built_in;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUntilControlNotExist {
	public WaitUntilControlNotExist(WebDriver driver,By control, int timeout) throws InterruptedException
    {
			WebDriverWait wait = new WebDriverWait(driver,timeout);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(control));
    }
}
