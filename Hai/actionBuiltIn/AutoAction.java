package actionBuiltIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.Init;

public class AutoAction  extends Init{
	public static void SelectDropdown(By control, Integer value)
	{
		SelectDropdown select= new SelectDropdown(driver,control,value);
	}
	
	public static void SelectDropdown(By control, String value, String option){		
		SelectDropdown select= new SelectDropdown(driver,control,value,option);
	}
	public static void CheckControlExist (By control){		
		CheckControlExist checkcontrolexist= new CheckControlExist(driver,control);
	}
	public static void CheckControlNotExist (By control){		
		CheckControlNotExist checkcontrolnotexist= new CheckControlNotExist(driver,control);
	}
	public static void CheckPopUpMessage(String expectedMesg)
	{
		CheckPopUpMessage checkpopupmessage= new CheckPopUpMessage (driver, expectedMesg);
	}
	public static void Click (By control){		
		Click click= new Click(driver,control);
	}
	public static void Enter (By control, String value){		
		Enter enter= new Enter(driver,control,value);
	}
	public static void ExitBrowser (){		
		ExitBrowser exitBrowser= new ExitBrowser(driver);
	}
	public static void Set (By control, Boolean value){		
		Set set= new Set (driver,control,value);
	}
	public static void WaitForControl (By control,long timeout){		
		WaitForControl waitForControl= new WaitForControl (driver,control,timeout);
	}
	public static void WaitForPage (int timeout){		
		WaitForPage waitForPage= new WaitForPage (driver,timeout);
	}
}



