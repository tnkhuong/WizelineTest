package testModule;

import org.openqa.selenium.By;
import actionBuiltIn.AutoAction;
import actionHLA.AutoHLActions;

public class Test extends AutoHLActions{
	
	public static void main (String[] args) throws Exception{
		LogIn("http://localhost:54000/TADashboard/login.jsp", "SampleRepository", "administrator", "");
		//navigate("firefox","http://localhost:54000/TADashboard/login.jsp");
		//SelectDropdown(By.id("repository"), 1);
		//SelectDropdown(By.id("repository"), 0);
		//SelectDropdown(By.id("repository"), "Test", "text");
		//SelectDropdown(By.id("repository"), 0);		
	}	
}
