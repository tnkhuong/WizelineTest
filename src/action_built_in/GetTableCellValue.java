package action_built_in;

import java.util.List;

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
		//WebElement table = driver.findElement(table_control);				
		/*
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
		*/
		
		int ac_row=0;
		int ac_col=0;
		
		WebElement table = driver.findElement(table_control);				
		List<WebElement> row_table = table.findElements(By.tagName("tr"));
			for(WebElement tr : row_table)
			{
				ac_row=ac_row+1;
				ac_col=0;				
				if (ac_row==row)
				{
					List<WebElement> col_table = tr.findElements(By.tagName("td"));
					for (WebElement td : col_table)
					{
						ac_col=ac_col+1;
						if (ac_col==column)
						{
							this.return_value = td.getText();
							return;
						}
					}
				}
				}
		}	

	public String getReturn_value(){
		return this.return_value;
	}
}
