package dashboard.object_repository;
import org.openqa.selenium.By;

public class MainPage_Dashboard {
	public By logout_link=By.cssSelector("[href*='logout']");
	public By add_page_button=By.cssSelector("[href*=AddPage]");
	public By edit_page_button=By.cssSelector("[href*=EditPage]");
	public By test_page_icon=By.linkText("test");
	public By test_child_page_icon=By.linkText("test child");
	public By another_test_page_icon=By.linkText("Another Test");
	public By delete_page_button=By.cssSelector("a.delete");
	public By lock_frame=By.id("div_Lock");
	public By overview_page_icon=By.linkText("Overview");
	public By setting_link= By.className("mn-setting");
	public By administer_link=By.cssSelector("a[href='#Administer']");
}
