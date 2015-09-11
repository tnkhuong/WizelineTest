package dashboard.test_module.filterfields;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import config.GlobalVariables;
import dashboard.action.hla.AutoHLActions_Dashboard;
import dashboard.object_repository.DataProfilePage_Dashboard;
import dashboard.object_repository.FilterFieldsPage_Dashboard;
import dashboard.object_repository.GeneralSettingsPage_Dashboard;
import dashboard.object_repository.MainPage_Dashboard;

public class DA_DP_TC092 extends AutoHLActions_Dashboard {
  //DA_DP_TC092 :	Verify there displays "Recommended Value" dropped down menu on expanded mode under "Value" field when this field is on focused or cursored
	MainPage_Dashboard main_page=new MainPage_Dashboard();
	DataProfilePage_Dashboard data_profile_page= new DataProfilePage_Dashboard();
	FilterFieldsPage_Dashboard filter_page=new FilterFieldsPage_Dashboard();
	GeneralSettingsPage_Dashboard general_settings_page=new GeneralSettingsPage_Dashboard();
  @Test
  public void DA_DP_TC092_TC() {
	  //Step 1	Log in Dashboard
	  logInDashboard(GlobalVariables.glb_Repository, GlobalVariables.glb_Username, GlobalVariables.glb_Password);
	  //Step 2	Navigate to Data Profiles page
	  selectSubMenuItem(main_page.administer_link, main_page.data_profiles_link);
	  //Step 3	Click on "Add New"
	  click(data_profile_page.add_new_link);
	  //Step 4	Input to "Name *" field
	  fillGeneralSettingsData_Dashboard("DA_DP_TC092");
	  //Step 5	Click on Next button
	  click(general_settings_page.next_button);
	  //Step 6	Navigate to "Filter Fields" page
	  selectDataProfileTab_Dashboard("Filter Fields");
	  //VP	Check there displays "Recommended Value" dropped down menu on expanded mode under "Value" field when this field is on focused or cursored
	  click(filter_page.value_textbox);
	  checkControlExist(filter_page.result_popup_menu, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
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
