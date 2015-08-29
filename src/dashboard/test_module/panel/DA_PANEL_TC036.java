package dashboard.test_module.panel;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import config.GlobalVariables;
import dashboard.action.hla.AutoHLActions_Dashboard;
import dashboard.object_repository.AddNewPanel_Dashboard;
import dashboard.object_repository.EditPanelPage_Dashboard;
import dashboard.object_repository.MainPage_Dashboard;
import dashboard.object_repository.PanelsPage_Dashboard;

//DA_PANEL_TR036-1: Verify "Data Profile" listing of "Add New Panel" control are in alphabetical order
//DA_PANEL_TR036-2: Verify the selected Data Profile is displayed correctly on Edit Panel form

public class DA_PANEL_TC036 extends AutoHLActions_Dashboard {
  
	MainPage_Dashboard main_page=new MainPage_Dashboard();
	PanelsPage_Dashboard panels_page=new PanelsPage_Dashboard();
	AddNewPanel_Dashboard addnewpanel_page=new AddNewPanel_Dashboard();
	EditPanelPage_Dashboard edit_panel_page=new EditPanelPage_Dashboard();
	
  @Test
  public void DA_PANEL_TC036_TC() throws InterruptedException {
		  
	  //Step 1: Click on Administer/Panels link
	  selectSubMenuItem(main_page.administer_link, main_page.panels_link);	  
	  
	  //Step 2: Click on Add new link
	  click(panels_page.add_new_link);
	  
	  //VP: Verify Data Profile list is in alphabetical order
	  //----Data Profile list is in alphabetical order
	  checkDropDownItemsSorted_Dashboard(addnewpanel_page.data_profile_combobox, "ascending");
	    
	  //Step 3: Enter a display name to display name field (giang - panels)
	  enter(addnewpanel_page.display_name_textbox,"giang-panels");
	  selectDropdown(addnewpanel_page.series_combobox, 1);

	  //Step 4: Click on OK button
	  click(addnewpanel_page.ok_button);
	  
	  //Step 5: Click on Edit link
	  selectActionBasedPanelName_Dashboard("giang-panels", "edit");
	  
	  //VP: Verify the selected Data Profile is displayed correctly on Edit Panel form
	  //----Data Profile "Action Implementation By Status" is displayed on Edit Panel form
	  checkSelectedValue(addnewpanel_page.data_profile_combobox, "Action Implementation By Status");
	  click(addnewpanel_page.cancel_button);
  }
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  navigate("chrome",GlobalVariables.glb_Url);
	  logInDashboard(GlobalVariables.glb_Repository, GlobalVariables.glb_Username, GlobalVariables.glb_Password);
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  deletePanel_Dashboard("giang-panels");
	  exitPage();
  }
}
