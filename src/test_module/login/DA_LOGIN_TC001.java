package test_module.login;

import object_repository.LoginPage;
import object_repository.MainPage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import config.GlobalVariables;
import actionBuiltIn.AutoAction;
import actionHLA.AutoHLActions;

public class DA_LOGIN_TC001 extends AutoHLActions{
	
	static MainPage mainpage = new MainPage();
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  //Navigate(GlobalVariables.glb_Browser,GlobalVariables.glb_Url);
  }
  
  @AfterMethod
  public void afterMethod() {
	  ExitDashboard();
  }  
  
  @Test
  public void d() throws Exception{
	  LogIn("http://localhost:54000/TADashboard/login.jsp", "SampleRepository", "administrator", "");	  
	  //CheckDashboardControlExist(page.logout_link);
	  CheckControlExist(mainpage.repository_link);
  }  
}