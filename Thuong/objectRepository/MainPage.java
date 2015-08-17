package objectRepository;
import org.openqa.selenium.By;

public class MainPage {
	public By logout_link=By.cssSelector("[href*='logout']");
	public By add_page_button=By.cssSelector("[href*=AddPage]");
	public By test_page_icon=By.linkText("test");
	public By another_test_page_icon=By.linkText("Another Test");
	public By delete_page_button=By.cssSelector("a.delete");
	public By lock_frame=By.id("div_Lock");
	public By test_child_page_icon=By.xpath("//div[@id='tabsmenu']//li/a[contains(text(),'child')]");
	public By overview_page_icon=By.xpath("//div[@id='tabsmenu']//li/a[text()='Overview']");
	public By setting_link= By.className("mn-setting");
}
