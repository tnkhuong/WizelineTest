package testModule;

import objectRepository.MainPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import config.GlobalVariables;
import actionHLA.AutoHLActions;

public class DA_MP_TO020 extends AutoHLActions{
	MainPage main_page=new MainPage();
  @Test
  public void DA_MP_TC020_TC() throws InterruptedException {
	  //Set Variables
	  String parent_page_control="//a[text()='test']";
	  String child_page_control="//a[text()='test']/following-sibling::ul/li/a";
	  //Step 1	Navigate to Dashboard login page
	  //Step 2	Log in specific repository with valid account
	  LogInDashboard(GlobalVariables.glb_Repository, GlobalVariables.glb_Username, GlobalVariables.glb_Password);
	  int x = 0;
	  int y=0;
	  WaitForElement(main_page.setting_link, 100);
	  getcontrolcoordinate(main_page.setting_link, x, y);
	  System.out.print(x);
	  //Step 3	Add a new parent page
	  /*AddDashboardPage("test","","");
	  WaitForElement(By.xpath(parent_page_control), GlobalVariables.DEFAULT_WAIT_4_CONTROL);
	  //Step 4	Add a children page of newly added page
	  AddDashboardPage("test child","test","");
	  //Step 5	Click on parent page
	  clickObject(By.xpath(parent_page_control));
	  //Step 6	Click "Delete this page" icon
	  clickObject(main_page.delete_page_button);
	  //VP	Check confirm message "Are you sure you want to remove this page?" appears
	  CheckPopUpMessage("Are you sure you want to remove this page?");
	  //Step 7	Click OK button
	  ConfirmPopup("yes");
	  //VP	Check warning message "Can not delete page 'Test' since it has children page(s)" appears
	  CheckPopUpMessage("Cannot delete page 'test' since it has children page(s).");
	  //Step 8	Click OK button
	  ConfirmPopup("yes");
	  //Step 9	Click on  children page
	  SelectSubMenuItem(By.xpath(parent_page_control), By.xpath(child_page_control));
	  //Step 10	Click "Delete this page" icon
	  clickObject(main_page.delete_page_button);
	  //VP	Check confirm message "Are you sure you want to remove this page?" appears
	  CheckPopUpMessage("Are you sure you want to remove this page?");
	  //Step 11	Click OK button
	  ConfirmPopup("yes");
	  //VP	Check children page is deleted
	  CheckControlNotExist(By.xpath(child_page_control));
	  //Step 12	Click on  parent page
	  clickObject(By.xpath(parent_page_control));
	  //Step 13	Click "Delete this page" icon
	  clickObject(main_page.delete_page_button);
	  //VP	Check confirm message "Are you sure you want to remove this page?" appears
	  CheckPopUpMessage("Are you sure you want to remove this page?");
	  //Step 14	Click OK button
	  ConfirmPopup("yes");
	  //VP	Check parent page is deleted
	  CheckControlNotExist(By.xpath(parent_page_control));
	  //Step 15	Click on "Overview" page
	  clickObject(main_page.overview_page_icon);
	  //VP	Check "Delete this page" icon disappears
	  CheckControlNotExist(main_page.delete_page_button);*/
  }
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  navigate(GlobalVariables.glb_Browser,GlobalVariables.glb_Url);
  }

  @AfterMethod
  public void afterMethod() {
	  ExitPage();
  }

}
