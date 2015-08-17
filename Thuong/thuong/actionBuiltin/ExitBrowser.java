package thuong.actionBuiltin;

import org.openqa.selenium.WebDriver;

public class ExitBrowser {
	public ExitBrowser(WebDriver driver)
	{
		driver.quit();
	}
}
