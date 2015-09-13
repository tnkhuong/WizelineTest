package dashboard.action.hla;

import org.openqa.selenium.By;

import config.GlobalVariables;
import dashboard.object_repository.SortFieldsPage_Dashboard;

public class AddLevelSortedForFields_Dashboard extends action_built_in.AutoAction{
	SortFieldsPage_Dashboard sort_fields_page= new SortFieldsPage_Dashboard();
	public AddLevelSortedForFields_Dashboard(String selected_fields)
	{
		String relace_value= selected_fields.replace("|", ",");
		String[] field_name_list=relace_value.split(",");
		for(int i=0; i<field_name_list.length; i++)
		{
			selectDropdown(sort_fields_page.field_combobox, field_name_list[i], "text");
			click(sort_fields_page.add_level_button);
			waitForElement(By.xpath("//span[@class='sortFieldName' and text()='" + field_name_list[i] + "']"), GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		}
	}
}
