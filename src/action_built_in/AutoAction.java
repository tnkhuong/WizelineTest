package action_built_in;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import config.GlobalVariables;
import config.Init;

public class AutoAction extends Init{

	/**
	 * Description: this action is used to navigate a web site
	 * @param browser is the browser to work on (Eg: firefox, chrome, ie)
	 * @param url is address
	 * @return None
	 * @author Khuong Truong
	 */
	public static void navigate(String browser,String url) throws Exception
	{
		new Navigate(Init.setup(browser), url);
		waitForPageLoad(GlobalVariables.DEFAULT_WAIT_4_PAGE);
	}

	/**
	 * Description: this action is used to click a webElement
	 * @param control is object
	 * @return None
	 * @author Thuong Le
	 */
	public static void click(By control){
		waitForElement(control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		new Click(driver, control);
	}

	/**
	 * Description: this action is used to enter value into textbox
	 * @param control is object
	 * @param Svalue is text will enter textbox
	 * @return None
	 * @author Thuong Le
	 */
	public static void enter(By control, String value){
		waitForElement(control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		new Enter(driver,control,value);
	}

	/**
	 * Description: this action is used to check control exist on a page
	 * @parm control is object
	 * @param timeout is waiting time for waiting until the control exist on Page
	 * @return None
	 * @author Thuong Le
	 */
	public static void checkControlExist(By control,long timeout)
	{
		new WaitForControl(driver, control, timeout);
		new CheckControlExist(driver,control);
	}
	
	/**
	 * Description: this action is used to exit a webpage
	 * @return None
	 * @author Thuong Le
	 */
	public static void exitPage()
	{
		new ExitBrowser(driver);
	}
	
	/**
	 * Description: this action is used to switch to popup window and check its mesg
	 * @parm expectedMesg is the expected message displaying on the popup
	 * @return None
	 * @author Thuong Le
	 */
	public static void checkPopUpMessage(String expectedMesg)
	{
		new CheckPopUpMessage(driver, expectedMesg);
	}
	
	/**
	 * Description: this action is used to select a value in combobox
	 * @param control is object
	 * @param Svalue is text will be selected
	 * @param option is select value by the following expected option: text,or value
	 * @return None
	 * @author Thuong Le (kt)
	 */
	public static void selectDropdown(By control, Integer value)
	{
		waitForElement(control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		new SelectDropdown(driver,control,value);
	}
	
	public static void selectDropdown(By control, String value, String option){	
		waitForElement(control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		new SelectDropdown(driver,control,value,option);
	}
	
	/**
	 * Description: this action is used to wait for an element on web page
	 * @param control is object
	 * @param timeout is waiting time for control to appear
	 * @return None
	 * @author Thuong Le
	 */
	public static void waitForElement(By control, long timeout)
	{
		new WaitForControl(driver, control, timeout);
	}
	
	public static void waitForPageLoad(int timeout)
	{
		new WaitForPageLoad(driver, timeout);
	}
	
	/**
	 * Description: this action is used to wait until control not exist on a page
	 * @param control is object
	 * @param timeout is waiting time for waiting the control no longer exist on the page
	 * @return None
	 * @author Thuong Le
	 */
	public static void waitUntilControlNotExist(By control, int timeout) throws InterruptedException
	{
		new WaitUntilControlNotExist(driver,control,timeout);
	}
	
	/**
	 * Description: this action is used to check the control's position based on base control
	 * @param control is control want to check position
	 * @param base_control is a base position to check control position
	 * @param position: next right, next left
	 * @return None
	 * @author Thuong Le
	 */
	public static void checkControlPosition(By control, By base_control,String position)
	{
		waitForElement(control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		new CheckControlPosition(driver, control, base_control, position);
	}
	
	/**
	 * Description: this action is used to switch to popup window and work with it
	 * @param option is selected option (yes or no)
	 * @return None
	 * @author Thuong Le
	 * @throws InterruptedException 
	 */
	public static void confirmPopup(String option) throws InterruptedException
	{
		new ConfirmPopup(driver,option);
	}
	
	/**
	 * Description: this action is used to check whether element is not existed
	 * @param control is object
	 * @param timeout is a time period waiting until the control is disappeared
	 * @return None
	 * @author Thuong Le
	 */
	public static void checkControlNotExist(By control) throws InterruptedException
	{
		waitUntilControlNotExist(control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		new CheckControlNotExist(driver, control);
	}
	
	public static String handleSpaceInString(String string_name)
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
	
	/**
	 * Description: this action is used to check whether element is enabled or disabled
	 * @param control is object
	 * @param status is true or false
	 * @return None
	 * @author Khuong Truong
	 * @throws InterruptedException 
	 */
	public static void checkControlStatus(By control,Boolean status)
	{
		new CheckControlStatus(driver, control, status);
	}
	
	/**
	 * Description: this action is used to move the mouse over the expected control
	 * @param control is object want to hover the mouse on
	 * @return None
	 * @author Khuong Truong
	 */
	public static void moveMouse(By control){
		waitForElement(control, 10);
		new MoveMouse(driver,control);
	}
	
	/**
	 * Description: this action is used to check selected item of a combobox/listbox
	 * @param control is combobox/listbox object
	 * @param expected_value is the expected value of the selected item
	 * @return None
	 * @author Thuong Le
	 */
	public static void checkSelectedValue( By control,String expected_value)
	{
		new CheckSelectedValue(driver, control, expected_value);
	}
	
	/**
	 * Description: this action is used to check control's property
	 * @param control is object
	 * @param property is property's name: enabled, value,isSelected
	 * @param expected is expected value of the property
	 * @return None
	 * @author Thuong Le
	 */
	public static void checkControlProperty(By control,String property, String expected)
	{
		new CheckControlProperty(driver, control, property, expected);
	}
	
	/**
	 * Description: this action is used to get number of items in a combobox/listbox
	 * @param list_control is combobox/listbox object
	 * @param list_item is list of expected items want to check
	 * @return None
	 * @author Khuong Truong
	 */
	public static int getNumberItemsFromDropDown(By control)
	{
		waitForElement(control, 10);
		GetNumberListItemsFromDropDown getnumber = new GetNumberListItemsFromDropDown(driver, control);
		return getnumber.number;
	}
	
	/**
	 * Description: this action is used to get all items exist in a combobox/listbox
	 * @param list_control is combobox/listbox object
	 * @param list_item is list of expected items want to check
	 * @return None
	 * @author Khuong Truong
	 */
	public static ArrayList<String> getListItemsFromDropDown(By control)
	{
		waitForElement(control, 10);
		GetNumberListItemsFromDropDown getlist = new GetNumberListItemsFromDropDown(driver, control);
		return getlist.list;
	}
	
	/**
	 * Description: this action is used to check expected items exist in a combobox/listbox
	 * @param list_control is combobox/listbox object
	 * @param list_item is list of expected items want to check
	 * @return None
	 * @author Thuong Le
	 */
	public static void checkListItemsExist(By list_control, String[] list_item)
	{
		new CheckListItemsExist(driver, list_control, list_item );
	}
	/**
	 * Description: this action is used to check if control exist (visible) or not.
	 * @param control is WebDriver element
	 * @return boolean
	 * @author Hai Vu
	 */
	public static boolean doesControlExist (By control){
		try {
			driver.findElement(control);
			return true;
		}
		catch (NoSuchElementException e) {
			return false;
		}
	}
	/**
	 * Description: this action is used to set value for a checkbox.
	 * @param control is WebDriver element
	 * @return None
	 * @author Hai Vu
	 */
	public static void set(By control, Boolean value){
		waitForElement(control, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		new Set(driver,control,value);
	}
}



