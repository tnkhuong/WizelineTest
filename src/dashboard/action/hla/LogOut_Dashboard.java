package dashboard.action.hla;

import dashboard.object_repository.LoginPage_Dashboard;
import dashboard.object_repository.MainPage_Dashboard;
import actionBuiltIn.AutoAction;

public class LogOut_Dashboard extends AutoAction{

	static LoginPage_Dashboard loginpage = new LoginPage_Dashboard();
	static MainPage_Dashboard mainPage = new MainPage_Dashboard();
	public LogOut_Dashboard () throws Exception {
		 Click(mainPage.administrator_link);
		 Click(mainPage.logout_link);
		 WaitForControl(loginpage.login_button, 20000);
	}
}
