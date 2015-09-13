package action_built_in;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetTableCellValue extends AutoAction{

	public GetTableCellValue(WebDriver driver, By control, int row, int column, String value) {
		
		String data_you_want_to_check = "your data in here";
		boolean check_data_existed = false;
		
		//you can find table by xpath or some option ,depend on your site.
		WebElement table = driver.findElement(control);
		//get all tr inside table
		List<WebElement> tr_table = table.findElements(By.tagName("tr"));
		tr_table.indexOf(1);
		//now we will loop
		for(WebElement el : tr_table){
		  List<WebElement> td_table = el.findElements(By.tagName("td"));
		  for(WebElement elm : td_table){
		      String text_inside_td = elm.getText();
		      if(text_inside_td.equalsIgnoreCase(data_you_want_to_check))
		      {
		          check_data_existed = true;
		          break;
		      }
		  }
		}
	}

}
