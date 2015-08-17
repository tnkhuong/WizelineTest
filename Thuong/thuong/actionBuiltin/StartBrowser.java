package thuong.actionBuiltin;
import org.openqa.selenium.WebDriver;

public class StartBrowser{
	/**
	 * Description: Start browser with desired url
	 * @param browser is opened
	 * @param url is used to start website link
	 * @return None
	 * @author Thuong Le
	 */
	//public static WebDriver driver;
	public StartBrowser(WebDriver driver, String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
}
