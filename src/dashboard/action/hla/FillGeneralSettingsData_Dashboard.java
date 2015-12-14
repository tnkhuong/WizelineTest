package dashboard.action.hla;

import dashboard.object_repository.GeneralSettingsPage_Dashboard;

public class FillGeneralSettingsData_Dashboard extends action_built_in.AutoAction{
	GeneralSettingsPage_Dashboard general_settings_page=new GeneralSettingsPage_Dashboard();
	public FillGeneralSettingsData_Dashboard(String name)
	{
		if(!name.isEmpty()) enter(general_settings_page.name_textbox, name);
	}
	public FillGeneralSettingsData_Dashboard(String name, String item_type, String related_data)
	{
		if(!name.isEmpty()) enter(general_settings_page.name_textbox, name);
		if(item_type.isEmpty()) selectDropdown(general_settings_page.item_type_combobox, item_type,"text");
		if(related_data.isEmpty()) selectDropdown(general_settings_page.related_data_combobox, related_data,"text");
	}
}
