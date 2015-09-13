package dashboard.action.hla;

import org.openqa.selenium.By;

public class CustomizedSortFieldsTable_Dashboard extends action_built_in.AutoAction {
	String xpath_control="";
	
	/**
	 * Description: this action is used to customize fields (e.g. remove, move up, or move down) in Sort Field table.
	 * @param list_field_name : list field name (each name separated by "|" character. E.g: Verion|Location)
	 * @param list_option : list option name (each name separated by "|" character. E.g: move up|move down)
	 * @return None
	 * @author Thuong Le
	 */
	public CustomizedSortFieldsTable_Dashboard(String list_field_name, String list_option)
	{
		String field_replace=list_field_name.replace("|", ",");
		String[] field_list=field_replace.split(",");
		String option_replace=list_option.replace("|", ",");
		String[] option_list=option_replace.split(",");
		for(int i=0; i<field_list.length; i++)
		{
			System.out.println(field_list[i]);
			System.out.println(option_list[i]);
			if(!field_list[i].isEmpty())
			{
				if(!option_list[i].isEmpty())
				{
					if(option_list[i].equalsIgnoreCase("move up"))
						xpath_control="//span[text()='" + field_list[i] + "']/parent::td/following-sibling::td/button[@alt='Move up']";
					else if(option_list[i].equalsIgnoreCase("move down"))
						xpath_control="//span[text()='" + field_list[i] + "']/parent::td/following-sibling::td/button[@alt='Move down']";
					else if(option_list[i].equalsIgnoreCase("remove "))
						xpath_control="//span[text()='" + field_list[i] + "']/parent::td/following-sibling::td/button[@alt='Remove']";
					else
						System.out.println("Your input option is incorrect!");		
					click(By.xpath(xpath_control));
				}
				else
					System.out.println("Not yet input option for " + field_list[i] + "!");
			}
			else
				System.out.println("Field name is empty!");
		}
	}
}
