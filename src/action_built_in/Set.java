package action_built_in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * Description: this action is used to set value into checkbox
 * @param control is object
 * @param Svalue is text will enter textbox
 * @return None
 * @author Khuong Truong
 */
public class Set {
	public Set (WebDriver driver,By control,Boolean value){
		WebElement element=driver.findElement(control);
		  if ((!element.isSelected() && value==true)||(element.isSelected() && value==false))
		  {
		       element.click();
		  }	
	}
}