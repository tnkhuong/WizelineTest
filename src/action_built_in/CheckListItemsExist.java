package action_built_in;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.GlobalVariables;

public class CheckListItemsExist extends AutoAction {
	public CheckListItemsExist(WebDriver driver, By list_control, String[] list_item)
	{
		waitForElement(list_control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		List<String> control_item_list= getListItemsFromDropDown(list_control);
		boolean flag=false;
		for(int i =0; i<list_item.length ; i++)
		{
			String expected_item=list_item[i];
			System.out.println("Expected item:" +expected_item);
			for(int j=0; j<control_item_list.size(); j++)
			{
				String item=control_item_list.get(j);
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
