package thuong.actionHLA;

import config.GlobalVariables;
import object_repository.MainPage;
import object_repository.NewPage;
import actionBuiltIn.AutoAction;

public class AddDashboardPage extends AutoAction{
	MainPage main_page=new MainPage();
	NewPage new_page=new NewPage();
	public AddDashboardPage(String pageName,String parent_page,String display_after) throws InterruptedException{
		 // Step	Click on Add Page icon on Main Page
		SelectSubMenuItem(main_page.setting_link, main_page.add_page_button);
		 // Step	Enter Page Name field
		enterValue(new_page.page_name_textbox,pageName);
		// Step		Select value for parent page dropdown list
		SelectDropdown(new_page.parent_page_combobox, parent_page, "text");
		// Step     Select value for Displayed After dropdown list
		SelectDropdown(new_page.display_after_combobox, display_after, "text");
		 // Step	Click OK button
		clickObject(new_page.ok_button);
		waitUntilControlNotExist(new_page.ok_button, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
	}
}
