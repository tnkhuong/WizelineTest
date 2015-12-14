package action_built_in;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import config.GlobalVariables;

public class CheckListItemsExist extends AutoAction {
	public CheckListItemsExist(WebDriver driver, By list_control,String[] list_item) 
		{
		waitForElement(list_control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		List<String> control_item_list = getListItemsFromDropDown(list_control);
		boolean flag = true;
		boolean final_result = true;
		String items_not_found="";
		for (int i = 0; i < list_item.length; i++) {
			String expected_item = list_item[i];
			for (int j = 0; j < control_item_list.size(); j++) {
				String item = control_item_list.get(j);
				if (item.equalsIgnoreCase(expected_item)) {
					flag = true;
					break;
				}
				flag = false;
			}
			
			if (!flag) {
				items_not_found= expected_item + " ," + items_not_found;
				final_result = false;
			}
		}
		System.out.println("CheckListItemExist: " + final_result);
		if (items_not_found!="")
		    System.out.println("Items " + items_not_found + " are not found in the list");
		else 
			System.out.println("All items are found in the list");
		}

}
