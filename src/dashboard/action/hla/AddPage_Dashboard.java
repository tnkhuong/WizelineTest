package dashboard.action.hla;

import config.GlobalVariables;
import dashboard.object_repository.MainPage_Dashboard;
import dashboard.object_repository.NewPage_Dashboard;

public class AddPage_Dashboard extends AutoHLActions_Dashboard{
	
	MainPage_Dashboard main_page=new MainPage_Dashboard();
	NewPage_Dashboard new_page=new NewPage_Dashboard();
	
	public AddPage_Dashboard(String pageName,String parent_page,String display_after) throws InterruptedException{
		 // Step	Click on Add Page icon on Main Page
		selectSubMenuItem(main_page.setting_link, main_page.add_page_button);
		 // Step	Enter Page Name field
		enter(new_page.page_name_textbox,pageName);
		// Step		Select value for parent page dropdown list
		selectDropdown(new_page.parent_page_combobox, parent_page, "text");
		// Step     Select value for Displayed After dropdown list
		selectDropdown(new_page.display_after_combobox, display_after, "text");
		 // Step	Click OK button
		click(new_page.ok_button);
		waitUntilControlNotExist(new_page.ok_button, GlobalVariables.DEFAULT_WAIT_4_CONTROL*2);
		waitForPageLoad(GlobalVariables.DEFAULT_WAIT_4_CONTROL*2);
	}
	public AddPage_Dashboard(String pageName,String parent_page,String numberOfColumns,String display_after,boolean publicOption) throws InterruptedException{
		 // Step	Click on Add Page icon on Main Page
		selectSubMenuItem(main_page.setting_link, main_page.add_page_button);
		 // Step	Enter Page Name field
		enter(new_page.page_name_textbox,pageName);
		// Step		Select value for parent page dropdown list
		if (parent_page!="")
			selectDropdown(new_page.parent_page_combobox, parent_page, "text");
		//Step		Select Number of Columns
		if (numberOfColumns!=""||numberOfColumns!="2")
			selectDropdown(new_page.columnNumber_combobox, numberOfColumns, "text");
		// Step     Select value for Displayed After dropdown list
		if (display_after!="")
			selectDropdown(new_page.display_after_combobox, display_after, "text");
		// Step Check Public Option or Not
		set(new_page.public_checkbox, publicOption);
		// Step	Click OK button
		click(new_page.ok_button);
		waitUntilControlNotExist(new_page.ok_button, GlobalVariables.DEFAULT_WAIT_4_CONTROL*2);
		waitForPageLoad(GlobalVariables.DEFAULT_WAIT_4_CONTROL*2);
	}
}
