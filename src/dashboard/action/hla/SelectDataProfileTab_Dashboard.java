package dashboard.action.hla;

import org.openqa.selenium.By;

public class SelectDataProfileTab_Dashboard extends action_built_in.AutoAction{
	/**
	 * Description: this action is used to select an expected tab name in Data Profile page
	 * @param tab_name : Tab name wants to be selected
	 * @return None
	 * @author Thuong Le
	 */
	public SelectDataProfileTab_Dashboard(String tab_name)
	{
		String xpath_string=".//ul[@id='wstep']/li[text()='" + tab_name + "']";
		click(By.xpath(xpath_string));
	}
}
