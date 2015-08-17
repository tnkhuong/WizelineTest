package actionHLA;

import actionBuiltIn.AutoAction;
import objectRepository.LoginPage;

public class LogIn extends AutoAction{

	static LoginPage loginpage = new LoginPage();
	
	public static void Execute(String url, String repo, String username, String password) throws Exception {
		Navigate("firefox", "http://localhost:54000/TADashboard/login.jsp");
		SelectDropdown(loginpage.reporsitory_combobox, repo, "text");
		Enter(loginpage.username_textbox, username);
		Enter(loginpage.password_textbox,password);
		Click(loginpage.login_button);		
	}
}
