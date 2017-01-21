package com.wbl.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebUIDriver {
	private static String LOCATION = System.getProperty("user.dir")+"\\resources\\drivers\\";
	public static WebDriver getDriver(ConfigUtils config){
		WebDriver driver = null;
		
		switch (config.BROWSER) {
		case "firefox":
			System.setProperty("webdriver.gecko.driver", LOCATION+ "geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "chrome":
			driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", LOCATION+ "chromedriver.exe");
			break;
		case "ie":
			driver = new InternetExplorerDriver();
			System.setProperty("webdriver.chrome.driver", LOCATION+ "IEDriverServer.exe");
			break;
		case "htmlunit":
			driver = new HtmlUnitDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			System.setProperty("webdriver.safari.driver", LOCATION+ "safaridriver.exe");
			break;
		case "opera":
			driver = new OperaDriver();
			System.setProperty("webdriver.opers.driver", LOCATION+ "operadriver.exe");
			break;
		default:
			driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", LOCATION+ "chromedriver.exe");
		
		}
		
		return driver;
		
	}
		
		
			
			

}
 