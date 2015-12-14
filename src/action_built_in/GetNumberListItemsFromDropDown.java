package action_built_in;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GetNumberListItemsFromDropDown {
	/**
	 * Description: this action is used to get number of items in dropdown and list all items in dropdown to ArrayList
	 * @param control is combobox
	 * @return int, ArrayList
	 * @author Khuong Truong
	 */	
	
	public static int number = 0;
	public static ArrayList<String> list = new ArrayList<String>();
	
	public GetNumberListItemsFromDropDown(WebDriver driver, By control) {	
		
		  Select select = new Select(driver.findElement(control));
		  List<WebElement> l = select.getOptions();
		  number = l.size();
		  
		  for (int i=0; i<number;i++)
		  {
			  list.add(l.get(i).getText());
		  }
	  	}
}
