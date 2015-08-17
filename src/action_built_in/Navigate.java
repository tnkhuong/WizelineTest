package action_built_in;

import org.openqa.selenium.WebDriver;

public class Navigate {
	
	/**
	 * Description: this action is used to navigate a web site
	 * @param url is address
	 * @return None
	 * @author Khuong Truong
	 */
	public Navigate(WebDriver driver, String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
}
