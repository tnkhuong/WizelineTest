package dashboard.test_module.panel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import action_built_in.GetTableCellContaining;
import config.GlobalVariables;
import dashboard.action.hla.AddPanel_Dashboard;
import dashboard.action.hla.AutoHLActions_Dashboard;
import dashboard.object_repository.MainPage_Dashboard;
import dashboard.object_repository.PanelsPage_Dashboard;

public class NewTest extends AutoHLActions_Dashboard {
	
	static MainPage_Dashboard main_page = new MainPage_Dashboard();
	static PanelsPage_Dashboard panels_page=new PanelsPage_Dashboard();
  @Test
  public void f() {
	  selectSubMenuItem(main_page.administer_link, main_page.panels_link);
      //click(panels_page.add_new_link);
	  //addDashboardPanel("Logigear","name");
      
	  String abc = getTableCellValue(panels_page.panel_table, 1, 1);
	  System.out.println("value:" + abc);
	  
	  
	  int row = getTableCellContaining(panels_page.panel_table, "Logigear").getReturn_row();  
	  int column = getTableCellContaining(panels_page.panel_table, "Logigear").getReturn_column();
	  
	  System.out.println("Row:" + row);
	  System.out.println("Column:" + column);	  
	  
	  /*
	  String data_you_want_to_check = "Logigear1";
	  boolean check_data_existed = false;
	  waitForElement(panels_page.panel_table, 10);
	  WebElement table = driver.findElement(panels_page.panel_table);
		//get all tr inside table
		List<WebElement> tr_table = table.findElements(By.tagName("tr"));
		WebElement row_table = table.findElement(By.xpath("//tr[2]"));
		WebElement col_table = row_table.findElement(By.xpath("//td[2]"));
		
		System.out.println(col_table.getText());

		tr_table.indexOf(1);
		//now we will loop
		for(WebElement el : tr_table){
		  List<WebElement> td_table = el.findElements(By.tagName("td"));
		  
		  
		  int td_index = td_table.indexOf(2);
		  for(WebElement elm : td_table){
		      String text_inside_td = elm.getText();
		      if(text_inside_td.equalsIgnoreCase(data_you_want_to_check))
		      {
		    	  System.out.println("Data exists");
		          check_data_existed = true;
		          break;
		      }
		      */
		  //}		
		//}  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  navigate("firefox",GlobalVariables.glb_Url);
	  logInDashboard(GlobalVariables.glb_Repository, GlobalVariables.glb_Username, GlobalVariables.glb_Password);	
  }

  @AfterTest
  public void afterTest() {
  }

}
