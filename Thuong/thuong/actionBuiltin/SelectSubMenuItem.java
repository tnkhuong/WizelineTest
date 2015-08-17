package thuong.actionBuiltin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import config.GlobalVariables;

public class SelectSubMenuItem {
	public SelectSubMenuItem(WebDriver driver, By hover_control, By selected_control)
	{
		new WaitForControl(driver, hover_control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		WebElement hover_element=driver.findElement(hover_control);
		Actions action=new Actions(driver);
		action.moveToElement(hover_element).perform();
		WebElement selected_element=driver.findElement(selected_control);
		new WaitForControl(driver, selected_control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		selected_element.click();
	}

}
