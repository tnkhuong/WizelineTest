package dashboard.action.hla;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.GlobalVariables;
import dashboard.object_repository.MainPage_Dashboard;

public class DeletePage_Dashboard extends action_built_in.AutoAction{
	MainPage_Dashboard main_page=new MainPage_Dashboard();
	/**
	 * Description: this action is used to delete a created Page in Dashboard (each page name separated by "|" character. E.g: name1|name2)
	 * @param page_name : the Page name want to delete
	 * @return None
	 * @author Thuong Le
	 */
	public DeletePage_Dashboard(WebDriver driver, String page_name) throws InterruptedException
	{
		String replace=page_name.replace("|", ",");
		String[] page_name_list=replace.split(",");
		for(int i=0; i<page_name_list.length; i++)
		{
			waitForPageLoad(GlobalVariables.DEFAULT_WAIT_4_PAGE);
			By control=By.linkText(page_name_list[i]);
			click(control);
			new SelectSubMenuItem(driver, main_page.setting_link, main_page.delete_page_button);
			confirmPopup("yes");
			waitUntilControlNotExist(control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		}
	}
}
