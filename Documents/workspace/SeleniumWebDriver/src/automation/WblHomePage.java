package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WblHomePage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/Sumathi/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://whiteboxqa.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("loginButton")).click();
		System.out.println("CurrentURL : " + driver.getCurrentUrl());
		System.out.println("PageSource :" + driver.getPageSource());
		System.out.println("Title :" + driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("Sumathi");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("login")).submit();
		Thread.sleep (5000);
		driver.close();
	}

}

