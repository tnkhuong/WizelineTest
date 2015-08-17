package thuong.actionBuiltin;
import org.openqa.selenium.By;
import config.GlobalVariables;
import config.Init;

public class AutoAction extends Init{

	public static void navigate(String browser,String url) throws Exception
	{
		new StartBrowser(Init.setup(browser), url);
	}

	public static void clickObject(By control){
		WaitForElement(control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		new Click(driver, control);
	}

	public static void enterValue(By control, String value){
		WaitForElement(control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		new Enter(driver,control,value);
	}

	public static void CheckControlExist(By control,long timeout)
	{
		new WaitForControl(driver, control, timeout);
		new CheckControlExist(driver,control);
	}
	
	public static void ExitPage()
	{
		new ExitBrowser(driver);
	}
	
	public static void CheckPopUpMessage(String expectedMesg)
	{
		new CheckPopPupMessage(driver, expectedMesg);
	}
	
	public static void SelectDropdown(By control, Integer value)
	{
		WaitForElement(control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		new SelectDropdown(driver,control,value);
	}
	
	public static void SelectDropdown(By control, String value, String option){	
		WaitForElement(control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		new SelectDropdown(driver,control,value,option);
	}
	
	public static void WaitForElement(By control, long timeout)
	{
		new WaitForControl(driver, control, timeout);
	}
	
	public static void WaitForPageLoad(int timeout)
	{
		new WaitForPageLoad(driver, timeout);
	}
	
	public static void waitUntilControlNotExist(By control, int timeout) throws InterruptedException
	{
		new WaitUntilControlNotExist(driver,control,timeout);
	}
	
	public static void CheckControlPosition(By control, By base_control,String position)
	{
		WaitForElement(control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		new CheckControlPosition(driver, control, base_control, position);
	}
	
	public static void ConfirmPopup(String option)
	{
		new ConfirmPopup(driver,option);
	}
	
	public static void CheckControlNotExist(By control) throws InterruptedException
	{
		waitUntilControlNotExist(control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		new CheckControlNotExist(driver, control);
	}
	
	public static String HandleSpaceInString(String string_name)
	{
		String convert_string=string_name.replace(" ","\u00a0");
		return convert_string;
	}
	
	public static void SelectSubMenuItem(By hover_control, By selected_control)
	{
		new SelectSubMenuItem(driver, hover_control, selected_control);
	}
	public static void getcontrolcoordinate(By control,int returnx, int returny)
	{
		new test(driver, control);
		returnx=test.x1;
		returny=test.y1;
		
	}
}



