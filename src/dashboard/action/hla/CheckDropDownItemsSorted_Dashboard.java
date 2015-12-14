package dashboard.action.hla;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckDropDownItemsSorted_Dashboard extends action_built_in.AutoAction{
	
	ArrayList<String> listitems = new ArrayList<String>();
	
	public CheckDropDownItemsSorted_Dashboard(By control, String sorttype) {
		
		int num = getNumberItemsFromDropDown(control);
		listitems = getListItemsFromDropDown(control);
		
		for (int i = 0; i<num-1; i++)
		{
			String str1 = listitems.get(i);
			String str2 = listitems.get(i+1);
			
			if (sorttype.equalsIgnoreCase("ascending"))
			{
				if (str1.compareTo(str2)>0)
				{
					Assert.assertEquals("False", "true", "Data Profile list is not sorted in alphabetical ascending order!!!");
					return;
				}				
			}
			else if (sorttype.equalsIgnoreCase("descending"))
			{
				if (str1.compareTo(str2)<0)
				{
					Assert.assertEquals("False", "true", "Data Profile list is not sorted in alphabetical descending order!!!");
					return;
				}	
			}
			else
			{
				System.out.println("The expected value enter invalid" );
				return;
			}
		}				
		Assert.assertEquals(true, true, "Data Profile list is sorted in alphabetical "+ sorttype +" order!!!");		
	}
}
