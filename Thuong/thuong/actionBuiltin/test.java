package thuong.actionBuiltin;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class test {
	public static int x1;
	public static int y1;
	
public test(WebDriver driver,By control)
{
	WebElement element=driver.findElement(control);
	Point location = element.getLocation();
	test.x1=location.x;
	test.y1=location.y;
	
}
}
