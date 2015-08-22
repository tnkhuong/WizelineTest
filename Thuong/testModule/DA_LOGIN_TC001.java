package testModule;
import org.testng.annotations.Test;

import config.GlobalVariables;
import dashboard.object_repository.MainPage_Dashboard;
import actionHLA.AutoHLActions;

public class DA_LOGIN_TC001 extends AutoHLActions{
	MainPage_Dashboard page=new MainPage_Dashboard();
  @Test
  public void DA_LOGIN_TC001_TC() throws Exception{
	  navigate(GlobalVariables.glb_Browser,GlobalVariables.glb_Url);
	  LogInDashboard(GlobalVariables.glb_Repository, GlobalVariables.glb_Username, GlobalVariables.glb_Password);
	  CheckControlExist(page.logout_link,10);
	  ExitPage();
  }
}