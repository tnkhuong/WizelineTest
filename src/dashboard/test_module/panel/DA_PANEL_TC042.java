package dashboard.test_module.panel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import config.GlobalVariables;
import dashboard.action.hla.AutoHLActions_Dashboard;
import dashboard.object_repository.AddNewPanel_Dashboard;
import dashboard.object_repository.MainPage_Dashboard;
import dashboard.object_repository.PanelsPage_Dashboard;

public class DA_PANEL_TC042 extends AutoHLActions_Dashboard{
	MainPage_Dashboard main_page=new MainPage_Dashboard();
	PanelsPage_Dashboard panels_page=new PanelsPage_Dashboard();
	AddNewPanel_Dashboard addnewpanel_page=new AddNewPanel_Dashboard();
	@Test
	public void DA_PANEL_TC042_TC() throws InterruptedException 
	{
		//Step 1	Navigate to TA Dashboard
		//Step 2	Login with valid account
		logInDashboard(GlobalVariables.glb_Repository, GlobalVariables.glb_Username, GlobalVariables.glb_Password);
		//Step 3	Click Administer link
		//Step 4	Click Panel link
		selectSubMenuItem(main_page.administer_link, main_page.panels_link);
		//Step 5	Click Add New link
		click(panels_page.add_new_link);
		//Step 6	Click None radio button for Legend
		click(addnewpanel_page.none_radiobutton);
		//VP	Observe the current page: All settings are unchanged in Add New Panel dialog
		String[] list_panel_info_None= {"true","false","false","false","Action Implementation By Status",
				null,null,"false","Pie","true","false","false","Select a field...",
		        "true",null,"true","Select a field...","true",null,"true","false",
		        "false","false","false","true","false","false","false"};
		checkPanelInfo(list_panel_info_None);
		//Step 7	Click Top radio button for Legend
		click(addnewpanel_page.top_radiobutton);
		//VP	Observe the current page: All settings are unchanged in Add New Panel dialog
		String[] list_panel_info_Top= {"true","false","false","false","Action Implementation By Status",
                null,null,"false","Pie","true","false","false","Select a field...",
                "true",null,"true","Select a field...","true",null,"false","true",
                "false","false","false","true","false","false","false"};
		checkPanelInfo(list_panel_info_Top);
		//Step 8	Click Right radio button for Legend
		click(addnewpanel_page.right_radiobutton);
		//VP	Observe the current page: All settings are unchanged in Add New Panel dialog
		String[] list_panel_info_Right= {"true","false","false","false","Action Implementation By Status",
                null,null,"false","Pie","true","false","false","Select a field...",
                "true",null,"true","Select a field...","true",null,"false","false",
                "true","false","false","true","false","false","false"};
		checkPanelInfo(list_panel_info_Right);
		//Step 9	Click Bottom radio button for Legend
		click(addnewpanel_page.bottom_radiobutton);
		//VP	Observe the current page: All settings are unchanged in Add New Panel dialog
		String[] list_panel_info_Bottom= {"true","false","false","false","Action Implementation By Status",
                null,null,"false","Pie","true","false","false","Select a field...",
                "true",null,"true","Select a field...","true",null,"false","false",
                "false","true","false","true","false","false","false"};
		checkPanelInfo(list_panel_info_Bottom);
		//Step 10	Click Left radio button for Legend
		//VP	Observe the current page
		String[] list_panel_info_Left= {"true","false","false","false","Action Implementation By Status",
                null,null,"false","Pie","true","false","false","Select a field...",
                "true",null,"true","Select a field...","true",null,"false","false",
                "false","false","true","true","false","false","false"};
		checkPanelInfo(list_panel_info_Left);
		//Step 11	Create a new panel: Panel 1
		//Step 12	Click Edit Panel link
		//Step 13	Click None radio button for Legend
		//VP	Observe the current page: All settings are unchanged in Edit New Panel dialog
		//Step 14	Click Top radio button for Legend
		//VP	Observe the current page: All settings are unchanged in Edit New Panel dialog
		//Step 15	Click Right radio button for Legend
		//VP	Observe the current page: All settings are unchanged in Edit New Panel dialog
		//Step 16	Click Bottom radio button for Legend
		//VP	Observe the current page: All settings are unchanged in Edit New Panel dialog
		//Step 17	Click Left radio button for Legend
		//VP	Observe the current page: All settings are unchanged in Edit New Panel dialog
	}

	@BeforeClass
	@Parameters("browser")
	public void beforeClass(String browser) throws Exception {
	  navigate(browser,GlobalVariables.glb_Url);
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
	 // click(addnewpanel_page.cancel_button);
	 // waitUntilControlNotExist(addnewpanel_page.cancel_button, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
	 // deletePage("Panel 1");
	 // exitPage();
	}
 }
