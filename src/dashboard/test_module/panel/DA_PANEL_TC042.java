package dashboard.test_module.panel;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import config.GlobalVariables;
import dashboard.action.hla.AutoHLActions_Dashboard;
import dashboard.object_repository.AddNewPanel_Dashboard;
import dashboard.object_repository.EditPanelPage_Dashboard;
import dashboard.object_repository.MainPage_Dashboard;
import dashboard.object_repository.PanelsPage_Dashboard;
public class DA_PANEL_TC042 extends AutoHLActions_Dashboard{
	MainPage_Dashboard main_page=new MainPage_Dashboard();
	PanelsPage_Dashboard panels_page=new PanelsPage_Dashboard();
	AddNewPanel_Dashboard addnewpanel_page=new AddNewPanel_Dashboard();
	EditPanelPage_Dashboard edit_panel_page=new EditPanelPage_Dashboard();
	//SET VARIABLE
	String panel_name= "Panel 1";
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
		//*************SECTION-ADD NEW PANEL PAGE*************
		//Step 6	Click None radio button for Legend
		click(addnewpanel_page.none_radiobutton);
		//VP	Observe the current page: All settings are unchanged in Add New Panel dialog
		String[] list_panel_info_None= {"true","false","false","false","Action Implementation By Status","","",
				"false","Pie","true","false","false","Select a field...",
		        "false","","true","Select a field...","false","","true","false",
		        "false","false","false","false","false","false","false"};
		checkPanelInfo(list_panel_info_None);
		//Step 7	Click Top radio button for Legend
		click(addnewpanel_page.top_radiobutton);
		//VP	Observe the current page: All settings are unchanged in Add New Panel dialog
		String[] list_panel_info_Top= {"true","false","false","false","Action Implementation By Status",
                "","","false","Pie","true","false","false","Select a field...",
                "false","","true","Select a field...","false","","false","true",
                "false","false","false","false","false","false","false"};
		checkPanelInfo(list_panel_info_Top);
		//Step 8	Click Right radio button for Legend
		click(addnewpanel_page.right_radiobutton);
		//VP	Observe the current page: All settings are unchanged in Add New Panel dialog
		String[] list_panel_info_Right= {"true","false","false","false","Action Implementation By Status",
                "","","false","Pie","true","false","false","Select a field...",
                "false","","true","Select a field...","false","","false","false",
                "true","false","false","false","false","false","false"};
		checkPanelInfo(list_panel_info_Right);
		//Step 9	Click Bottom radio button for Legend
		click(addnewpanel_page.bottom_radiobutton);
		//VP	Observe the current page: All settings are unchanged in Add New Panel dialog
		String[] list_panel_info_Bottom= {"true","false","false","false","Action Implementation By Status",
                "","","false","Pie","true","false","false","Select a field...",
                "false","","true","Select a field...","false","","false","false",
                "false","true","false","false","false","false","false"};
		checkPanelInfo(list_panel_info_Bottom);
		//Step 10	Click Left radio button for Legend
		click(addnewpanel_page.left_radiobutton);
		//VP	Observe the current page
		String[] list_panel_info_Left= {"true","false","false","false","Action Implementation By Status",
                "","","false","Pie","true","false","false","Select a field...",
                "false","","true","Select a field...","false","","false","false",
                "false","false","true","false","false","false","false"};
		checkPanelInfo(list_panel_info_Left);
		//Step 11	Create a new panel: Panel 1
		addDashboardPanel(panel_name,"name");
		//Step 12	Click Edit Panel link
		selectActionBasedPanelName_Dashboard(panel_name, "Edit");
		//*************SECTION-EDIT PANEL PAGE*************
		//Step 13	Click None radio button for Legend
		click(edit_panel_page.none_radiobutton);
		//VP	Observe the current page: All settings are unchanged in Edit New Panel dialog
		String[] list_editpanel_info_None= {"Chart","Action Implementation By Status", panel_name,"","false",
				"Pie","true","false","false","Select a field...","false","","true","  Name","false","",
				"true","false","false","false","false","false","false","false","false"};
		checkEditPanelPageInfo_Dashboard(list_editpanel_info_None);
		//Step 14	Click Top radio button for Legend
		click(edit_panel_page.top_radiobutton);
		//VP	Observe the current page: All settings are unchanged in Edit New Panel dialog
		String[] list_editpanel_info_Top= {"Chart","Action Implementation By Status", panel_name,"","false",
				"Pie","true","false","false","Select a field...","false","","true","  Name","false","",
				"false","true","false","false","false","false","false","false","false"};
		checkEditPanelPageInfo_Dashboard(list_editpanel_info_Top);
		//Step 15	Click Right radio button for Legend
		click(edit_panel_page.right_radiobutton);
		//VP	Observe the current page: All settings are unchanged in Edit New Panel dialog
		String[] list_editpanel_info_Right= {"Chart","Action Implementation By Status", panel_name,"","false",
				"Pie","true","false","false","Select a field...","false","","true","  Name","false","",
				"false","false","true","false","false","false","false","false","false"};
		checkEditPanelPageInfo_Dashboard(list_editpanel_info_Right);
		//Step 16	Click Bottom radio button for Legend
		click(edit_panel_page.bottom_radiobutton);
		//VP	Observe the current page: All settings are unchanged in Edit New Panel dialog
		String[] list_editpanel_info_Bottom= {"Chart","Action Implementation By Status", panel_name,"","false",
				"Pie","true","false","false","Select a field...","false","","true","  Name","false","",
				"false","false","false","true","false","false","false","false","false"};
		checkEditPanelPageInfo_Dashboard(list_editpanel_info_Bottom);
		//Step 17	Click Left radio button for Legend
		click(edit_panel_page.left_radiobutton);
		//VP	Observe the current page: All settings are unchanged in Edit New Panel dialog
		String[] list_editpanel_info_Left= {"Chart","Action Implementation By Status", panel_name,"","false",
				"Pie","true","false","false","Select a field...","false","","true","  Name","false","",
				"false","false","false","false","true","false","false","false","false"};
		checkEditPanelPageInfo_Dashboard(list_editpanel_info_Left);
	}

	@BeforeClass
	@Parameters("browser")
	public void beforeClass(String browser) throws Exception {
	  navigate(browser,GlobalVariables.glb_Url);
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
	 click(edit_panel_page.cancel_button);
	 deletePanel_Dashboard(panel_name);
	 exitPage();
	}
 }