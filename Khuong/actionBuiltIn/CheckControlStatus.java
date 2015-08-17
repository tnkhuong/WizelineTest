package actionBuiltIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CheckControlStatus {

		/**
		 * Description: this action is used to check whether element is exist or not
		 * @param control is object
		 * @return None
		 * @author Khuong Truong
		 * @throws InterruptedException 
		 */
		/*
		public static void execute(WebDriver driver,By control)
		{
			WebElement element=driver.findElement(control);
			boolean exist= element.isDisplayed();
			Assert.assertEquals(exist, true);
		}*/
		
		public CheckControlStatus(WebDriver driver,By control, String status)
		{	
			WebElement element=driver.findElement(control);
			boolean exist= element.isEnabled();
			Assert.assertEquals(exist, status);
		}
}
