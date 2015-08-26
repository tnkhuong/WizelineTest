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
		//Set variables
		boolean expected_status = false;
		if(expected=="false")
			expected_status=false;
		else if(expected=="true")
			expected_status= true;
		//main steps
		new WaitForControl(driver, control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		WebElement element=driver.findElement(control);
		System.out.println("control:" +control);
		if(property.equalsIgnoreCase("enabled"))
		{
			boolean exist= element.isEnabled();
			Assert.assertEquals(exist, expected_status);
		}
		else if(property.equalsIgnoreCase("value"))
		{
			String value=element.getText();
			System.out.println("expected property value:" + expected +", actual value:"+ value);
			Assert.assertEquals(value.trim(), expected.trim());
		}
		else if(property.equalsIgnoreCase("isSelected"))
		{
			boolean status=element.isSelected();
			System.out.println("expected property value:" + expected +", actual value:"+ status);
			Assert.assertEquals(status, expected_status);
		}
	}

}
