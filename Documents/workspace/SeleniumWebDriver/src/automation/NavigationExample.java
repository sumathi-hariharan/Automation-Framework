package automation;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationExample {

	
		@Test
		public static void navigate () throws InterruptedException 
		
		{
		System.setProperty("webdriver.chrome.driver", "/Users/Sumathi/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://dev.talentscreen.io/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Subjects")).click();
		WebElement element = driver.findElement(By.cssSelector(".text-display-1.margin-none"));
		System.out.println("Header info" + element.getText());
		
		driver.navigate().back();;
		Thread.sleep(5000);
		driver.navigate().forward();;
		Thread.sleep(5000);
		element = driver.findElement(By.className("tslogo"));
		assertTrue(element.isDisplayed());
		assertEquals(4,driver.findElements(By.xpath("//*[@title='Date']")).size());
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		
		
	}
		
	
	}


