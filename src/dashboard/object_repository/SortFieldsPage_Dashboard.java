package dashboard.object_repository;

import org.openqa.selenium.By;

public class SortFieldsPage_Dashboard {
	public By field_combobox=By.id("cbbFields");
	public By add_level_button=By.id("btnAddSortField");
	public By back_button=By.cssSelector("input[value='Back']");
	public By next_button=By.cssSelector("input[value='Next']");
	public By finish_button=By.cssSelector("input[value='Finish']");
	public By cancel_button=By.cssSelector("input[value='Cancel']");
	public By sort_fields_table=By.id("profilesettings");
}
