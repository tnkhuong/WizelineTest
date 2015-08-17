package thuong.actionHLA;

import actionBuiltIn.AutoAction;
import objectRepository.LoginPage;

public class LogInDashboard extends AutoAction{

	static LoginPage loginpage = new LoginPage();
	
	public LogInDashboard(String repo, String username, String password) {
		SelectDropdown(loginpage.repository_combobox, repo, "text");
		enterValue(loginpage.username_textbox, username);
		enterValue(loginpage.password_textbox,password);
		clickObject(loginpage.login_button);
	}
}
