package actionHLA;

import dashboard.object_repository.*;
import actionBuiltIn.AutoAction;
import action_built_in.*;
import objectRepository.LoginPage;
import objectRepository.MainPage;

public class LogIn extends AutoAction{

	static LoginPage loginpage = new LoginPage();
	static MainPage mainPage = new MainPage();
	public LogIn (String repo, String username, String password) throws Exception {
		SelectDropdown(loginpage.repository_combobox,repo,"text");	
		Enter(loginpage.username_textbox, username);
		Enter(loginpage.password_textbox,password);
		Click(loginpage.login_button);	
		WaitForControl(mainPage.addPage_link,20000);
	}
}
