package dashboard.test_module.panel;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import config.GlobalVariables;
import dashboard.action.hla.AutoHLActions_Dashboard;
import dashboard.object_repository.AddNewPanel_Dashboard;
import dashboard.object_repository.MainPage_Dashboard;

public class DA_PANEL_TC040 extends AutoHLActions_Dashboard{
	MainPage_Dashboard main_page=new MainPage_Dashboard();
	AddNewPanel_Dashboard addnewpanel_page=new AddNewPanel_Dashboard();
  @Test
  public void DA_PANEL_TC040_TC() throws InterruptedException 
  {
	  //Step 1	Navigate to Dashboard login page
	  //Step 2	Select a specific repository 
	  //Step 3	Enter valid Username and Password
	  //Step 4	Click 'Login' button
	  logInDashboard(GlobalVariables.glb_Repository, GlobalVariables.glb_Username, GlobalVariables.glb_Password);
	  //Step 5	Click 'Add Page' button
	  //Step 6	Enter Page Name = main_hung
	  //Step 7	Click 'OK' button
	  addDashboardPage("main_hung","","");
	  //Step 8	Click 'Choose Panels' button below 'main_hung' button
	  click(main_page.choose_panel_button);
	  //Step 9	Click 'Create new panel' button
	  click(main_page.create_new_panel_button);
	  //Step 10	Click 'Chart Type' drop-down menu
	  //Step 11	Select 'Pie' Chart Type
	  selectDropdown(addnewpanel_page.chart_type_combobox,"Pie", "text");
	  //VP	Check that 'Category' is disabled, 'Series' is enabled
	  checkControlStatus(addnewpanel_page.category_combobox, false);
	  checkControlStatus(addnewpanel_page.series_combobox, true);
	  //Step 12	Click 'Chart Type' drop-down menu
	  //Step 13	Select 'Single Bar' Chart Type
	  selectDropdown(addnewpanel_page.chart_type_combobox,"Single Bar", "text");
	  //VP	Check that 'Category' is disabled, 'Series' is enabled
	  checkControlStatus(addnewpanel_page.category_combobox, false);
	  checkControlStatus(addnewpanel_page.series_combobox, true);
	  //Step 14	Click 'Chart Type' drop-down menu
	  //Step 15	Select 'Stacked Bar' Chart Type
	  selectDropdown(addnewpanel_page.chart_type_combobox,"Stacked Bar", "text");
	  //VP	Check that 'Category' ,'Series' are enabled
	  checkControlStatus(addnewpanel_page.category_combobox, true);
	  checkControlStatus(addnewpanel_page.series_combobox, true);
	  //Step 16	Click 'Chart Type' drop-down menu
	  //Step 17	Select 'Group Bar' Chart Type
	  selectDropdown(addnewpanel_page.chart_type_combobox,"Group Bar", "text");
	  //VP	Check that 'Category' ,'Series' are enabled
	  checkControlStatus(addnewpanel_page.category_combobox, true);
	  checkControlStatus(addnewpanel_page.series_combobox, true);
	  //Step 18	Click 'Chart Type' drop-down menu
	  //Step 19	Select 'Line' Chart Type
	  selectDropdown(addnewpanel_page.chart_type_combobox,"Line", "text");
	//VP	Check that 'Category' ,'Series' are enabled
	  checkControlStatus(addnewpanel_page.category_combobox, true);
	  checkControlStatus(addnewpanel_page.series_combobox, true);
  }
  
  @BeforeClass
  @Parameters("browser")
  public void beforeClass(String browser) throws Exception {
	  navigate(browser,GlobalVariables.glb_Url);
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  click(addnewpanel_page.cancel_button);
	  waitUntilControlNotExist(addnewpanel_page.cancel_button, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
	  deletePage("main_hung");
	  exitPage();
  }
}
