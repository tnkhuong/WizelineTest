package dashboard.test_module.panel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import config.GlobalVariables;
import dashboard.object_repository.AddNewPanel_Dashboard;
import dashboard.object_repository.MainPage_Dashboard;
import dashboard.object_repository.PanelsPage_Dashboard;

public class DA_PANEL_TC_061 extends dashboard.action.hla.AutoHLActions_Dashboard{
	static MainPage_Dashboard main_page = new MainPage_Dashboard();
	static PanelsPage_Dashboard panels_page=new PanelsPage_Dashboard();
	static AddNewPanel_Dashboard add_new_panel_page=new AddNewPanel_Dashboard();
	static AddNewPanel_Dashboard edit_panel_page=new AddNewPanel_Dashboard();
	static String panel_name = "Logigear";
	@Test
	public void main () throws Exception{
		//Add Logigear panel
		click(panels_page.add_new_link);
		addDashboardPanel("Logigear","name");
		selectActionBasedPanelName_Dashboard(panel_name, "Edit");
		//SECTION Check Default Chart Settings of Pie chart
		selectDropdown(edit_panel_page.chart_type_combobox, "Pie", "value");
		checkControlProperty(edit_panel_page.category_combobox,"enabled","false");
		checkControlProperty(edit_panel_page.category_caption_textbox,"enabled","false");
		checkControlProperty(edit_panel_page.series_combobox,"enabled","true");
		//SECTION Check Default Chart Settings of Single Bar chart
		selectDropdown(edit_panel_page.chart_type_combobox, "Single Bar", "value");
		checkControlProperty(edit_panel_page.category_combobox,"enabled","false");
		checkControlProperty(edit_panel_page.series_combobox,"enabled","true");
		checkControlProperty(edit_panel_page.series_caption_textbox,"enabled","true");
		click(edit_panel_page.ok_button);
		//Delete the created panel
		deletePanel_Dashboard(panel_name);
		}
	 @BeforeClass
	  @Parameters("browser")
	  public void beforeClass(String browser) throws Exception {
		  //Navigate and log in Dashboard with the first account
		  navigate(browser,GlobalVariables.glb_Url);
		  logInDashboard(GlobalVariables.glb_Repository, GlobalVariables.glb_Username, GlobalVariables.glb_Password);
		  //Delete panel if they exist
		  selectSubMenuItem(main_page.administer_link, main_page.panels_link);	  
		  deletePanel_Dashboard(panel_name);
	  }

	  @AfterClass
	  public void afterClass() throws InterruptedException {
		  //Log Out and exist Dashboard
		  logOut_Dashboard();
		  exitPage();
	  }
}
