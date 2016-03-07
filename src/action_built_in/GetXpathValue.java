package action_built_in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetXpathValue {
	public static String xpath_value;
	/**
	 * Description: this action is used to get value of the input xpath string.
	 * @param xpath_string is input xpath string want to count
	 * @return xpath_count is number of xpath items matched
	 * @author Khuong Truong
	 */
	public GetXpathValue(WebDriver driver, String xpath_string)
	{
		xpath_value=driver.findElement(By.xpath(xpath_string)).getText();
	}
}
