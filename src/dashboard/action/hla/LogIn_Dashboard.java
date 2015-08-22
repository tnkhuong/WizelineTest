package dashboard.action.hla;

import dashboard.object_repository.LoginPage_Dashboard;
import actionBuiltIn.AutoAction;

public class LogIn_Dashboard extends AutoAction{

	static LoginPage_Dashboard loginpage = new LoginPage_Dashboard();
	
	public LogIn_Dashboard(String repo, String username, String password) {
		SelectDropdown(loginpage.repository_combobox, repo, "text");
		enterValue(loginpage.username_textbox, username);
		enterValue(loginpage.password_textbox,password);
		clickObject(loginpage.login_button);
	}
}
