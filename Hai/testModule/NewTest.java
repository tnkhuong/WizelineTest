package testModule;

import org.testng.annotations.Test;

import actionBuiltIn.AutoAction;

public class NewTest extends AutoAction{
  @Test
  public void f() throws Exception {
	  navigate("firefox","http://localhost:54000/TADashboard/login.jsp");
  }
}
