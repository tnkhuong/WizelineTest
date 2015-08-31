package dashboard.test_module.panel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import config.GlobalVariables;
import dashboard.action.hla.AutoHLActions_Dashboard;
import dashboard.object_repository.AddNewPanel_Dashboard;
import dashboard.object_repository.EditPanelPage_Dashboard;
import dashboard.object_repository.MainPage_Dashboard;
import dashboard.object_repository.PanelConfigurationPage_Dashboard;
import dashboard.object_repository.PanelsPage_Dashboard;

public class DA_PANEL_TC041 extends AutoHLActions_Dashboard {
	
	MainPage_Dashboard main_page=new MainPage_Dashboard();
	PanelsPage_Dashboard panels_page=new PanelsPage_Dashboard();
	AddNewPanel_Dashboard addnewpanel_page=new AddNewPanel_Dashboard();
	EditPanelPage_Dashboard edit_panel_page=new EditPanelPage_Dashboard();
	PanelConfigurationPage_Dashboard panel_configuration = new PanelConfigurationPage_Dashboard();
	private String page_name = "main_hung";
	
	//DA_PANEL_TO041: Verify all settings within "Add New Panel" and "Edit Panel" form stay unchanged when user switches between "2D" and "3D" radio buttons
	
  @Test
  public void DA_PANEL_TC041_TC() throws InterruptedException {
	//Step 1: Navigate to Dashboard login page
	//Step 2: Select a specific repository (SampleRepository)
	//Step 3: Enter valid Username and Password (adminstrator/(blank))
	//Step 4: Click 'Login' button
	  deletePage(page_name);
	  selectSubMenuItem(main_page.administer_link, main_page.panels_link);
	  deletePanel_Dashboard("hung_panel");
	  
	//Step 5: Click 'Add Page' button
	//Step 6: Enter Page Name (main_hung)
	//Step 7: Click 'OK' button
	  addDashboardPage(page_name,"","");
	  
	//Step 8: Click 'Choose Panels' button below 'main_hung' button
	  click(main_page.choose_panel_button);
	  
	//Step 9: Click 'Create new panel' button
	  click(main_page.create_new_panel_button);
	  
	//Step 10: Click 'Chart Type' drop-down menu 	  
	//Step 11: Select a specific Chart Type (Stacked Bar)
	  selectDropdown(addnewpanel_page.chart_type_combobox,"Stacked Bar", "text");
	  
	//Step 12: Select 'Data Profile' drop-down menu (Test Case Execution)
	  selectDropdown(addnewpanel_page.data_profile_combobox,"Test Case Execution", "text");
	  
	//Step 13: Enter 'Display Name' and 'Chart Title' (hung_panel/hung_chart)
	  enter(addnewpanel_page.display_name_textbox,"hung_panel");
	  enter(addnewpanel_page.chart_title_textbox,"hung_chart");
	  
	//Step 14: Select 'Show Title' checkbox (On)
	  set(addnewpanel_page.show_title_checkbox, true);
	  
	//Step 15: Select 'Legends' radio button (Top)
	  set(addnewpanel_page.top_radiobutton,true);
	  
	//Step 16: Select 'Style' radio button (3D)
	  set(addnewpanel_page.style_3D_radiobutton,true);
	  
	//VP: Check that settings of 'Chart Type', 'Data Profile', 'Display Name', 'Chart Title', 'Show Title' and 'Legends' stay unchanged.
	  checkControlProperty(addnewpanel_page.chart_type_radiobutton,"isSelected","true");
	  checkSelectedValue(addnewpanel_page.data_profile_combobox, "Test Case Execution");
	  checkControlProperty(addnewpanel_page.display_name_textbox,"value","hung_panel");
	  checkControlProperty(addnewpanel_page.chart_title_textbox,"value","hung_chart");
	  checkControlProperty(addnewpanel_page.show_title_checkbox,"isSelected","true");
	  checkControlProperty(addnewpanel_page.top_radiobutton,"isSelected","true");
	  
	//Step 17: Select 'Style' radio button (2D)
	  set(addnewpanel_page.style_2D_radiobutton,true);
	  
	//VP: Check that settings of 'Chart Type', 'Data Profile', 'Display Name', 'Chart Title', 'Show Title' and 'Legends' stay unchanged.
	  checkControlProperty(addnewpanel_page.chart_type_radiobutton,"isSelected","true");
	  checkSelectedValue(addnewpanel_page.data_profile_combobox, "Test Case Execution");
	  checkControlProperty(addnewpanel_page.display_name_textbox,"value","hung_panel");
	  checkControlProperty(addnewpanel_page.chart_title_textbox,"value","hung_chart");
	  checkControlProperty(addnewpanel_page.show_title_checkbox,"isSelected","true");
	  checkControlProperty(addnewpanel_page.top_radiobutton,"isSelected","true");
	  
	//Step 18: Click OK button
	  selectDropdown(addnewpanel_page.category_combobox, 1);
	  selectDropdown(addnewpanel_page.series_combobox, 2);
	  click(addnewpanel_page.ok_button);
	  
	//Step 19: Select a page in drop-down menu (main_hung)
	  selectDropdown(panel_configuration.select_page_combobox, "main_hung", "text");
	  
	//Step 20: Enter path of Folder (/Dashboard) 
	//Step 21: Click OK button
	  click(panel_configuration.ok_button);
	  
	//Step 22: Click 'Edit Panel' button of panel 'hung_panel'
	  click(main_page.edit_panel_link);
	  
	//Step 23: Select 'Style' radio button (3D)
	  set(edit_panel_page.style_3D_radiobutton,true);
	  
	//VP: Check that settings of 'Chart Type', 'Data Profile', 'Display Name', 'Chart Title', 'Show Title' and 'Legends' stay unchanged.
	  //checkControlProperty(edit_panel_page.chart_type_radiobutton,"isSelected","true");
	  checkSelectedValue(edit_panel_page.data_profile_combobox, "Test Case Execution");
	  checkControlProperty(edit_panel_page.display_name_textbox,"value","hung_panel");
	  checkControlProperty(edit_panel_page.chart_title_textbox,"value","hung_chart");
	  checkControlProperty(edit_panel_page.show_title_checkbox,"isSelected","true");
	  checkControlProperty(edit_panel_page.top_radiobutton,"isSelected","true");
	  
	//Step 24: Select 'Style' radio button (2D)
	  set(edit_panel_page.style_2D_radiobutton,true);
	  
	//VP: Check that settings of 'Chart Type', 'Data Profile', 'Display Name', 'Chart Title', 'Show Title' and 'Legends' stay unchanged.
	  //checkControlProperty(edit_panel_page.chart_type_radiobutton,"isSelected","true");
	  checkSelectedValue(edit_panel_page.data_profile_combobox, "Test Case Execution");
	  checkControlProperty(edit_panel_page.display_name_textbox,"value","hung_panel");
	  checkControlProperty(edit_panel_page.chart_title_textbox,"value","hung_chart");
	  checkControlProperty(edit_panel_page.show_title_checkbox,"isSelected","true");
	  checkControlProperty(edit_panel_page.top_radiobutton,"isSelected","true");
	  click(edit_panel_page.cancel_button);
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  navigate("firefox",GlobalVariables.glb_Url);
	  logInDashboard(GlobalVariables.glb_Repository, GlobalVariables.glb_Username, GlobalVariables.glb_Password);	  
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  deletePage(page_name);
	  selectSubMenuItem(main_page.administer_link, main_page.panels_link);
	  deletePanel_Dashboard("hung_panel");
	  exitPage();
  }
}
