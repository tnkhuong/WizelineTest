package dashboard.action.hla;


import dashboard.object_repository.LoginPage_Dashboard;
import dashboard.object_repository.MainPage_Dashboard;

public class LogOut_Dashboard extends AutoHLActions_Dashboard {

	static LoginPage_Dashboard loginpage = new LoginPage_Dashboard();
	static MainPage_Dashboard mainPage = new MainPage_Dashboard();
	public LogOut_Dashboard () throws InterruptedException {
		selectSubMenuItem(mainPage.welcome_link,mainPage.logout_link);
		waitForElement(loginpage.login_button, 20000);
	}
}
