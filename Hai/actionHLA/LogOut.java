package actionHLA;

import objectRepository.LoginPage;
import objectRepository.MainPage;
import actionBuiltIn.AutoAction;

public class LogOut extends AutoAction{

	static LoginPage loginpage = new LoginPage();
	static MainPage mainPage = new MainPage();
	public LogOut () throws Exception {
		 Click(mainPage.administrator_link);
		 Click(mainPage.logout_link);
		 WaitForControl(loginpage.login_button, 20000);
	}
}
