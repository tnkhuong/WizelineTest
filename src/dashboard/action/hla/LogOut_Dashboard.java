package dashboard.action.hla;


import dashboard.object_repository.LoginPage_Dashboard;
import dashboard.object_repository.MainPage_Dashboard;

public class LogOut_Dashboard extends action_built_in.AutoAction{

	static LoginPage_Dashboard loginpage = new LoginPage_Dashboard();
	static MainPage_Dashboard mainPage = new MainPage_Dashboard();
	public LogOut_Dashboard () throws Exception {
		 click(mainPage.administer_link);
		 click(mainPage.logout_link);
		 waitForElement(loginpage.login_button, 20000);
	}
}
