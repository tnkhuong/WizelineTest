package action_built_in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetMatchingXpathCount {
	public static int xpath_count;
	/**
	 * Description: this action is used to count how many xpath items match
	 * @param xpath_string is input xpath string want to count
	 * @return xpath_count is number of xpath items matched
	 * @author Thuong Le
	 */
	public GetMatchingXpathCount(WebDriver driver, String xpath_string)
	{
		xpath_count=driver.findElements(By.xpath(xpath_string)).size();
	}
}
