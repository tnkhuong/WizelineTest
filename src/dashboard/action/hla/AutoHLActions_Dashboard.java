package dashboard.action.hla;

import org.openqa.selenium.By;

public class AutoHLActions_Dashboard extends action_built_in.AutoAction{
	
	public static void logInDashboard(String repo, String username, String password)
	{
		new LogIn_Dashboard(repo, username, password);
	}
	public static void AddDashboardPage(String pageName,String parent_page,String display_after) throws InterruptedException
	{
		new AddPage_Dashboard(pageName,parent_page,display_after);
	}
	public static void DeletePage(String page_name) throws InterruptedException
	{
		new DeletePage_Dashboard(driver,page_name);
	}
	public static void SelectSubMenuItem(By hover_control, By selected_control)
	{
		new SelectSubMenuItem(driver, hover_control, selected_control);
	}
}
