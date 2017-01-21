package com.wbl.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import com.wbl.helper.ConfigUtils;
import com.wbl.helper.WebUIDriver;

public abstract class CommonTest {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		
		ConfigUtils config = new ConfigUtils("config.properties");
		
		driver = WebUIDriver.getDriver(config);
		
		driver.get(config.URL);
	}
	
	

}
