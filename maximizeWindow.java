package DemoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestS {
	public static void main(String args []) {
		
		WebDriver driver  = new FirefoxDriver();
		driver.get("http://rediffmail.com");
		
		//we want to maximize the window when it is opened
		driver.manage().window().maximize();
	}

}
