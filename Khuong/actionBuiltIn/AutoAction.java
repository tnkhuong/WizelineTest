package actionBuiltIn;
import org.openqa.selenium.By;

import config.Init;
import actionHLA.*;

public class AutoAction extends Init{
	
	/*public static void openBrowser(String browser, String url)
	{
		Navigate.executeNavigate(browser, url);
	}*/
	//static WebDriver useDriver=Navigate.driver;
	/*
	public static void Navigate(String browser,String url) throws Exception
	{
		
		StartBrowser.execute(Init.setup(browser), url);
	}
	*/
	
	public static void Navigate(String browser,String url) throws Exception
	{
		
		new Navigate(Init.setup(browser), url);
	}
	
	/*
	public static void clickObject(By control){
		Click.execute(Init.driver, control);
	}
	
	public static void entervalue(By control, String value){
		Enter.execute(Init.driver, control, value);
	}
	*/
	
	public static void LoginDashboard(String repository,String username, String password)
	{
		HLAs a=new HLAs();
		a.LogInDashboard(driver, repository, username, password);
	}
	
	public static void CheckDashboardControlExist(By control)
	{
		WaitForControl.execute(driver, control, 10);
		//CheckControlExist.execute(driver, control);
	}
	
	public static void ExitDashboard()
	{
		ExitBrowser.execute(driver);
	}
	
	public static void CheckPopUpMessage(String expectedMesg, String closepopup)
	{
		CheckPopPupMessage.execute(driver, expectedMesg,closepopup);
	}
	
	public static void SelectDropdown(By control, Integer value){new SelectDropdown(driver,control,value);}	
	
	public static void SelectDropdown(By control, String value, String option){new SelectDropdown(driver,control,value,option);}
	
	public static void Enter(By control, String value){new Enter(driver,control,value);}
	
	public static void Click(By control){
		//WaitForControl.execute(driver, control, 10);
		new Click(driver,control);
	}
	
	public static void MoveMouse(By control){
		WaitForControl.execute(driver, control, 10);
		new MoveMouse(driver,control);
	}
	
	public static void CheckControlExist(By control){
		WaitForControl.execute(driver, control, 10);
		new CheckControlExist(driver,control);
	}	
	
	public static void CheckControlNotExist(By control){
		WaitForControl.execute(driver, control, 10);
		new CheckControlNotExist(driver,control);
	}
	
	public static void CheckControlStatus(By control,String status) throws InterruptedException{
		WaitForControl.execute(driver, control, 10);
		new CheckControlStatus(driver,control,status);
	}		
	
}



