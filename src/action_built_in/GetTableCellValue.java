package action_built_in;

public class GetTableCellValue {

	public GetTableCellValue() {
		String data_you_want_to_check = "your data in here";
		boolean check_data_existed = false;
		WebDriver driver = new ChromeDriver();

		driver.get("yoururl");

		//you can find table by xpath or some option ,depend on your site.
		WebElement table = driver.findElement(By.id('yourTableID'));
		//get all tr inside table
		List<WebElement> tr_table = table.findElements(By.tagName("tr"));
		//now we will loop
		for(WebElement el : tr_table){
		  List<WebElement> td_table = tr_table.findElements(By.tagName("td"));
		  for(WebElement elm : td_table){
		      String text_inside_td = elm.getText();
		      if(text_inside_td.equalsIgnoreCase(data_you_want_to_check)){
		          check_data_existed = true;
		          break;
		      }
		  }
		}
	}

}
