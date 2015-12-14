package dashboard.test_module.mainpage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import config.GlobalVariables;
import dashboard.action.hla.AutoHLActions_Dashboard;
import dashboard.object_repository.MainPage_Dashboard;

public class DA_MP_TC016 extends AutoHLActions_Dashboard{
	MainPage_Dashboard main_page=new MainPage_Dashboard();
  @Test
  public void DA_MP_TC016_TC() throws InterruptedException {
	 // Step	Log in specific repository with valid account
	  logInDashboard(GlobalVariables.glb_Repository, GlobalVariables.glb_Username, GlobalVariables.glb_Password);
	 // Step	Click on Add Page icon on Main Page
	 // Step	Enter Page Name field (test)
	 // Step	Click OK button
	  addDashboardPage("test","","");
	 // Step	Click on Add  Page icon on Main Page
	 // Step	Enter Page Name field (Another Test)
	 // Step	Click on  Displayed After dropdown list
	 // Step	Select specific page
	 // Step	Click OK button
	  addDashboardPage("Another Test","","Overview");
	 // VP	Check "Another Test" page is positioned besides the "Test" page
	 checkControlPosition(main_page.another_test_page_icon, main_page.test_page_icon, "next right");
  }
  
  @BeforeClass
  @Parameters("browser")
  public void beforeClass(String browser) throws Exception {
	  navigate(browser,GlobalVariables.glb_Url);
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  deletePage("Another Test");
	  deletePage("test");
	  exitPage();
  }

}
