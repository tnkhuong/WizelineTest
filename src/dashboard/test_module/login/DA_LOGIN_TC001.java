package dashboard.test_module.login;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import config.GlobalVariables;
import dashboard.action.hla.AutoHLActions_Dashboard;
import dashboard.object_repository.MainPage_Dashboard;

public class DA_LOGIN_TC001 extends AutoHLActions_Dashboard{
	
	static MainPage_Dashboard mainpage = new MainPage_Dashboard();
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  navigate(GlobalVariables.glb_Browser,GlobalVariables.glb_Url);
  }
  
  @AfterMethod
  public void afterMethod() {
	  exitPage();
  }  
  
  @Test
  public void d() throws Exception{
	  logInDashboard("SampleRepository", "administrator", "");	  
	  checkControlExist(mainpage.administer_link,10);
  }  
}