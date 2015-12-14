package dashboard.test_module.mainpage;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import config.GlobalVariables;
import dashboard.object_repository.EditPage_Dashboard;
import dashboard.object_repository.MainPage_Dashboard;
import dashboard.object_repository.NewPage_Dashboard;
     
public class DA_MP_TC019 extends dashboard.action.hla.AutoHLActions_Dashboard {
	static MainPage_Dashboard main_page = new MainPage_Dashboard();
	static NewPage_Dashboard new_page = new NewPage_Dashboard();
	static dashboard.object_repository.EditPage_Dashboard edit_page = new EditPage_Dashboard();
	static By test_page = By.linkText("Test");
	static By another_page = By.linkText("Another Test");
	static By edit_title = By.cssSelector("#div_popup h2");
	
	@Test
    public void main () throws Exception{
	  //Add 2 pages: Test & Another Test
	  addDashboardPage("Test","","");
	  addDashboardPage("Another Test", "Test", "", "", true);
	  //Check Edit page appears when clicking Edit Page link
	  launchEditPage_Dashboard("Test");
	  checkControlProperty(edit_page.editPage_title,"value", "Edit Page");
	  //Edit Test page. Check public checkbox
	  editPage_Dashboard("Test", "", "", "","","", true);
	  //Check Edit page appears when clicking Edit Page link
	  launchEditPage_Dashboard("Another Test","Test");
	  checkControlProperty(edit_page.editPage_title,"value", "Edit Page");
	  //Edit Test page. Uncheck public checkbox
	  editPage_Dashboard("Another Test", "Test", "", "","","",false);
	  logOut_Dashboard();
	  //Log in with another user and check the edit result
	  logInDashboard(GlobalVariables.glb_Repository, "john", "");
	  checkControlExist(test_page, 20000);
	  checkControlNotExist(another_page);
	  logOut_Dashboard();
	}
	 @BeforeClass
	  @Parameters("browser")
	  public void beforeClass(String browser) throws Exception {
		  //Navigate and log in Dashboard with the first account
		  navigate(browser,GlobalVariables.glb_Url);
		  logInDashboard(GlobalVariables.glb_Repository, GlobalVariables.glb_Username, GlobalVariables.glb_Password);
		  //Delete pages if they exist
		  deletePage("Another Test","Test");
		  deletePage("Test");
	  }

	  @AfterClass
	  public void afterClass() throws InterruptedException {
		  //Log in with the first account and delete pages
		  logInDashboard(GlobalVariables.glb_Repository, GlobalVariables.glb_Username, GlobalVariables.glb_Password);
		  deletePage("Another Test","Test");
		  deletePage("Test");
		  //Log Out and exist Dashboard
		  logOut_Dashboard();
		  exitPage();
	  }
}