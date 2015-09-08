package dashboard.action.hla;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.GlobalVariables;
import dashboard.object_repository.MainPage_Dashboard;

public class DeletePage_Dashboard extends AutoHLActions_Dashboard{
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
			if(doesControlExist(control)==true)
			{
				click(control);
				selectSubMenuItem(main_page.setting_link, main_page.delete_page_button);
				confirmPopup("yes");
				waitUntilControlNotExist(control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
				waitForPageLoad(GlobalVariables.DEFAULT_WAIT_4_CONTROL);
			}
		}
	}
	public DeletePage_Dashboard(WebDriver driver, String page_name, String parent_page) throws InterruptedException
	{
		//Set variable
		By pageNameLink = By.linkText(page_name);
		By parentPageNameLink = By.linkText(parent_page);
		waitForPageLoad(GlobalVariables.DEFAULT_WAIT_4_PAGE);
		if(doesControlExist(parentPageNameLink)==true){
			moveMouse(parentPageNameLink);
			if (doesControlExist(pageNameLink)==true)
			{
				click(pageNameLink);
				//selectSubMenuItem(parentPageNameLink,pageNameLink);
				waitForPageLoad(20000);
				selectSubMenuItem(main_page.setting_link, main_page.delete_page_button);
				confirmPopup("yes");
				waitUntilControlNotExist(pageNameLink, GlobalVariables.DEFAULT_WAIT_4_CONTROL*2);
				waitForPageLoad(GlobalVariables.DEFAULT_WAIT_4_CONTROL*2);
			}
		}
	}
}
