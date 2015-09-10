package dashboard.action.hla;
import java.util.ArrayList;

import org.openqa.selenium.By;

public class AutoHLActions_Dashboard extends action_built_in.AutoAction{
	/**
	 * Description: this action is used to Login to Dashboard page
	 * @param repo : the selected value of Repository combobox
	 * @param username : the input value of Username textbox
	 * @param password : the input value of Password textbox
	 * @return None
	 * @author Thuong Le
	 */
	public static void logInDashboard(String repo, String username, String password)
	{
		new LogIn_Dashboard(repo, username, password);
	}
	
	/**
	 * Description: this action is used to add a new Page in Dashboard
	 * @param pageName : the name of new added page
	 * @param parent_page : the input value of Parent Page textbox
	 * @param display_after : the selected value of Display After combobox
	 * @return None
	 * @author Thuong Le
	 */
	public static void addDashboardPage(String pageName,String parent_page,String display_after) throws InterruptedException
	{
		new AddPage_Dashboard(pageName,parent_page,display_after);
	}
	/**
	 * Description: this action is used to add a new Page in Dashboard
	 * @param pageName : the name of new added page
	 * @param parent_page : the input value of Parent Page textbox
	 * @param numberOfColumns : the input value of Number Of Columns combobox
	 * @param display_after : the selected value of Display After combobox
	 * @param parent_page : the input value of public checkbox
	 * @return None
	 * @author Hai Vu
	 */
	public static void addDashboardPage(String pageName,String parent_page,String numberOfColumns,String display_after,boolean publicOption) throws InterruptedException
	{
		new AddPage_Dashboard(pageName,parent_page,numberOfColumns,display_after,publicOption);
	} 
	
	/**
	 * Description: this action is used to delete a created Page in Dashboard
	 * @param page_name : the Page name want to delete (each page name separated by "|" character. E.g: name1|name2)
	 * @return None
	 * @author Thuong Le
	 */
	public static void deletePage(String page_name) throws InterruptedException
	{
		new DeletePage_Dashboard(driver,page_name);
	}
	/**
	 * Description: this action is used to delete a created Page in Dashboard
	 * @param page_name : the Page name want to delete
	 * @param parent_page : the Parent Page containing the page want to delete
	 * @return None
	 * @author Hai Vu
	 */
	public static void deletePage(String page_name,String parent_page) throws InterruptedException
	{
		new DeletePage_Dashboard(driver,page_name,parent_page);
	}
	/**
	 * Description: this action is used to select sub-menu item in Dashboard Page 
	 * (Eg: select Add page sub-item after hovering the mouse over Settings button)
	 * @param hover_control : the hovered control to show the menu list
	 * @param selected_control : sub-menu item want to select
	 * @return None
	 * @author Thuong Le
	 */
	public static void selectSubMenuItem(By hover_control, By selected_control)
	{
		new SelectSubMenuItem(driver, hover_control, selected_control);
	}
	
	/**
	 * Description: this action is used to add a new Panel
	 * @param display_name : value of Display name textbox in Create New Panel window
	 * @param series_value : selected value of Series combobox in Create New Panel window
	 * @return None
	 * @author Thuong Le
	 */
	public static void addDashboardPanel (String display_name, String series_value)
	{
		new AddPanel_Dashboard(display_name,series_value);
	}
	
	/**
	 * Description: this action is used to check all values setting in Create New Panel page
	 * @param list_panel_info : List contains expected value for all fields in Create New Panel page
	 * @return None
	 * @author Thuong Le
	 */
	public static void checkPanelInfo(String[] list_panel_info)
	{
		new CheckPanelInfo(list_panel_info);
	}
	
	/**
	 * Description: this action is used to select a link action of a defined panel's name in Panels table
	 * @param panel_name : panel name that want to select its corresponding link
	 * @param link_name : Edit, Delete
	 * @return None
	 * @author Thuong Le
	 */
	public static void selectActionBasedPanelName_Dashboard(String panel_name,String link_name) throws InterruptedException
	{
		new SelectActionBasedPanelName_Dashboard(panel_name,link_name);
	}
	
	/**
	 * Description: this action is used to check all values setting in Edit Panel page
	 * @param list_edit_panel_info : List contains expected value for all fields in Edit Panel page
	 * @return None
	 * @author Thuong Le
	 */
	public static void checkEditPanelPageInfo_Dashboard(String[] list_edit_panel_info)
	{
		new CheckEditPanelPageInfo_Dashboard(list_edit_panel_info);
	}
	
	/**
	 * Description: this action is used to delete a created panel in Panels table (each panel name separated by "|" character. E.g: name1|name2)
	 * @param panel_name : name of panel want to delete
	 * @return None
	 * @author Thuong Le
	 */
	public static void deletePanel_Dashboard(String panel_name) throws InterruptedException
	{
		new DeletePanel_Dashboard(panel_name);
	}	
	
