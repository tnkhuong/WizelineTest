package dashboard.test_module.panel;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import config.GlobalVariables;
import dashboard.object_repository.ChoosePanelsPage_Dashboard;
import dashboard.object_repository.MainPage_Dashboard;
import dashboard.object_repository.NewPage_Dashboard;

public class DA_PANEL_TC030 extends dashboard.action.hla.AutoHLActions_Dashboard{
	static MainPage_Dashboard main_page = new MainPage_Dashboard();
	static NewPage_Dashboard new_page = new NewPage_Dashboard();
	static ChoosePanelsPage_Dashboard choose_panel_page = new ChoosePanelsPage_Dashboard();
	static String pageName = "TC_30";
	static By pageLink = By.linkText(pageName);
	@Test
    public void main () throws Exception{
	  addDashboardPage(pageName,"","");
	  click(main_page.choose_panel_button);
	  //Check order of reports
	  checkControlPosition(choose_panel_page.charts_label,choose_panel_page.choose_panels_label,"next under");
	  checkControlPosition(choose_panel_page.indicators_label,choose_panel_page.charts_label,"next under");
	  checkControlPosition(choose_panel_page.reports_label,choose_panel_page.indicators_label,"next under");
	  checkControlPosition(choose_panel_page.heatmaps_label,choose_panel_page.reports_label,"next under");
}
	 @BeforeClass
	  @Parameters("browser")
	  public void beforeClass(String browser) throws Exception {
		  navigate(browser,GlobalVariables.glb_Url);
		  logInDashboard(GlobalVariables.glb_Repository, GlobalVariables.glb_Username, GlobalVariables.glb_Password);
		  //Pre-condition: Delete pages if it exist
		  deletePage(pageName);
	  }

	  @AfterClass
	  public void afterClass() throws InterruptedException {
		  deletePage(pageName);
		  //Log Out and exist Dashboard
		  logOut_Dashboard();
		  exitPage();
	  }
}
