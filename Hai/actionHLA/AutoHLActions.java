package actionHLA;

import actionBuiltIn.AutoAction;

public class AutoHLActions extends AutoAction{
	
	public static void LogIn(String repo, String username, String password) throws Exception{
		LogIn logIn = new LogIn(repo,username,password);		
	}
	public static void LogOut() throws Exception{
		LogOut logOut = new LogOut();		
	}
	public static void AddPage(String pageName) throws Exception{
		AddPage addPage = new AddPage(pageName);
	}
	public static void AddPage(String pageName,String parentPage, String columnNumber, String displayAfter,boolean publicOption)  throws Exception{
		AddPage addPage = new AddPage(pageName,parentPage,columnNumber,displayAfter,publicOption) ;
	}
}
