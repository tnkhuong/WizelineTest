package action_built_in;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import config.GlobalVariables;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CheckSelectedValue {
	/**
	 * Description: this action is used to check selected value of a combobox
	 * @param control is combobox
	 * @param expected_value
	 * @return None
	 * @author Khuong Truong
	 */
	public CheckSelectedValue(WebDriver driver, By control,String expected_value)
	{
		new WaitForControl(driver, control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		WebElement element=driver.findElement(control);
		Select select=new Select(element);
		String selected_text=select.getFirstSelectedOption().getText();
		Assert.assertEquals(selected_text, expected_value);	
	}
}
