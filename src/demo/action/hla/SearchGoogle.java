package demo.action.hla;

import demo.object_repository.GooglePage;

public class SearchGoogle extends action_built_in.AutoAction{

	static GooglePage googlepage = new GooglePage();
	
	public SearchGoogle(String value){
		enter(googlepage.search_textbox, value);
		click(googlepage.search_button);	
	}
}
