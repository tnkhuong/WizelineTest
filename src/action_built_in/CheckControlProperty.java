package action_built_in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import config.GlobalVariables;

public class CheckControlProperty {
	/**
	 * Description: this action is used to check control's property
	 * @param control is object
	 * @param property is property's name: enabled, value,isSelected
	 * @param expected is expected value of the property
	 * @return None
	 * @author Thuong Le
	 */
	public CheckControlProperty(WebDriver driver, By control, String property,String expected)
	{
		new WaitForControl(driver, control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		WebElement element=driver.findElement(control);
		if(property.equalsIgnoreCase("enabled"))
		{
			boolean exist= element.isEnabled();
			Assert.assertTrue(exist, expected);
		}
		else if(property.equalsIgnoreCase("value"))
		{
			String value=element.getText();
			Assert.assertEquals(value, expected);	
		}
		else if(property.equalsIgnoreCase("isSelected"))
		{
			boolean selected= element.isSelected();
			System.out.println(selected);
			Assert.assertTrue(selected, expected);
		}
		System.out.print("control:" +control+",expected property value:" + expected);
	}

}
