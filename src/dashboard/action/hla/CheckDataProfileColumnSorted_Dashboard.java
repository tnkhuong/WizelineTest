package dashboard.action.hla;
import org.testng.Assert;

public class CheckDataProfileColumnSorted_Dashboard extends action_built_in.AutoAction{
	/**
	 * Description: this action is used to check an expected column sorted
	 * @param column_number : Column number want to check sorted
	 * @param sort_type : sorted type E.g. ascending OR descending
	 * @return listitems : list containing all values of the input column
	 * @author Thuong Le
	 */
	public CheckDataProfileColumnSorted_Dashboard(int column_number, String sort_type) {
		new GetDataProfileColumnValues_Dashboard(column_number);
		int num = GetDataProfileColumnValues_Dashboard.listitems.size();
		System.out.println(num);
		for (int i = 0; i<num-1; i++)
		{
			String str1 = GetDataProfileColumnValues_Dashboard.listitems.get(i);
			System.out.println(str1);
			String str2 = GetDataProfileColumnValues_Dashboard.listitems.get(i+1);
			System.out.println(str2);
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
		Assert.assertEquals(true, true, "Data Profile list is sorted in alphabetical "+ sort_type +" order!!!");		
	}
}
