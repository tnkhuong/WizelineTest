package dashboard.action.hla;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckDataProfileColumnSorted_Dashborad extends action_built_in.AutoAction{
ArrayList<String> listitems = new ArrayList<String>();
	
	public CheckDataProfileColumnSorted_Dashborad(int column_number, String sort_type) {
		
		int num = getMatchingXpathCount("//table[@class='GridView']//tr");
		
		for (int i = 2; i<num-1; i++)
		{
			String str1 = listitems.get(i);
			String str2 = listitems.get(i+1);
			
			if (sort_type.equalsIgnoreCase("ascending"))
			{
				if (str1.compareTo(str2)>0)
				{
					Assert.assertEquals("False", "true", "Data Profile list is not sorted in alphabetical ascending order!!!");
					return;
				}				
			}
			else if (sort_type.equalsIgnoreCase("descending"))
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
