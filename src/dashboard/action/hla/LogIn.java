package dashboard.action.hla;

import objectRepository.LoginPage;
import objectRepository.MainPage;

public class LogIn extends action_built_in.AutoAction{

	static LoginPage loginpage = new LoginPage();
	static MainPage mainPage = new MainPage();
	public LogIn (String repo, String username, String password) throws Exception {
		selectDropdown(loginpage.repository_combobox,repo,"text");	
		enter(loginpage.username_textbox, username);
		enter(loginpage.password_textbox,password);
		click(loginpage.login_button);
	}
}
