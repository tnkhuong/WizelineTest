package test_module.login;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import config.GlobalVariables;
import actionBuiltIn.AutoAction;
import actionHLA.AutoHLActions;
public class DA_LOGIN_TC002 extends AutoHLActions {
  @Test
  public void f() throws Exception {
	  LogIn("http://localhost:54000/TADashboard/login.jsp", "SampleRepository", "test", "123");
	  CheckPopUpMessage("Username or password is invalid","yes");
	  
  }
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  //Navigate(GlobalVariables.glb_Browser,GlobalVariables.glb_Url);
  }

  @AfterMethod
  public void afterMethod() {
	  ExitDashboard();
  }
}
