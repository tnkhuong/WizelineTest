package dashboard.test_module.panel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import config.GlobalVariables;
import dashboard.object_repository.AddNewPanel_Dashboard;
import dashboard.object_repository.MainPage_Dashboard;
import dashboard.object_repository.PanelsPage_Dashboard;

public class DA_PANEL_TC_034 extends dashboard.action.hla.AutoHLActions_Dashboard{
	static MainPage_Dashboard main_page = new MainPage_Dashboard();
	static PanelsPage_Dashboard panels_page=new PanelsPage_Dashboard();
	static AddNewPanel_Dashboard addnewpanel_page=new AddNewPanel_Dashboard();
	@Test
	public void main () throws Exception{
		//Launch Add Panel page
		selectSubMenuItem(main_page.administer_link, main_page.panels_link);	  
		click(panels_page.add_new_link);
		//Verify correct panel setting form is displayed with chart type
		checkControlPosition(addnewpanel_page.panel_setting_label,addnewpanel_page.display_name_textbox,"next under");
		//Verify correct panel setting form is displayed with indicator type
		set(addnewpanel_page.indicator_type_radiobutton, true);
		waitForPageLoad(GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		checkControlProperty(addnewpanel_page.panel_setting_label, "value", "Indicator Settings");
		//Verify correct panel setting form is displayed with Report type
		set(addnewpanel_page.report_type_radiobutton, true);
		waitForPageLoad(GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		checkControlNotExist(addnewpanel_page.panel_setting_label);
		//Close Add Panel page
		click(addnewpanel_page.cancel_button);
		waitForPageLoad(GlobalVariables.DEFAULT_WAIT_4_CONTROL);
		}
	 @BeforeClass
	  @Parameters("browser")
	  public void beforeClass(String browser) throws Exception {
		  //Navigate and log in Dashboard with the first account
		  navigate(browser,GlobalVariables.glb_Url);
		  logInDashboard(GlobalVariables.glb_Repository, GlobalVariables.glb_Username, GlobalVariables.glb_Password);
	  }

	  @AfterClass
	  public void afterClass() throws InterruptedException {
		  //Log Out and exist Dashboard
		  logOut_Dashboard();
		  exitPage();
	  }
}
