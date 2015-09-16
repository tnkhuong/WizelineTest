package action_built_in;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetTableCellValue extends AutoAction{
	String return_value = null;
	
	/**
	 * Description: this action is used to get value of the cell in a table.
	 * @param row and column are input number of row and column which user want to get the value
	 * @return return_value is value which get from expected row and column
	 * @author Khuong Truong
	 */

	public GetTableCellValue(WebDriver driver, By table_control, int row, int column) {
		WebElement table = driver.findElement(table_control);				
		try
		{
			WebElement row_table = table.findElement(By.xpath("//tr[" + row + "]"));
			WebElement col_table = row_table.findElement(By.xpath("//td[" + column +"]"));			
			return_value = col_table.getText();
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Row and column are out of range");
		}
	}
	
	public String getReturn_value(){
		return return_value;
	}
}
