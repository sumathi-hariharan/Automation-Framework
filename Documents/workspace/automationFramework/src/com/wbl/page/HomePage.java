package com.wbl.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PortalPage {

	public HomePage(WebDriver driver) {
		super(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public int countSlides() {
		return driver.findElements(By.cssSelector(".slides li")).size();
	}
	
	public void loginClick () {
		driver.findElement(By.linkText("Login")).click();
	}
	public boolean sectionHeaders() {
		return driver.findElement(By.cssSelector(".section-heading .line")).isDisplayed();
	}
	
	public boolean videoElement(){
		return driver.findElement(By.cssSelector("#vid_1")).isEnabled();
	}
}
