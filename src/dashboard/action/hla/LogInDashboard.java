package dashboard.action.hla;

import actionBuiltIn.AutoAction;
import object_repository.LoginPage;

public class LogInDashboard extends AutoAction{

	static LoginPage loginpage = new LoginPage();
	
	public LogInDashboard(String repo, String username, String password) {
		SelectDropdown(loginpage.repository_combobox, repo, "text");
		enterValue(loginpage.username_textbox, username);
		enterValue(loginpage.password_textbox,password);
		clickObject(loginpage.login_button);
	}
}
