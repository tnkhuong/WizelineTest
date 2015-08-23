package dashboard.action.hla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import config.GlobalVariables;
import dashboard.object_repository.MainPage_Dashboard;

public class DeletePage_Dashboard extends action_built_in.AutoAction{
	MainPage_Dashboard main_page=new MainPage_Dashboard();
	public DeletePage_Dashboard(WebDriver driver, String page_name) throws InterruptedException
	{
		waitForPageLoad(GlobalVariables.DEFAULT_WAIT_4_PAGE);
		By control=By.linkText(page_name);
		click(control);
		new SelectSubMenuItem(driver, main_page.setting_link, main_page.delete_page_button);
		confirmPopup("yes");
		waitUntilControlNotExist(control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
	}
}
