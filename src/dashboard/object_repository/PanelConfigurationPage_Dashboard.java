package dashboard.object_repository;

import org.openqa.selenium.By;

public class PanelConfigurationPage_Dashboard {
	public By select_page_combobox=By.id("cbbPages");
	public By cancel_button=By.id("Cancel");
	public By height_textbox=By.id("txtHeight");
	public By folder_textbox=By.id("txtFolder");
	public By ok_button=By.cssSelector("#OK[onclick*='Dashboard.addPanelToPage']");
}
