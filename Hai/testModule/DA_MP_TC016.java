package testModule;

import org.testng.annotations.Test;

import config.GlobalVariables;
import objectRepository.MainPage;
import objectRepository.NewPage;
import actionHLA.AutoHLActions;

public class DA_MP_TC016 extends AutoHLActions {
	static MainPage mainpage = new MainPage();
	static NewPage newPage = new NewPage();
	@Test
    public void main () throws Exception{
	  Navigate(GlobalVariables.glb_Browser,"http://localhost:54000/TADashboard/login.jsp");
	  LogIn("SampleRepository", "administrator", "");
	  AddPage("Test");
	  AddPage("Another Test", "","3","newPage1",false);
	  // "Another Test" page is positioned besides the "Test" page"Another Test" page is positioned besides the "Test" page
	}
}
