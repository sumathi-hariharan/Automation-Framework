package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firstautomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/Sumathi/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.Facebook.com");
		System.out.println(driver.getTitle());
		
	}

}
