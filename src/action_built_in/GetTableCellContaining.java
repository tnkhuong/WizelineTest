package action_built_in;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetTableCellContaining extends AutoAction{

		int return_row=0;
		int return_column=0; 
		
		/**
		 * Description: this action is used to get row and column of the cell which contain the expected value in a table.
		 * @param Enter a string value which user want to get the row and column
		 * @return return_row and return_column are value which get from expected value
		 * @author Khuong Truong
		 */
		public GetTableCellContaining(WebDriver driver, By table_control, String value) {
			int col=0;
			int row=0;			
			WebElement table = driver.findElement(table_control);				
			List<WebElement> row_table = table.findElements(By.tagName("tr"));
				for(WebElement tr : row_table)
				{
					row=row+1;
					List<WebElement> col_table = tr.findElements(By.tagName("td"));
					for (WebElement td : col_table)
					{
						col=col+1;
						String text_inside_td = td.getText();
						if (text_inside_td.equals(value))
						{
							return_column = col;
							return_row = row;
							return;
						}
					}
				}
		}
		
		public int getReturn_row(){
			return return_row;
		}
		
		public int getReturn_column(){
			return return_column;
		}
		
}