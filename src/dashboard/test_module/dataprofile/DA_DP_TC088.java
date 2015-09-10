package dashboard.test_module.dataprofile;

import org.openqa.selenium.interactions.ClickAndHoldAction;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import config.GlobalVariables;
import dashboard.action.hla.AutoHLActions_Dashboard;
import dashboard.object_repository.DataProfilePage_Dashboard;
import dashboard.object_repository.DisplayFieldsPage_Dashboard;
import dashboard.object_repository.GeneralSettingsPage_Dashboard;
import dashboard.object_repository.MainPage_Dashboard;

public class DA_DP_TC088 extends AutoHLActions_Dashboard{
	MainPage_Dashboard main_page=new MainPage_Dashboard();
	DataProfilePage_Dashboard data_profile_page= new DataProfilePage_Dashboard();
	GeneralSettingsPage_Dashboard general_settings_page=new GeneralSettingsPage_Dashboard();
	DisplayFieldsPage_Dashboard display_field_page=new DisplayFieldsPage_Dashboard();
  @Test
  //DA_DP_TC088	 Verify user is able to change the level of sorting amongst fields by using 'Up' and 'Down' arrow.
  public void DA_DP_TC088_TC() {
	  //Step 1	Navigate to Dashboard login page	
	  //Step 2	Select a specific repository 	SampleRepository
	  //Step 3	Enter valid Username and Password	administrator/(blank)
	  //Step 4	Click Login	
	  logInDashboard(GlobalVariables.glb_Repository, GlobalVariables.glb_Username, GlobalVariables.glb_Password);
	  //Step 5	Click Administer->Data Profiles
	  selectSubMenuItem(main_page.administer_link, main_page.data_profiles_link);
	  //Step 6	Click Add new link	
	  click(data_profile_page.add_new_link);
	  //Step 7	Create new data profile	DA_DP_TC088
	  //Step 8	Enter name in General Settings tab	
	  fillGeneralSettingsData_Dashboard("DA_DP_TC088");
	  //Step 9	Click Next button
	  click(general_settings_page.next_button);
	  //Step 10	Click Next button	
	  click(display_field_page.next_button);
	  //Step 11	Select data in drop down menu Field in Sort Fields tab:	Version
	  //Step 12	Click Add Level button	
	  //Step 13	Select another data in drop down menu Field in Sort Fields tab:	Location
	  //Step 14	Click Add Level button	
	  addLevelSortedForFields_Dashboard("Version|Location");
	  //Step 15	Click 'Up' button in the 'Location' field	
	  //VP	Check 'Location' field is above 'Version' field	
	  //Step 17	Click 'Down' button in the 'Location' field	
	  //VP	Check 'Location' field is below 'Version' field	

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
