package dashboard.action.hla;

import org.openqa.selenium.By;

public class AutoHLActions_Dashboard extends action_built_in.AutoAction{
	
	public static void logInDashboard(String repo, String username, String password)
	{
		new LogIn_Dashboard(repo, username, password);
	}
	public static void addDashboardPage(String pageName,String parent_page,String display_after) throws InterruptedException
	{
		new AddPage_Dashboard(pageName,parent_page,display_after);
	}
	public static void deletePage(String page_name) throws InterruptedException
	{
		new DeletePage_Dashboard(driver,page_name);
	}
	public static void selectSubMenuItem(By hover_control, By selected_control)
	{
		new SelectSubMenuItem(driver, hover_control, selected_control);
	}
	public static void AddDashboardPanel (String display_name)
	{
		new AddPanel_Dashboard(display_name);
	}
	public static void CheckPanelInfo(String[] list_panel_info)
	{
		new CheckPanelInfo(list_panel_info);
	}
}
