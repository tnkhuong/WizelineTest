package testModule;

import org.testng.annotations.Test;

import actionHLA.AutoHLActions;
import config.GlobalVariables;
import config.Init;
import dashboard.object_repository.MainPage_Dashboard;

public class DA_LOGIN_TC014 extends AutoHLActions{
	static MainPage_Dashboard mainpage = new MainPage_Dashboard();
	@Test
    public void main () throws Exception{
	  Navigate(GlobalVariables.glb_Browser,"http://localhost:54000/TADashboard/login.jsp");
	  LogIn("SampleRepository", "administrator", "");
	  Click(mainpage.setting_link);
	  Click(mainpage.addPage_link);
	  //Check all other controls within Dashboard are locked and disabled
	 
  }
}