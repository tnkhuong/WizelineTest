package dashboard.action.hla;

import org.openqa.selenium.By;

import config.GlobalVariables;
import dashboard.object_repository.EditPage_Dashboard;
import dashboard.object_repository.MainPage_Dashboard;
import dashboard.object_repository.NewPage_Dashboard;

public class LaunchEditPage_Dashboard extends AutoHLActions_Dashboard{
	MainPage_Dashboard main_page=new MainPage_Dashboard();
	NewPage_Dashboard new_page=new NewPage_Dashboard();
	EditPage_Dashboard edit_page = new EditPage_Dashboard();
	public LaunchEditPage_Dashboard(String pageName){
		//Set variable
		By pageNameLink = By.linkText(pageName);
		if(doesControlExist(edit_page.pageName_textbox)==false){
			//Step	Select a page you want to edit
			click(pageNameLink);
			// Step Wait for pageName is loaded completely
			waitForPageLoad(GlobalVariables.DEFAULT_WAIT_4_CONTROL*2);
			selectSubMenuItem(main_page.setting_link, main_page.edit_page_button);
			waitForElement(edit_page.editPage_title, GlobalVariables.DEFAULT_WAIT_4_CONTROL*2);
		}
	}
	public LaunchEditPage_Dashboard(String pageName, String parentPageName){
		//Set variable
		By pageNameLink = By.linkText(pageName);
		By parentPageNameLink = By.linkText(parentPageName);
		if(doesControlExist(edit_page.pageName_textbox)==false){
			//Step	Select a page you want to edit
			selectSubMenuItem(parentPageNameLink,pageNameLink);
			// Step Wait for pageName is loaded completely
			waitForPageLoad(GlobalVariables.DEFAULT_WAIT_4_CONTROL*2);
			selectSubMenuItem(main_page.setting_link, main_page.edit_page_button);
			waitForElement(edit_page.editPage_title, GlobalVariables.DEFAULT_WAIT_4_CONTROL*2);
		}
	}
}