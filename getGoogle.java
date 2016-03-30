package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateToGoogle {
	private static WebDriver driver;

	public static void main(String[] args) {
	driver = new FirefoxDriver();
	driver.get("http://google.com");
	
	}
}
