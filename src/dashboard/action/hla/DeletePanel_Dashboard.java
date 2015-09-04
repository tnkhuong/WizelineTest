package dashboard.action.hla;

import org.openqa.selenium.By;

import config.GlobalVariables;

public class DeletePanel_Dashboard extends AutoHLActions_Dashboard{
	/**
	 * Description: this action is used to delete a created panel in Panels table (each panel name separated by "|" character. E.g: name1|name2)
	 * @param panel_name : name of panel want to delete
	 * @return None
	 * @author Thuong Le
	 */
	public DeletePanel_Dashboard(String panel_name) throws InterruptedException
	{
		String replace=panel_name.replace("|", ",");
		String[] panel_name_list=replace.split(",");
		for(int i=0; i<panel_name_list.length; i++)
		{
			By control=By.linkText(panel_name_list[i]);
			if(doesControlExist(control)==true)
			{
			selectActionBasedPanelName_Dashboard(panel_name_list[i], "Delete");
			confirmPopup("yes");
			waitUntilControlNotExist(By.linkText(panel_name), GlobalVariables.DEFAULT_WAIT_4_CONTROL);
			waitForPageLoad(GlobalVariables.DEFAULT_WAIT_4_CONTROL*2);
			}
		}
	}

}
