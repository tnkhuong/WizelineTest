package action_built_in;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class DoesControlExist {
	public static boolean exist=false;
	public DoesControlExist (WebDriver driver,By control){
		try {
			driver.findElement(control);
			exist=true;
		}
		catch (NoSuchElementException e) {
			exist=false;
		}
	}
}
