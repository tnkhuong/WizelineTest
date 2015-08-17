package testModule;
import java.util.concurrent.TimeUnit;

import object_repository.MainPage;
import object_repository.NewPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.MouseAction;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.MouseEventAt;

import actionHLA.AddPage;
import actionHLA.AutoHLActions;
import config.GlobalVariables;

public class Temp extends AutoHLActions{
	static MainPage mainpage = new MainPage();
	static NewPage newPage = new NewPage();
	static String displayAfter = "daa";
	static String parentPage = "";
	static String columnNumber = "2";
	static boolean publicOption = false;
	//static WebElement element=driver.findElement(By.id("ispublic"));
	static By pageName = By.linkText("Test");
	static By anotherPage = By.linkText("Another Test");
	static By element2= By.partialLinkText("newPage2");
	static By editPage_title = By.cssSelector("#div_popup h2");
	WebElement element=driver.findElement(pageName);
    
		
	//static By element3= By.cssSelector("By.linkText(\"newPage1\") + By.partialLinkText(\"newPage2\")");
	
	@Test
    public void main () throws Exception{
	  Navigate(GlobalVariables.glb_Browser,"http://localhost:54000/TADashboard/login.jsp");
	  LogIn("SampleRepository", "administrator", "");
	 // AddPage("Test");
	 // AddPage("Another","","","",true);
	  /*Click(pageName);
	  WaitForPage(20000);
	  Click(mainpage.setting_link);
	 
	  //driver.manage().timeouts().pageLoadTimeout(90,TimeUnit.SECONDS);
	  //mainpage.editPage_link.wait(20000);
	  //WaitForControl(mainpage.editPage_link, 20000);
	  Click(mainpage.editPage_link);
	  WaitForPage(20000);
	  CheckControlExist(editPage_title);
	  Set (newPage.public_checkbox,true);
	  Click(newPage.ok_button);
	  WaitForPage(20000);
	  
	  Click(anotherPage);
	  WaitForPage(20000);
	  Click(mainpage.setting_link);
	  Click(mainpage.editPage_link);
	  WaitForPage(20000);
	  CheckControlExist(editPage_title);
	  Set (newPage.public_checkbox,false);
	  Click(newPage.ok_button);
	  WaitForPage(20000);.*/
	  Click(mainpage.administrator_link);
	  Click(mainpage.logout_link);
		  
	  
	  
	  /*Click(mainpage.setting_link);
	  Click(mainpage.addPage_link);
	  WaitForControl(newPage.public_checkbox,20000);
	  Enter(newPage.pageName_textbox, "pageName3");
	 if(parentPage!=""){
		  SelectDropdown(newPage.parentPage_combobox, parentPage,"text");
	}
	 if (displayAfter!=""){
	  SelectDropdown(newPage.displayAfter_combobox, displayAfter, "text");
	 }
	 if (columnNumber!="2"){
	  SelectDropdown(newPage.columnNumber_combobox, columnNumber,"text");
	 }
	  /*Click(newPage.ok_button);
	 WebElement element=driver.findElement(By.id("ispublic"));
	  boolean isvalue = element.isSelected();
	  boolean value = true;
	  if ((!element.isSelected() && value==true)||(element.isSelected() && value==false))
	  {
	       element.click();
	  }
	  System.out.print(isvalue);
	  Click(control);*/
  }
}