package config;

import object_repository.LoginPage;
import object_repository.MainPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import config.GlobalVariables;

public class Init {
     public static WebDriver driver;
     public static WebDriver Navigate (String browser,String url) throws Exception{
		 
	       //Check if parameter passed from TestNG is 'firefox'
	        if(browser.equalsIgnoreCase("firefox")){
	        //create firefox instance
	          driver= new FirefoxDriver();
	          driver.get(url);
	  		  driver.manage().window().maximize();
	        }
	        //Check if parameter passed as 'chrome'
	        else if(browser.equalsIgnoreCase("chrome")){
	            //set path to chromedriver.exe You may need to download it from http://code.google.com/p/selenium/wiki/ChromeDriver
	            System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	            //create chrome instance
	           driver= new ChromeDriver();
	         }
	 
	        else if(browser.equalsIgnoreCase("ie")){
	        //set path to IEdriver.exe You may need to download it from
	        // 32 bits http://selenium-release.storage.googleapis.com/2.42/IEDriverServer_Win32_2.42.0.zip
	        // 64 bits http://selenium-release.storage.googleapis.com/2.42/IEDriverServer_x64_2.42.0.zip
	            System.setProperty("webdriver.ie.driver","C:\\IEdriver.exe");
	       //create chrome instance
	            driver= new InternetExplorerDriver();
	        }
	        else{
	            //If no browser passed throw exception
	            throw new Exception("Browser is not correct");
	        }
	        return driver;
	    }
}
