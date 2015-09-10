package dashboard.action.hla;

import java.util.ArrayList;

public class GetDataProfileColumnValues_Dashboard extends action_built_in.AutoAction{
	public static ArrayList<String> listitems = new ArrayList<String>();
	public GetDataProfileColumnValues_Dashboard(int column_num)
	{
		int num = getMatchingXpathCount("//table[@class='GridView']//tr");
		for (int i = 2; i<num; i++)	
		{
			String item=getXpathValue("//table[@class='GridView']//tr[" + i + "]/td["+ column_num + "]");
			listitems.add(item);
		}
		System.out.println(listitems);
	}
}
