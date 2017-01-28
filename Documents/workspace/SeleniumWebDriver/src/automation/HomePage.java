package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	
	public List<WebElement> getSocialNetworkingelements() 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/Sumathi/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://whiteboxqa.com/");
		List <WebElement> list = driver.findElements (By.xpath(".//*[@class='container']/ul/li"));
		return list ;	
		
	}

	public WebElement getLoginLink ()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/Sumathi/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://whiteboxqa.com/");
		WebElement element = driver.findElement(By.id("loginButton"));
		return element;
		
	}
}
