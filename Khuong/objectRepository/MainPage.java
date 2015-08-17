package objectRepository;
import org.openqa.selenium.By;

public class MainPage {
	public By logout_link=By.xpath("//a[@href='logout.do']");
	public By repository_link=By.xpath("//a[@href='#Repository']");
	public By setting_button=By.cssSelector("li.mn-setting");
	public By addpage_button=By.cssSelector("a[href*='AddPage']");
}
