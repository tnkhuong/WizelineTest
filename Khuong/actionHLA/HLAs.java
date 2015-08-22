package actionHLA;

import org.openqa.selenium.WebDriver;

import dashboard.object_repository.LoginPage_Dashboard;
import actionBuiltIn.Click;
import actionBuiltIn.Enter;
//import actionBuiltIn.WaitForControl;

public class HLAs{
	LoginPage_Dashboard loginpage=new LoginPage_Dashboard();
	public void LogInDashboard(WebDriver driver,String repository,String username, String password)
	{
		//WaitForControl.execute(driver, loginpage.username_textbox, 40);
		//SelectDropdown.execute(driver, loginpage.reporsitory_combobox, repository, "text");
		//Enter.execute(driver,loginpage.username_textbox, username);
		//Enter.execute(driver,loginpage.password_textbox,password);
		//Click.execute(driver, loginpage.login_button);
	}

}
