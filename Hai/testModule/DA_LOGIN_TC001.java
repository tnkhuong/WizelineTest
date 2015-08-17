package testModule;

import objectRepository.MainPage;
import org.testng.annotations.Test;
import actionHLA.AutoHLActions;
import config.GlobalVariables;
import config.Init;

public class DA_LOGIN_TC001 extends AutoHLActions{
	static MainPage mainpage = new MainPage();
	@Test
    public void main () throws Exception{
	  Navigate(GlobalVariables.glb_Browser,"http://localhost:54000/TADashboard/login.jsp");
	  LogIn("SampleRepository", "administrator", "");
	  CheckControlExist(mainpage.logout_link);
  }
}