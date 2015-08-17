package testModule;

import object_repository.LoginPage;
import object_repository.MainPage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import actionBuiltIn.AutoAction;
import actionHLA.AutoHLActions;

import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_DA_LOGIN_TR013 extends AutoHLActions{
	
	static MainPage mainpage = new MainPage();
	static LoginPage loginpage = new LoginPage();
	
	  @BeforeMethod
	  public void beforeMethod() throws Exception {
		  //Navigate(GlobalVariables.glb_Browser,GlobalVariables.glb_Url);
	  }
	  
	  @AfterMethod
	  public void afterMethod() {
		  ExitDashboard();
	  }
	  
  @Test
  public void DA_LOGIN_TR013() throws Exception { 
	  LogIn("http://localhost:54000/TADashboard/login.jsp", "SampleRepository", "administrator", "");
	  MoveMouse(mainpage.setting_button);
	  Click(mainpage.addpage_button);
	  MoveMouse(mainpage.setting_button);
	  CheckControlNotExist(loginpage.password_textbox);  
  }
}
