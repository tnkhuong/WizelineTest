package dashboard.test_module.panel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import config.GlobalVariables;
import dashboard.action.hla.AutoHLActions_Dashboard;

//DA_PANEL_TR036-1: Verify "Data Profile" listing of "Add New Panel" control are in alphabetical order
//DA_PANEL_TR036-2: Verify the selected Data Profile is displayed correctly on Edit Panel form

public class DA_PANEL_TC036 extends AutoHLActions_Dashboard {
  

  @Test
  public void DA_PANEL_TC040_TC() {
	  //Step 1: Click on Administer/Panels link
	  //Step 2: Click on Add new link
	  //VP: Verify Data Profile list is in alphabetical order
	  //----Data Profile list is in alphabetical order
	  
	  //Step 3: Enter a display name to display name field (giang - panels)
	  //Step 4: Click on OK button
	  //Step 5: Click on Edit link
	  
	  //VP: Verify the selected Data Profile is displayed correctly on Edit Panel form
	  //----Data Profile "Action Implementation By Status" is displayed on Edit Panel form
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
