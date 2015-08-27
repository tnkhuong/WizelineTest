package dashboard.action.hla;

import org.openqa.selenium.By;

import config.GlobalVariables;

public class DeletePanel_Dashboard extends AutoHLActions_Dashboard{
	public DeletePanel_Dashboard(String panel_name) throws InterruptedException
	{
		selectActionBasedPanelName_Dashboard(panel_name, "Delete");
		confirmPopup("yes");
		waitUntilControlNotExist(By.linkText(panel_name), GlobalVariables.DEFAULT_WAIT_4_CONTROL);
	}

}
