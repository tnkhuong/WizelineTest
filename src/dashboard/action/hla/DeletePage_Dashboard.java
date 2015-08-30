package dashboard.action.hla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import config.GlobalVariables;
import dashboard.object_repository.MainPage_Dashboard;

public class DeletePage_Dashboard extends AutoHLActions_Dashboard{
	MainPage_Dashboard main_page=new MainPage_Dashboard();
	public DeletePage_Dashboard(WebDriver driver, String page_name) throws InterruptedException
	{
		//Set variable
		By control = By.linkText(page_name);
		waitForPageLoad(GlobalVariables.DEFAULT_WAIT_4_PAGE);
		if(doesControlExist(control)==true){
		click(control);
		waitForPageLoad(20000);
		selectSubMenuItem(main_page.setting_link, main_page.delete_page_button);
		confirmPopup("yes");
		waitUntilControlNotExist(control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
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
				waitUntilControlNotExist(pageNameLink, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
			}
		}
	}
}
