package actionBuiltIn;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class WaitForPage {
	/**
	 * Description: Wait for page load successfully
	 * @param timeout is waiting time
	 * @return None
	 * @author copy from nguoi khac
	 */
	public WaitForPage (WebDriver driver,int timeout )
	{

	    Wait<WebDriver> wait = new WebDriverWait(driver, timeout);
	    wait.until(new Function<WebDriver, Boolean>() {
	        public Boolean apply(WebDriver driver)
	        {
	            return String
	                .valueOf(((JavascriptExecutor)driver).executeScript("return document.readyState"))
	                .equals("complete");    
	        }
	    });
	}
	public WaitForPage (WebDriver driver, String pageTitle,int timeout )
	{
		String currTitle = driver.getTitle();
		while (currTitle!=pageTitle&& timeout>0){
			//Sleeper;
			
		}
	}
}