	public static void checkDropDownItemsSorted_Dashboard(By control, String sorttype)
	{
		new CheckDropDownItemsSorted_Dashboard(control,sorttype);
	}
	
	/**
	 * Description: this action is used to select an expected item under a Panels' type  
	 * (Eg: select item "Action Implementation By Status" under "Charts" panels type
	 * @param panel_type : types of panels (Eg:Charts,Indicators, Reports,or Heat Maps)
	 * @param panel_item : selected item under its corresponding Panels type (Eg: Action Implementation By Status)
	 * @return None
	 * @author Thuong Le
	 */
	public static void selectPanelsItem_Dashboard(String panel_type, String panel_item)
	{
		new SelectPanelsItem_Dashboard(panel_type, panel_item);
	}
	/**
	 * Description: this action is used to launch Edit Page of pageName which does not have parent page  
	 * @param pageName : Name of the page you want to edit
	 * @return None
	 * @author Hai Vu
	 */
	public static void launchEditPage_Dashboard (String pageName) throws InterruptedException
	{
		new LaunchEditPage_Dashboard(pageName);
	}
	/**
	 * Description: this action is used to launch Edit Page of pageName which has parent page <parentPageName>
	 * @param pageName : Name of the page you want to edit
	 * @param parentPageName : Name of the parent page
	 * @return None
	 * @author Hai Vu
	 */
	public static void launchEditPage_Dashboard (String pageName,String parentPageName) throws InterruptedException
	{
		new LaunchEditPage_Dashboard(pageName,parentPageName);
	}
	/**
	 * Description: this action is used to edit a page
	 * @param pageName : Name of the page you want to edit
	 * @param parentPageName : Name of the parent page
	 * @param newPageName : New name of the page
	 * @param newParentPage : New name of the parent page  
	 * @param numberOfColumns : Number of Columns  
	 * @param displayAfter : Name of the page of displayAfter
	 * @param publicOption : Value of public checkbox              
	 * @return None
	 * @author Hai Vu
	 */
	public static void editPage_Dashboard (String pageName,String parentPageName,String newPageName,String newParentPage,String numberOfColumns,String displayAfter,boolean publicOption) throws InterruptedException
	{
		new EditPage_Dashboard(pageName,parentPageName,newPageName,newParentPage,numberOfColumns,displayAfter,publicOption);
	}
	/**
	 * Description: this action is used to log out Dashboard
	 * @return None
	 * @author Hai Vu
	 */
	public static void logOut_Dashboard () throws InterruptedException
	{
		new LogOut_Dashboard();
	}
	
	/**
	 * Description: this action is used to get all column's values of Data Profile table
	 * @param column_num : Column number want to get values 
	 * @return listitems : list containing all values of the input column
	 * @author Thuong Le
	 */
	public static ArrayList<String> getDataProfileColumnValues_Dashboard(int column_num)
	{
		GetDataProfileColumnValues_Dashboard get_da_column_value=new GetDataProfileColumnValues_Dashboard(column_num);
		return get_da_column_value.listitems;
	}
	
	/**
	 * Description: this action is used to check an expected column sorted
	 * @param column_number : Column number want to check sorted
	 * @param sort_type : sorted type E.g. ascending OR descending
	 * @return listitems : list containing all values of the input column
	 * @author Thuong Le
	 */
	public static void checkDataProfileColumnSorted_Dashboard(int column_number, String sort_type)
	{
		new CheckDataProfileColumnSorted_Dashboard(column_number, sort_type);
	}
	
	/**
	 * Description: this action is used to fill data into General Settings page
	 * @param name : input value of Name textbox
	 * @return None
	 * @author Thuong Le
	 */
	public static void fillGeneralSettingsData_Dashboard(String name)
	{
		new FillGeneralSettingsData_Dashboard(name);
	}
	
	/**
	 * Description: this action is used to fill data into General Settings page
	 * @param name : input value of Name textbox
	 * @param item_type : input value of Item Type combobox
	 * @param related_data : input value of Related Data combobox
	 * @return None
	 * @author Thuong Le
	 */
	public static void fillGeneralSettingsData_Dashboard(String name, String item_type, String related_data)
	{
		new FillGeneralSettingsData_Dashboard(name, item_type, related_data);
	}
	
	/**
	 * Description: this action is used to add level for selected fields in Sort Fields page
	 * @param selected_fields : List of selected fields you want to add level (each value is separated by "|" )
	 * @return None
	 * @author Thuong Le
	 */
	public static void addLevelSortedForFields_Dashboard(String selected_fields)
	{
		new AddLevelSortedForFields_Dashboard(selected_fields);
	}
}
