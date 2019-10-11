package demo.action.hla;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;

import demo.object_repository.GooglePage;

public class SearchGoogle extends action_built_in.AutoAction{

	static GooglePage googlepage = new GooglePage();
	
	public SearchGoogle(String value){
		enter(googlepage.search_textbox, value);
		enter(googlepage.search_textbox, Keys.ENTER);
		//click(googlepage.search_button);	
	}
}
