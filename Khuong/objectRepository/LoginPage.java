package objectRepository;
import org.openqa.selenium.By;

public class LoginPage {
	public By reporsitory_combobox=By.id("repository");
	public By username_textbox=By.xpath("//input[@id='username']");
	public By password_textbox= By.id("password");
	public By login_button= By.cssSelector(".btn-login");
}
