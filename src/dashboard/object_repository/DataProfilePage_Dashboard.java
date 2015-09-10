package dashboard.object_repository;

import org.openqa.selenium.By;

public class DataProfilePage_Dashboard {
	public By add_new_link=By.cssSelector("a[href='profile.jsp?action=create']");
	public By delete_link=By.cssSelector("a[href='javascript:Dashboard.deleteProfiles();']");
}
