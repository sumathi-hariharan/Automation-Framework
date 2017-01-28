package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectRadioButtonExample {

	@Test
	public static void selectButton() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Sumathi/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("u_0_1")).sendKeys("Sumathi");
		driver.findElement(By.id("u_0_3")).sendKeys("Hariharan");
		driver.findElement(By.id("u_0_6")).sendKeys("sumathi@yahoo.com");
		driver.findElement(By.id("u_0_9")).sendKeys("sumathi@yahoo.com");
		driver.findElement(By.id("u_0_b")).sendKeys("sumathi");
		
		WebElement element = driver.findElement(By.id("month"));
		Select select = new Select(element);
		select.selectByIndex(2);
		
		 element = driver.findElement(By.id("day"));
		 select = new Select(element);
		 select.selectByValue("7");
		 
		 element = driver.findElement(By.id("year"));
		 select = new Select(element);
		 select.selectByValue("1976");
		 
		 List<WebElement> radioButtons = driver.findElements(By.cssSelector("._5k_2._5dba"));
		 for (WebElement elem : radioButtons) {
			 if (!elem.isSelected()) {
				 elem.click();
			 }
		 }
		 
		 Thread.sleep (5000);
		 
		 driver.close();
	}
	
	@Test
	public static void mulitpleSelectButton() {
		System.setProperty("webdriver.chrome.driver", "/Users/Sumathi/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		
	}
}
