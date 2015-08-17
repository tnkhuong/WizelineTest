package dashboard.action.hla;

import object_repository.MainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.GlobalVariables;
import actionBuiltIn.AutoAction;

public class DeletePage extends AutoAction{
	MainPage main_page=new MainPage();
	public DeletePage(WebDriver driver, String page_name) throws InterruptedException
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
