package actionBuiltIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GetDriver {
	public static WebDriver driver=null;
    public static WebDriver getFFDriver()
    {
        return new FirefoxDriver();
    }
    public static WebDriver getChrDriver()
    {
        return new ChromeDriver();
    }
    public static WebDriver getIEDriver()
    {
        return new InternetExplorerDriver();
    }
}
