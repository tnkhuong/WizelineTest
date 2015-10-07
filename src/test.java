import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.LogConfig;
import dashboard.action.hla.AutoHLActions_Dashboard;


public class test extends AutoHLActions_Dashboard{

	public static void main(String[] args){
		 // Here we need to create logger instance so we need to pass Class name for
	     //which  we want to create log file in my case Google is classname
	         //Logger logger=Logger.getLogger("test");// Logger.getLogger(Google.class)
	        // configure log4j properties file
	      // PropertyConfigurator.configure("Log4j.properties");
		Logger thuong=logConfig("test");
		 // Open browser
        WebDriver driver = new FirefoxDriver();
        thuong.info("Browser Opened");
       // Set implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        thuong.info("Implicit wait given");
        // Load application
        driver.get("https://www.google.co.in/");
        thuong.info("Url opened");
        // type Selenium
        driver.findElement(By.name("q")).sendKeys("Selenium");
        thuong.info("keyword type");       
	}

}
