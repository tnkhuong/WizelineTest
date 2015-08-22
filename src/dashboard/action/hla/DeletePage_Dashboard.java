package dashboard.action.hla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.GlobalVariables;
import dashboard.object_repository.MainPage_Dashboard;
import actionBuiltIn.AutoAction;

public class DeletePage_Dashboard extends AutoAction{
	MainPage_Dashboard main_page=new MainPage_Dashboard();
	public DeletePage_Dashboard(WebDriver driver, String page_name) throws InterruptedException
	{
		//String convert_name=HandleSpaceInString(page_name);
		//String new_control="//a[text()='"+ convert_name + "']";
		By control=By.linkText(page_name);
		WaitForElement(control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		clickObject(control);
		SelectSubMenuItem(main_page.setting_link, main_page.delete_page_button);
		//clickObject(main_page.delete_page_button);
		ConfirmPopup("yes");
		//waitUntilControlNotExist(control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
	}
}
