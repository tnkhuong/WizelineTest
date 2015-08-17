package actionBuiltIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Enter {
	/**
	 * Description: this action is used to enter value into textbox
	 * @param control is object
	 * @param Svalue is text will enter textbox
	 * @return None
	 * @author Thuong Le
	 */
	public Enter(WebDriver driver,By control,String Svalue){
		driver.findElement(control).clear();
		driver.findElement(control).sendKeys(Svalue);
	}

}
