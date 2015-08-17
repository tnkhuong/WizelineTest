package action_built_in;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CheckControlPosition {
	/**
	 * Description: this action is used to check the control's position based on base control
	 * @param control is control want to check position
	 * @param base_control is a base position to check control position
	 * @param position: next right, next left
	 * @return None
	 * @author Thuong Le
	 */
	public CheckControlPosition(WebDriver driver, By control, By base_control,String position)
	{
		WebElement element=driver.findElement(control);
		WebElement base_element=driver.findElement(base_control);
		Point location = element.getLocation();
		Point base_location=base_element.getLocation();
		if(position=="next right")
		{
			Assert.assertTrue(location.x < base_location.x);
			Assert.assertTrue(location.y == base_location.y);
		}
		else if (position=="next left")
		{
			Assert.assertTrue(location.x > base_location.x);
			Assert.assertTrue(location.y == base_location.y);
		}
		else
		{
			System.out.print("Not yet input expected position");
		}
	}
}
