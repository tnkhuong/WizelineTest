package testModule;

import objectRepository.MainPage;
import org.testng.annotations.Test;
import actionHLA.AutoHLActions;
import config.GlobalVariables;
import config.Init;

public class DA_LOGIN_TC014 extends AutoHLActions{
	static MainPage mainpage = new MainPage();
	@Test
    public void main () throws Exception{
	  Navigate(GlobalVariables.glb_Browser,"http://localhost:54000/TADashboard/login.jsp");
	  LogIn("SampleRepository", "administrator", "");
	  Click(mainpage.setting_link);
	  Click(mainpage.addPage_link);
	  //Check all other controls within Dashboard are locked and disabled
	 
  }
}