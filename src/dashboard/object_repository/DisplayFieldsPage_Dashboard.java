package dashboard.object_repository;

import org.openqa.selenium.By;

public class DisplayFieldsPage_Dashboard {
	public By back_button=By.cssSelector("input[value='Back']");
	public By next_button=By.cssSelector("input[value='Next']");
	public By finish_button=By.cssSelector("input[value='Finish']");
	public By cancel_button=By.cssSelector("input[value='Cancel']");
	public By check_all_link=By.cssSelector("a[href*='doCheckAll(true']");
	public By uncheck_all_link=By.cssSelector("a[href*='doCheckAll(false']");
}
