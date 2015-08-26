package dashboard.action.hla;

import config.GlobalVariables;
import dashboard.object_repository.AddNewPanel_Dashboard;

public class AddPanel_Dashboard extends AutoHLActions_Dashboard{
	AddNewPanel_Dashboard addnewpanel_page=new AddNewPanel_Dashboard();
	public AddPanel_Dashboard(String display_name, String series_name)
	{
		waitForElement(addnewpanel_page.display_name_textbox, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		if(!display_name.isEmpty())
			enter(addnewpanel_page.display_name_textbox, display_name);
		if(!series_name.isEmpty())
			selectDropdown(addnewpanel_page.series_combobox, series_name, "text");
		click(addnewpanel_page.ok_button);
	}

}
