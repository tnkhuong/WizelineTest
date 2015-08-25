package dashboard.action.hla;

import dashboard.object_repository.AddNewPanel_Dashboard;

public class CheckPanelInfo extends AutoHLActions_Dashboard{
	AddNewPanel_Dashboard addnewpanel_page=new AddNewPanel_Dashboard();
	public CheckPanelInfo(String[] list_panel_info)
	{
		//Type
		checkControlProperty(addnewpanel_page.chart_type_radiobutton,"isSelected",list_panel_info[0]);
		checkControlProperty(addnewpanel_page.indicator_type_radiobutton,"isSelected",list_panel_info[1]);
		checkControlProperty(addnewpanel_page.report_type_radiobutton, "isSelected",list_panel_info[2]);
		checkControlProperty(addnewpanel_page.heatmap_type_radiobutton,"isSelected",list_panel_info[3]);
		//Data Profile
		checkSelectedValue(addnewpanel_page.data_profile_combobox, list_panel_info[4]);
		//Display Name
		checkControlProperty(addnewpanel_page.display_name_textbox,"value",list_panel_info[5]);
		//Chart title
		checkControlProperty(addnewpanel_page.chart_title_textbox,"value",list_panel_info[6]);
		//Show title
		checkControlProperty(addnewpanel_page.show_title_checkbox,"isSelected",list_panel_info[7]);
		//Chart type
		checkSelectedValue(addnewpanel_page.chart_type_combobox,list_panel_info[8]);
		//Style
		checkControlProperty(addnewpanel_page.style_2D_radiobutton,"isSelected",list_panel_info[9]);
		checkControlProperty(addnewpanel_page.style_3D_radiobutton,"isSelected",list_panel_info[10]);
		//Category
		checkControlProperty(addnewpanel_page.category_combobox, "enabled",list_panel_info[11]);
		checkSelectedValue(addnewpanel_page.category_combobox, list_panel_info[12]);
		//Category caption
		checkControlProperty(addnewpanel_page.category_caption_textbox,"enabled",list_panel_info[13]);
		checkControlProperty(addnewpanel_page.category_caption_textbox,"value",list_panel_info[14]);
		//Series
		checkControlProperty(addnewpanel_page.series_combobox,"enabled",list_panel_info[15]);
		checkSelectedValue(addnewpanel_page.series_combobox, list_panel_info[16]);
		//Series caption
		checkControlProperty(addnewpanel_page.series_caption_textbox,"enabled",list_panel_info[17]);
		checkControlProperty(addnewpanel_page.series_caption_textbox,"value",list_panel_info[18]);
		//Legends
		checkControlProperty(addnewpanel_page.none_radiobutton, "isSelected",list_panel_info[19]);
		checkControlProperty(addnewpanel_page.top_radiobutton,"isSelected",list_panel_info[20]);
		checkControlProperty(addnewpanel_page.right_radiobutton,"isSelected",list_panel_info[21]);
		checkControlProperty(addnewpanel_page.bottom_radiobutton, "isSelected",list_panel_info[22]);
		checkControlProperty(addnewpanel_page.left_radiobutton, "isSelected",list_panel_info[23]);
		//Data labels
		checkControlProperty(addnewpanel_page.series_checkbox, "isSelected",list_panel_info[24]);
		checkControlProperty(addnewpanel_page.categories_checkbox,"isSelected",list_panel_info[25]);
		checkControlProperty(addnewpanel_page.value_checkbox,"isSelected",list_panel_info[26]);
		checkControlProperty(addnewpanel_page.percentage_checkbox, "isSelected",list_panel_info[27]);
	}
}
