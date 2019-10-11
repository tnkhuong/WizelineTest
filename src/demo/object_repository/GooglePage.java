package demo.object_repository;

import org.openqa.selenium.By;

public class GooglePage {
	//public By search_textbox=By.name("q");	
	public By search_textbox=By.xpath("//input[@class = 'gLFyf gsfi']");
	
	public By search_button=By.className("lsb");
	//public By selenium_link=By.linkText("Selenium - Web Browser Automation");
	public By selenium_link=By.xpath("//*[@id='rso']/div/div/div[1]/div/div/div[1]/a[1]/h3");
}
