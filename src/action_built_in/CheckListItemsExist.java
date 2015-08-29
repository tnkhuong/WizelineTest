package action_built_in;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import config.GlobalVariables;

public class CheckListItemsExist extends AutoAction {
	public CheckListItemsExist(WebDriver driver, By list_control, String[] list_item)
	{
		waitForElement(list_control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		WebElement element= driver.findElement(list_control);
		Select select=new Select(element);
		List<WebElement> control_item_list= select.getOptions();
		boolean flag=false;
		for(int i =0; i<list_item.length ; i++)
		{
			String expected_item=list_item[i];
			System.out.println("Expected item:" +expected_item);
			for(int j=0; j<control_item_list.size(); j++)
			{
				String item=control_item_list.get(j).getText();
				System.out.println("list item:" + item);
				if (item.equalsIgnoreCase(expected_item))
				{
					flag=true;
					System.out.println("Item " + expected_item + " found in list");
				}
			}
		}
		Assert.assertFalse(flag);
	}

}
