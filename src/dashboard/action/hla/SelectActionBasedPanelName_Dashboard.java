package dashboard.action.hla;

import org.openqa.selenium.By;

public class SelectActionBasedPanelName_Dashboard extends action_built_in.AutoAction {
	public SelectActionBasedPanelName_Dashboard(String panel_name,String link_name) throws InterruptedException
	{
		String xpath_text_edit="//a[text()='" + panel_name +"']/ancestor::td/following-sibling::td/a[contains(@href,'Dashboard.configPanel')]";
		String xpath_text_delete="//a[text()='" + panel_name +"']/ancestor::td/following-sibling::td/a[contains(@href,'Dashboard.deletePanel')]";
		if(!link_name.isEmpty())
			if(link_name.equalsIgnoreCase("Edit"))
				click(By.xpath(xpath_text_edit));
			else if (link_name.equalsIgnoreCase("Delete"))
				{
					click(By.xpath(xpath_text_delete));
				}

			else
				System.out.print("input wrong value for link_name");
	}
}
