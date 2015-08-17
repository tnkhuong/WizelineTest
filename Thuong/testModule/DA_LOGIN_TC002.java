package testModule;
import org.testng.annotations.Test;

import config.GlobalVariables;
import actionHLA.AutoHLActions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DA_LOGIN_TC002 extends AutoHLActions {
  @Test
  public void DA_LOGIN_TC002_TC() {
	  LogInDashboard(GlobalVariables.glb_Repository, "abc", "123");
	  CheckPopUpMessage("Username or password is invalid");
	  
  }
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  
	  navigate(GlobalVariables.glb_Browser,GlobalVariables.glb_Url);
  }

  @AfterMethod
  public void afterMethod() {
	  ExitPage();
  }

}
