package config;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class LogConfig {

	public static Logger logger;
	public LogConfig(String class_name)
	{
		//which  we want to create log file in my case Google is classname
		 logger=Logger.getLogger(class_name);
		 PropertyConfigurator.configure("Log4j.properties");
	}
}
