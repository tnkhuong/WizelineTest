package dashboard.action.hla;

import config.GlobalVariables;
import dashboard.object_repository.*;

public class EditPage_Dashboard extends AutoHLActions_Dashboard{
	MainPage_Dashboard main_page=new MainPage_Dashboard();
	dashboard.object_repository.EditPage_Dashboard edit_page = new dashboard.object_repository.EditPage_Dashboard();
	
	public EditPage_Dashboard(String pageName,String parentPageName,String newPageName,String newParentPage,String numberOfColumns,String displayAfter,boolean publicOption) throws InterruptedException{
		//Launch Edit Page
		if(parentPageName=="")
			launchEditPage_Dashboard(pageName);
		else
			launchEditPage_Dashboard(pageName, parentPageName);
		// Step	Enter Page Name field
		if (newPageName!="")
		enter(edit_page.pageName_textbox,newPageName);
		// Step		Select value for parent page dropdown list
		if (newParentPage!="")
		selectDropdown(edit_page.parentPage_combobox,newParentPage, "text");
		// Step		Select value for parent page dropdown list
		if (newParentPage!="")
			selectDropdown(edit_page.parentPage_combobox,newParentPage, "text");
		//Step		Select Number of Columns
		if (numberOfColumns!=""||numberOfColumns!="2")
			selectDropdown(edit_page.columnNumber_combobox, numberOfColumns, "text");
		// Step     Select value for Displayed After dropdown list
		if (displayAfter!="")
		selectDropdown(edit_page.displayAfter_combobox, displayAfter, "text");
		// Step Check Public Option or Not
		set(edit_page.public_checkbox, publicOption);
		// Step	Click OK button
		click(edit_page.ok_button);
		waitUntilControlNotExist(edit_page.ok_button, GlobalVariables.DEFAULT_WAIT_4_CONTROL*2);
		waitForPageLoad(GlobalVariables.DEFAULT_WAIT_4_CONTROL*2);
	}

}
