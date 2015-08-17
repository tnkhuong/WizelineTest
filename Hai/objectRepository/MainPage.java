package objectRepository;
import org.openqa.selenium.By;

public class MainPage {
	public By logout_link= By.cssSelector("[href*='logout']");
	public By administrator_link= By.linkText("administrator");
	public By addPage_link= By.cssSelector("[href*=AddPage]");
	//public By editPage_link= By.cssSelector("[href*=openAddPage]");
	public By editPage_link= By.linkText("Edit");
	public By setting_link= By.className("mn-setting");
	//public By logout_link=By.xpath("//a[@href='logout.do']");.mn-setting
}
