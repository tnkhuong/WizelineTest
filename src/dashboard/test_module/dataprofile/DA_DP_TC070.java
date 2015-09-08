package dashboard.test_module.dataprofile;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import config.GlobalVariables;
import dashboard.action.hla.AutoHLActions_Dashboard;
import dashboard.action.hla.SelectSubMenuItem;
import dashboard.object_repository.MainPage_Dashboard;

public class DA_DP_TC070 extends AutoHLActions_Dashboard {
	MainPage_Dashboard main_page=new MainPage_Dashboard();
  @Test
  //DA_DP_TC070:	Verify Data Profiles are listed alphabetically.				
  public void DA_DP_TC070_TC() {
	  //Step 1	Navigate to Dashboard login page
	  //Step 2	Select a specific repository 
	  //Step 3	Enter valid Username and Password
	  //Step 4	Click Login
	  logInDashboard(GlobalVariables.glb_Repository, GlobalVariables.glb_Username, GlobalVariables.glb_Password);
	  //Step 5	Click Administer->Data Profiles
	  selectSubMenuItem(main_page.administer_link, main_page.data_profiles_link);
	  //VP	Check Data Profiles are listed alphabetically
  }
  @BeforeClass
  @Parameters("browser")
  public void beforeClass(String browser) throws Exception {
	  navigate(browser,GlobalVariables.glb_Url);
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  exitPage();
  }
}
