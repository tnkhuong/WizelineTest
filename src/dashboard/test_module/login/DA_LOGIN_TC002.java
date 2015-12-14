package dashboard.test_module.login;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import config.GlobalVariables;
import dashboard.action.hla.AutoHLActions_Dashboard;

public class DA_LOGIN_TC002 extends AutoHLActions_Dashboard {
  @Test
  public void f() throws Exception {
	  logInDashboard("SampleRepository", "test", "123");
	  checkPopUpMessage("Username or password is invalid");
	  confirmPopup("yes");
  }
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  navigate(GlobalVariables.glb_Browser,GlobalVariables.glb_Url);
  }

  @AfterMethod
  public void afterMethod() {
	  exitPage();
  }
}
