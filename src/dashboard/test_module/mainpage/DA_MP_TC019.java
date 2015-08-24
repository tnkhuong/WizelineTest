package dashboard.test_module.mainpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import config.GlobalVariables;
import dashboard.object_repository.EditPage_Dashboard;
import dashboard.object_repository.MainPage_Dashboard;
import dashboard.object_repository.NewPage_Dashboard;

public class DA_MP_TC019 extends dashboard.action.hla.AutoHLActions_Dashboard {
	static MainPage_Dashboard mainpage = new MainPage_Dashboard();
	static NewPage_Dashboard newPage = new NewPage_Dashboard();
	static EditPage_Dashboard editPage = new EditPage_Dashboard();
	static By testPage = By.linkText("Test");
	static By anotherPage = By.linkText("Another Test");
	
	@Test
    public void main () throws Exception{
	  navigate(GlobalVariables.glb_Browser,GlobalVariables.glb_Url);
	  logInDashboard(GlobalVariables.glb_Repository, GlobalVariables.glb_Username, GlobalVariables.glb_Password);
	  addDashboardPage("test","","");
	  addDashboardPage("Another test","test","");
	  // Edit Test page
	  click(testPage);
	  waitForPageLoad(20000);
	  click(mainpage.setting_link);
	  click(mainpage.edit_page_button);
	  waitForElement(editPage.editPage_title, 10000);
	  System.out.println(driver.findElement(editPage.editPage_title).getText());
	  //driver.findElement(editPage.editPage_title).	  
	  //CheckControlExist(editPage.editPage_title);
	  /* Edit Another page
	  Click(anotherPage);
	  WaitForPage(20000);
	  Click(mainpage.setting_link);
	  Click(mainpage.editPage_link);
	  WaitForPage(20000);
	  CheckControlExist(editPage.editPage_title);
	  Set (newPage.public_checkbox,false);
	  Click(newPage.ok_button);
	  WaitForPage(20000);
	  //LogOut and LogIn again with another user
	  LogOut();
	  LogIn("SampleRepository", "john", "");
	  //Check Test is visible and Another Test is not
	  CheckControlExist(testPage);
	  CheckControlNotExist(anotherPage);*/
	}
}
