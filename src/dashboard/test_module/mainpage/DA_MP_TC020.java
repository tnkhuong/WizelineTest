package dashboard.test_module.mainpage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import config.GlobalVariables;
import dashboard.action.hla.AutoHLActions_Dashboard;
import dashboard.object_repository.MainPage_Dashboard;

public class DA_MP_TC020 extends AutoHLActions_Dashboard{
	MainPage_Dashboard main_page=new MainPage_Dashboard();
  @Test
  public void DA_MP_TC020_TC() throws InterruptedException {
	  //Set Variables
	  //String parent_page_control="//a[text()='test']";
	 // String child_page_control="//a[text()='test']/following-sibling::ul/li/a";
	  //Step 1	Navigate to Dashboard login page
	  //Step 2	Log in specific repository with valid account
	  LogInDashboard(GlobalVariables.glb_Repository, GlobalVariables.glb_Username, GlobalVariables.glb_Password);
	  waitForElement(main_page.setting_link, 100);
	  //Step 3	Add a new parent page
	  AddDashboardPage("test","","");
	  waitForElement(main_page.test_page_icon, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
	  //Step 4	Add a children page of newly added page
	  AddDashboardPage("test child","test","");
	  //Step 5	Click on parent page
	  click(main_page.test_page_icon);
	  //Step 6	Click "Delete this page" icon
	  SelectSubMenuItem(main_page.setting_link, main_page.delete_page_button);
	  //VP	Check confirm message "Are you sure you want to remove this page?" appears
	  checkPopUpMessage("Are you sure you want to remove this page?");
	  //Step 7	Click OK button
	  confirmPopup("yes");
	  //VP	Check warning message "Can not delete page 'Test' since it has children page(s)" appears
	  checkPopUpMessage("Cannot delete page 'test' since it has child page(s).");
	  //Step 8	Click OK button
	  confirmPopup("yes");
	  //Step 9	Click on  children page
	  SelectSubMenuItem(main_page.test_page_icon,main_page.test_child_page_icon);
	  //Step 10	Click "Delete this page" icon
	  SelectSubMenuItem(main_page.setting_link, main_page.delete_page_button);
	  //VP	Check confirm message "Are you sure you want to remove this page?" appears
	  checkPopUpMessage("Are you sure you want to remove this page?");
	  //Step 11	Click OK button
	  confirmPopup("yes");
	  //VP	Check children page is deleted
	  checkControlNotExist(main_page.test_child_page_icon);
	  //Step 12	Click on  parent page
	  click(main_page.test_page_icon);
	  //Step 13	Click "Delete this page" icon
	  SelectSubMenuItem(main_page.setting_link, main_page.delete_page_button);
	  //VP	Check confirm message "Are you sure you want to remove this page?" appears
	  checkPopUpMessage("Are you sure you want to remove this page?");
	  //Step 14	Click OK button
	  confirmPopup("yes");
	  //VP	Check parent page is deleted
	  checkControlNotExist(main_page.test_page_icon);
	  //Step 15	Click on "Overview" page
	  click(main_page.overview_page_icon);
	  //VP	Check "Delete this page" icon disappears
	  checkControlNotExist(main_page.delete_page_button);
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
