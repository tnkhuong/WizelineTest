package actionHLA;

import org.openqa.selenium.By;

import dashboard.object_repository.MainPage_Dashboard;
import dashboard.object_repository.NewPage_Dashboard;
import actionBuiltIn.AutoAction;

public class AddPage extends AutoAction{
	static MainPage_Dashboard mainpage = new MainPage_Dashboard();
	static NewPage_Dashboard newPage = new NewPage_Dashboard();
	
	public AddPage (String pageName) throws Exception{
		By newlyAddedPage = By.partialLinkText(pageName);
		Click(mainpage.setting_link);
		Click(mainpage.addPage_link);
		WaitForControl(newPage.public_checkbox,20000);
		Enter(newPage.pageName_textbox, pageName);
		Click(newPage.ok_button);
		WaitForControl(newlyAddedPage, 20000);
	}
	public AddPage (String pageName,String parentPage, String columnNumber, String displayAfter,boolean publicOption) throws Exception{
		By newlyAddedPage = By.partialLinkText(pageName);
		Click(mainpage.setting_link);
		Click(mainpage.addPage_link);
		WaitForControl(newPage.public_checkbox,20000);
		Enter(newPage.pageName_textbox, pageName);
		 if(parentPage!=""){
			  SelectDropdown(newPage.parentPage_combobox, parentPage,"text");
		}
		 if (displayAfter!=""){
		  SelectDropdown(newPage.displayAfter_combobox, displayAfter, "text");
		 }
		 if (columnNumber!="2"||columnNumber!=""){
		  SelectDropdown(newPage.columnNumber_combobox, columnNumber,"text");
		 }
		Set (newPage.public_checkbox,publicOption);
		Click(newPage.ok_button);
		WaitForControl(newlyAddedPage, 20000);
		
	}
}
