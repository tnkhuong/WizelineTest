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
	
	public static void addDashboardPanel (String display_name, String series_value)
	{
		new AddPanel_Dashboard(display_name,series_value);
	}
	
	public static void checkPanelInfo(String[] list_panel_info)
	{
		new CheckPanelInfo(list_panel_info);
	}
	public static void selectActionBasedPanelName_Dashboard(String panel_name,String link_name)
	{
		new SelectActionBasedPanelName_Dashboard(panel_name,link_name);
	}
	public static void checkEditPanelPageInfo_Dashboard(String[] list_edit_panel_info)
	{
		new CheckEditPanelPageInfo_Dashboard(list_edit_panel_info);
	}
	public static void deletePanel_Dashboard(String panel_name) throws InterruptedException
	{
		new DeletePanel_Dashboard(panel_name);
	}
}
