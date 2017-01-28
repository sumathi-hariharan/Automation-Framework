package automation;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Sumathi/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://whiteboxqa.com/");
		WebElement loginBtn = driver.findElement(By.id("loginButton"));
		loginBtn.click();
		WebElement user = driver.findElement(By.name("uname"));
		user.sendKeys("sumathi.hariharan");
		WebElement pwd = driver.findElement(By.name("pwd"));
		pwd.sendKeys("suma");
		
		
	}

}
