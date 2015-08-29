package dashboard.action.hla;

import org.openqa.selenium.By;

public class SelectPanelsItem_Dashboard extends AutoHLActions_Dashboard{
	/**
	 * Description: this action is used to select an expected item under a Panels' type  
	 * (Eg: select item "Action Implementation By Status" under "Charts" panels type
	 * @param panel_type : types of panels (Eg:Charts,Indicators, Reports,or Heat Maps)
	 * @param panel_item : selected item under its corresponding Panels type (Eg: Action Implementation By Status)
	 * @return None
	 * @author Thuong Le
	 */
	public SelectPanelsItem_Dashboard(String panel_type, String panel_item)
	{
		String type=handleSpaceInString(panel_type);
		String item=handleSpaceInString(panel_item);
		By control=By.xpath("//div[text()='"+ type+ "']/parent::div//table//a[contains(@title,'" + item+ "')]");
		click(control);
	}

}
