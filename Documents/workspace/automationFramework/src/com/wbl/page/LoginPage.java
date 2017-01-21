package com.wbl.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	public class LoginPage extends PortalPage {

		public LoginPage(WebDriver driver) {
		super(driver);
		}
	public String login() {
		driver.findElement(By.id ("username")).sendKeys("Sumathi");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("login")).click();
		return driver.getTitle();
	}
	
	public int breadCrumbs() {
		return driver.findElements(By.cssSelector(".breadcrumbs-list li")).size();	
	}
	
	public boolean forgotPassword() {
		driver.findElement(By.id("forgotpassword")).click();
		return driver.findElement(By.id("email")).isDisplayed();
	}
	}
	


