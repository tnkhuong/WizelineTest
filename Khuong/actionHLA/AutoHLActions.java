package actionHLA;

import actionBuiltIn.AutoAction;

public class AutoHLActions extends AutoAction{
	
	public static void LogIn(String url, String repo, String username, String password) throws Exception{
		LogIn.Execute(url,repo,username,password);		
	}
}
