package dashboard.test_module.panel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import config.GlobalVariables;
import dashboard.action.hla.AutoHLActions_Dashboard;

public class DA_PANEL_TC043 extends AutoHLActions_Dashboard{
  @Test
  public void DA_PANEL_TC043_TC() {
	//Step 1: Navigate to Dashboard login page
	//Step 2: Select a specific repository 
	//Step 3: Enter valid Username and Password
	//Step 4: Click 'Login' button
	//Step 5: Click 'Add Page' button
	//Step 6: Enter Page Name
	//Step 7: Click 'OK' button
	//Step 8: Click 'Choose Panels' button below 'main_hung' button
	//Step 9: Click 'Create new panel' button
	//Step 10: Click 'Chart Type' drop-down menu
	//Step 11: Select 'Pie' Chart Type
	//VP: Check that 'Categories' checkbox is disabled, 'Series' checkbox, 'Value' checkbox and 'Percentage' checkbox are enabled
	//Step 12: Click 'Chart Type' drop-down menu
	//Step 13: Select 'Single Bar' Chart Type
	//VP: Check that 'Categories' checkbox is disabled, 'Series' checkbox, 'Value' checkbox and 'Percentage' checkbox are enabled
	//Step 14: Click 'Chart Type' drop-down menu
	//Step 15: Select 'Stacked Bar' Chart Type
	//VP: Check that 'Categories' checkbox, 'Series' checkbox, 'Value' checkbox and 'Percentage' checkbox are enabled
	//Step 16: Click 'Chart Type' drop-down menu
	//Step 17: Select 'Group Bar' Chart Type
	//VP: Check that 'Categories' checkbox, 'Series' checkbox, 'Value' checkbox and 'Percentage' checkbox are enabled
	//Step 18: Click 'Chart Type' drop-down menu
	//Step 19: Select 'Line' Chart Type
	//VP: Check that 'Categories' checkbox, 'Series' checkbox, 'Value' checkbox and 'Percentage' checkbox are disabled
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  navigate("firefox",GlobalVariables.glb_Url);
	  logInDashboard(GlobalVariables.glb_Repository, GlobalVariables.glb_Username, GlobalVariables.glb_Password);
  }

  @AfterTest
  public void afterTest() {
  }

}
