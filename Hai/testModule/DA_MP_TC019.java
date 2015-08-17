package testModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import config.GlobalVariables;
import objectRepository.EditPage;
import objectRepository.MainPage;
import objectRepository.NewPage;
import actionHLA.AutoHLActions;

public class DA_MP_TC019 extends AutoHLActions {
	static MainPage mainpage = new MainPage();
	static NewPage newPage = new NewPage();
	static EditPage editPage = new EditPage();
	static By testPage = By.linkText("Test");
	static By anotherPage = By.linkText("Another Test");
	
	@Test
    public void main () throws Exception{
	  Navigate(GlobalVariables.glb_Browser,"http://localhost:54000/TADashboard/login.jsp");
	  LogIn("SampleRepository", "administrator", "");
	  //AddPage("Test","","","",true);
	  //AddPage("Another","","","",true);
	  // Edit Test page
	  Click(testPage);
	  WaitForPage(20000);
	  Click(mainpage.setting_link);
	  Click(mainpage.editPage_link);
	  WaitForControl(editPage.editPage_title, 10000);
	  //WaitForPage(20000);
	  System.out.println(driver.findElement(editPage.editPage_title).getText());
	  driver.findElement(editPage.editPage_title).
	  
	  //CheckControlExist(editPage.editPage_title);
	  /* Edit Another page
	  Click(anotherPage);
	  WaitForPage(20000);
	  Click(mainpage.setting_link);
	  Click(mainpage.editPage_link);
	  WaitForPage(20000);
	  CheckControlExist(editPage.editPage_title);
	  Set (newPage.public_checkbox,false);
	  Click(newPage.ok_button);
	  WaitForPage(20000);
	  //LogOut and LogIn again with another user
	  LogOut();
	  LogIn("SampleRepository", "john", "");
	  //Check Test is visible and Another Test is not
	  CheckControlExist(testPage);
	  CheckControlNotExist(anotherPage);*/
	}
}
