package demo.testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import config.GlobalVariables;
import demo.action.hla.AutoHLActions;

public class DemoTestCase extends AutoHLActions{
	  @BeforeClass
	  public void beforeClass(String browser) throws Exception {
		  navigate(GlobalVariables.glb_Browser,GlobalVariables.glb_Url);
	  }
	  
	  @Test
	  public void f(){
		  searchgoogle("Selenium");
	  }
			
	  @AfterClass
	  public void afterClass() throws InterruptedException {
		  exitPage();
	  }
}
