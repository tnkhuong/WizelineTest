package dashboard.action.hla;

import actionBuiltIn.AutoAction;

public class AutoHLActions extends action_built_in.AutoAction{
	
	public static void LogInDashboard(String repo, String username, String password)
	{
		new LogInDashboard(repo, username, password);
	}
	public static void AddDashboardPage(String pageName,String parent_page,String display_after) throws InterruptedException
	{
		new AddDashboardPage(pageName,parent_page,display_after);
	}
	public static void DeletePage(String page_name) throws InterruptedException
	{
		new DeletePage(driver,page_name);
	}
}
