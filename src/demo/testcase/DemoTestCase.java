package demo.testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.GlobalVariables;
import demo.action.hla.AutoHLActions;
import demo.object_repository.GooglePage;
import demo.object_repository.SeleniumHQPage;
	
public class DemoTestCase extends AutoHLActions{

	  static GooglePage googlepage = new GooglePage();
	  static SeleniumHQPage seleniumhqpage = new SeleniumHQPage();	  
	  
	  @BeforeTest
	  public void beforeTest() throws Exception {
		  //Navigate Google.com on Chrome browser
		  navigate("chrome",GlobalVariables.glb_Url);
	  }
	  
	  @Test
	  public void f(){
		  //Enter Selenium text into Search textbox then Click Search button.
		  searchgoogle("Selenium");
		  //Click "Selenium - Web Browser Automation" link (first link on Google Search).
		  click(googlepage.selenium_link);
		  //Verify that Selenium HQ Page is launched.	  
		  checkControlExist(seleniumhqpage.selenium_icon, 30);
	  }
			
	  @AfterTest
	  public void afterTest() throws InterruptedException {
		  exitPage();
	  }
}
