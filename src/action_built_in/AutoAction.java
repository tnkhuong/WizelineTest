package action_built_in;

import org.openqa.selenium.By;

import config.GlobalVariables;
import config.Init;

public class AutoAction extends Init{

	public static void navigate(String browser,String url) throws Exception
	{
		new Navigate(Init.setup(browser), url);
		waitForPageLoad(GlobalVariables.DEFAULT_WAIT_4_PAGE);
	}

	public static void click(By control){
		waitForElement(control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		new Click(driver, control);
	}

	public static void enter(By control, String value){
		waitForElement(control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		new Enter(driver,control,value);
	}

	public static void checkControlExist(By control,long timeout)
	{
		new WaitForControl(driver, control, timeout);
		new CheckControlExist(driver,control);
	}
	
	public static void exitPage()
	{
		new ExitBrowser(driver);
	}
	
	public static void checkPopUpMessage(String expectedMesg)
	{
		new CheckPopUpMessage(driver, expectedMesg);
	}
	
	public static void selectDropdown(By control, Integer value)
	{
		waitForElement(control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		new SelectDropdown(driver,control,value);
	}
	
	public static void selectDropdown(By control, String value, String option){	
		waitForElement(control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		new SelectDropdown(driver,control,value,option);
	}
	
	public static void waitForElement(By control, long timeout)
	{
		new WaitForControl(driver, control, timeout);
	}
	
	public static void waitForPageLoad(int timeout)
	{
		new WaitForPageLoad(driver, timeout);
	}
	
	public static void waitUntilControlNotExist(By control, int timeout) throws InterruptedException
	{
		new WaitUntilControlNotExist(driver,control,timeout);
	}
	
	public static void checkControlPosition(By control, By base_control,String position)
	{
		waitForElement(control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		new CheckControlPosition(driver, control, base_control, position);
	}
	
	public static void confirmPopup(String option) throws InterruptedException
	{
		new ConfirmPopup(driver,option);
	}
	
	public static void checkControlNotExist(By control) throws InterruptedException
	{
		waitUntilControlNotExist(control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		new CheckControlNotExist(driver, control);
	}
	
	public static String HandleSpaceInString(String string_name)
	{
		String convert_string=string_name.replace(" ","\u00a0");
		return convert_string;
	}
	
	public static void getcontrolcoordinate(By control,int returnx, int returny)
	{
		new test(driver, control);
		returnx=test.x1;
		returny=test.y1;		
	}
	public static void checkControlStatus(By control,Boolean status)
	{
		new CheckControlStatus(driver, control, status);
	}
	
	public static void moveMouse(By control){
		waitForElement(control, 10);
		new MoveMouse(driver,control);
	}
}



