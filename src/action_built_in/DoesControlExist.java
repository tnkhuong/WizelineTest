package action_built_in;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import config.GlobalVariables;

public class DoesControlExist {
	public static boolean exist=false;
	public DoesControlExist (WebDriver driver,By control){
		new WaitForPageLoad(driver, GlobalVariables.DEFAULT_WAIT_4_PAGE*2);
		try {
			driver.findElement(control);
			exist=true;
		}
		catch (NoSuchElementException e) {
			exist=false;
		}
	}
}
