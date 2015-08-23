package dashboard.test_module.mainpage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import config.GlobalVariables;
import dashboard.object_repository.MainPage_Dashboard;
import actionHLA.AutoHLActions;

public class DA_MP_TC014 extends AutoHLActions{
  @Test
  /*Verify when "New Page" control/form is brought up to focus all other control within
Dashboard page is locked and disabled*/
  public void DA_MP_TC014_TC() {
	  MainPage_Dashboard main_page=new MainPage_Dashboard();
	  //S2- Login with valid account
	  LogInDashboard(GlobalVariables.glb_Repository, GlobalVariables.glb_Username, GlobalVariables.glb_Password);
	  //S3- Click Add Page icon	
	  clickObject(main_page.add_page_button);
	  //S4- Try to click other controls on Main page when New Page dialog is opening
	  clickObject(main_page.add_page_button);
	  clickObject(main_page.overview_page_icon);
	  //VP- Observe the current page (All other controls within Dashboard are locked and disabled)
	  CheckControlExist(main_page.lock_frame, GlobalVariables.DEFAULT_WAIT_4_CONTROL);
  }
  @BeforeMethod
  public void beforeMethod() throws Exception {
	//S1- Navigate to TA Dashboard
	  navigate(GlobalVariables.glb_Browser,GlobalVariables.glb_Url);
  }

  @AfterMethod
  public void afterMethod() {
	  ExitPage();
  }

}
