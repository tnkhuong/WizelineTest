package dashboard.action.hla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import action_built_in.WaitForControl;
import config.GlobalVariables;

public class SelectSubMenuItem extends action_built_in.AutoAction{
	public SelectSubMenuItem(WebDriver driver, By hover_control, By selected_control)
	{
		new WaitForControl(driver, hover_control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		WebElement hover_element=driver.findElement(hover_control);
		Actions action=new Actions(driver);
		action.moveToElement(hover_element).perform();
		new WaitForControl(driver, selected_control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		click(selected_control);
	}

}
