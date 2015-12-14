package dashboard.action.hla;

import dashboard.object_repository.EditPanelPage_Dashboard;

public class CheckEditPanelPageInfo_Dashboard extends AutoHLActions_Dashboard{
	EditPanelPage_Dashboard edit_panel_page=new EditPanelPage_Dashboard();
	public CheckEditPanelPageInfo_Dashboard(String[] list_panel_info)
	{
			//Type
			checkControlProperty(edit_panel_page.type_label,"value",list_panel_info[0]);
			//Data Profile
			checkSelectedValue(edit_panel_page.data_profile_combobox, list_panel_info[1]);
			//Display Name
			checkControlProperty(edit_panel_page.display_name_textbox,"value",list_panel_info[2]);
			//Chart title
			checkControlProperty(edit_panel_page.chart_title_textbox,"value",list_panel_info[3]);
			//Show title
			checkControlProperty(edit_panel_page.show_title_checkbox,"isSelected",list_panel_info[4]);
			//Chart type
			checkSelectedValue(edit_panel_page.chart_type_combobox,list_panel_info[5]);
			//Style
			checkControlProperty(edit_panel_page.style_2D_radiobutton,"isSelected",list_panel_info[6]);
			checkControlProperty(edit_panel_page.style_3D_radiobutton,"isSelected",list_panel_info[7]);
			//Category
			checkControlProperty(edit_panel_page.category_combobox, "enabled",list_panel_info[8]);
			checkSelectedValue(edit_panel_page.category_combobox, list_panel_info[9]);
			//Category caption
			checkControlProperty(edit_panel_page.category_caption_textbox,"enabled",list_panel_info[10]);
			checkControlProperty(edit_panel_page.category_caption_textbox,"value",list_panel_info[11]);
			//Series
			checkControlProperty(edit_panel_page.series_combobox,"enabled",list_panel_info[12]);
			checkSelectedValue(edit_panel_page.series_combobox, list_panel_info[13]);
			//Series caption
			checkControlProperty(edit_panel_page.series_caption_textbox,"enabled",list_panel_info[14]);
			checkControlProperty(edit_panel_page.series_caption_textbox,"value",list_panel_info[15]);
			//Legends
			checkControlProperty(edit_panel_page.none_radiobutton, "isSelected",list_panel_info[16]);
			checkControlProperty(edit_panel_page.top_radiobutton,"isSelected",list_panel_info[17]);
			checkControlProperty(edit_panel_page.right_radiobutton,"isSelected",list_panel_info[18]);
			checkControlProperty(edit_panel_page.bottom_radiobutton, "isSelected",list_panel_info[19]);
			checkControlProperty(edit_panel_page.left_radiobutton, "isSelected",list_panel_info[20]);
			//Data labels
			checkControlProperty(edit_panel_page.series_checkbox, "isSelected",list_panel_info[21]);
			checkControlProperty(edit_panel_page.categories_checkbox,"isSelected",list_panel_info[22]);
			checkControlProperty(edit_panel_page.value_checkbox,"isSelected",list_panel_info[23]);
			checkControlProperty(edit_panel_page.percentage_checkbox, "isSelected",list_panel_info[24]);
	}

}
