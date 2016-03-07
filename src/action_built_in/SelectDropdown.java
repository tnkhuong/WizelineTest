package action_built_in;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
	/**
	 * Description: this action is used to select a value in combobox
	 * @param control is object
	 * @param Svalue is text will be selected
	 * @param option is select value by the following expected option: text,or value
	 * @return None
	 * @author Khuong Truong
	 */
	public SelectDropdown(WebDriver driver,By control,String Svalue,String option){
		WebElement element=driver.findElement(control);
		Select select=new Select(element);
		if(Svalue!="")
		{
			if(option=="text")
				select.selectByVisibleText(Svalue);
			else if (option=="value")
				select.selectByValue(Svalue);
		}
	}
	
	public SelectDropdown(WebDriver driver,By control,Integer index){
		WebElement element=driver.findElement(control);
		Select select=new Select(element);
		select.selectByIndex(index);
	}	
}
