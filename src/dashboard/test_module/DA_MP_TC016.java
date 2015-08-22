package dashboard.test_module;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import actionHLA.AutoHLActions;
import config.GlobalVariables;
import dashboard.object_repository.MainPage_Dashboard;

public class DA_MP_TC016 extends AutoHLActions{
	MainPage_Dashboard main_page=new MainPage_Dashboard();
  @Test
  public void DA_MP_TC016_TC() throws InterruptedException {
	 // Step	Log in specific repository with valid account
	  LogInDashboard(GlobalVariables.glb_Repository, GlobalVariables.glb_Username, GlobalVariables.glb_Password);
	 // Step	Click on Add Page icon on Main Page
	 // Step	Enter Page Name field (test)
	 // Step	Click OK button
	  AddDashboardPage("test","","");
	 // Step	Click on Add  Page icon on Main Page
	 // Step	Enter Page Name field (Another Test)
	 // Step	Click on  Displayed After dropdown list
	 // Step	Select specific page
	 // Step	Click OK button
	  AddDashboardPage("Another Test","","Overview");
	 // VP	Check "Another Test" page is positioned besides the "Test" page
	 CheckControlPosition(main_page.another_test_page_icon, main_page.test_page_icon, "next right");
  }
  
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
	  navigate(GlobalVariables.glb_Browser,GlobalVariables.glb_Url);
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  DeletePage("Another Test");
	  DeletePage("test");
	  ExitPage();
  }

}
