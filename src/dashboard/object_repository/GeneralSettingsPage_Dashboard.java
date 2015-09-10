package dashboard.object_repository;

import org.openqa.selenium.By;

public class GeneralSettingsPage_Dashboard {
	public By name_textbox=By.id("txtProfileName");
	public By item_type_combobox=By.id("cbbEntityType");
	public By related_data_combobox=By.id("cbbSubReport");
	public By next_button=By.cssSelector("input[value='Next']");
	public By finish_button=By.cssSelector("input[value='Finish']");
	public By cancel_button=By.cssSelector("input[value='Cancel']");
}
