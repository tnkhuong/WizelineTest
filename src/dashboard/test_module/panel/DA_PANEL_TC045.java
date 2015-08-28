package dashboard.test_module.panel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import config.GlobalVariables;
import dashboard.action.hla.AutoHLActions_Dashboard;
import dashboard.object_repository.MainPage_Dashboard;
import dashboard.object_repository.PanelConfigurationPage_Dashboard;

public class DA_PANEL_TC045 extends AutoHLActions_Dashboard{
	MainPage_Dashboard main_page=new MainPage_Dashboard();
	PanelConfigurationPage_Dashboard panel_config_page=new PanelConfigurationPage_Dashboard();
  @Test
  public void DA_PANEL_TC045_TC() throws InterruptedException {
	  //Step 1	Navigate to Dashboard login page
	  //Step 2	Select a specific repository 
	  //Step 3	Enter valid Username and Password
	  //Step 4	Click 'Login' button
	  logInDashboard(GlobalVariables.glb_Repository, GlobalVariables.glb_Username, GlobalVariables.glb_Password);
	  //Step 5	Click 'Add Page' button
	  //Step 6	Enter Page Name: main_hung1
	  //Step 7	Click 'OK' button
	  addDashboardPage("main_hung1", "", "");
	  //Step 8	Click 'Add Page' button
	  //Step 9	Enter Page Name: main_hung2
	  //Step 10	Click 'OK' button
	  addDashboardPage("main_hung2", "", "");
	  //Step 11	Click 'Add Page' button
	  //Step 12	Enter Page Name: main_hung3
	  //Step 13	Click 'OK' button
	  addDashboardPage("main_hung3", "", "");
	  //Step 14	Click 'Choose panels' button
	  click(main_page.choose_panel_button);
	  //Step 15	Click on any Chart panel instance
	  selectPanelsItem_Dashboard("Charts", "Action Implementation By Status");
	  //Step 16	Click 'Select Page*' drop-down menu
	  //VP	Check that 'Select Page*' drop-down menu contains 3 items: 'main_hung1', 'main_hung2' and 'main_hung3'
	  String[] list_item= {"main_hung1","main_hung2","main_hung3"};
	  checkListItemsExist(panel_config_page.select_page_combobox, list_item);
  }
  @BeforeClass
  @Parameters("browser")
  public void beforeClass(String browser) throws Exception {
  navigate(browser,GlobalVariables.glb_Url);
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  click(panel_config_page.cancel_button);
	  deletePage("main_hung1");
	  deletePage("main_hung2");
	  deletePage("main_hung3");
	  exitPage();
  }
}
