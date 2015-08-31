package dashboard.action.hla;

import dashboard.object_repository.LoginPage_Dashboard;
import dashboard.object_repository.MainPage_Dashboard;

public class LogIn_Dashboard extends action_built_in.AutoAction{

	static LoginPage_Dashboard loginpage = new LoginPage_Dashboard();
	static MainPage_Dashboard main_page = new MainPage_Dashboard();
	
	public LogIn_Dashboard(String repo, String username, String password) {
		selectDropdown(loginpage.repository_combobox, repo, "text");
		enter(loginpage.username_textbox, username);
		enter(loginpage.password_textbox,password);
		click(loginpage.login_button);
		waitForElement(main_page.welcome_link, 20000);
	}
}
