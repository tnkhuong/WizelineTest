package dashboard.object_repository;

import org.openqa.selenium.By;

public class EditPage_Dashboard {
	public By editPage_title=By.cssSelector("#div_popup h2");
	//public By editPage_title=By.cssSelector("#div_popup > div > table > tbody > tr:nth-child(1) > td.ptc > h2");
	public By pageName_textbox=By.className("page_txt_name");
	public By parentPage_combobox=By.id("parent");
	public By columnNumber_combobox=By.id("columnnumber");
	public By displayAfter_combobox=By.id("afterpage");
	public By public_checkbox=By.id("ispublic");
	public By ok_button=By.id("OK");
	public By cancel_button=By.id("Cancel");
}
