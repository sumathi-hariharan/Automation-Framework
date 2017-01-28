package automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/Sumathi/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://whiteboxqa.com/");
		
		driver.findElement(By.id("headerfblogin")).click();
		
		String currentWindowName = driver.getWindowHandle(); // To get the current window
		System.out.println("Current window name:" +currentWindowName );
		
		Set<String> windows = driver.getWindowHandles(); // To get all the windows
		System.out.println("Count of Windows:" + windows.size()); // 
		
		for (String win:windows) {   // Iterating to get the child window
			System.out.println("Current window:" + win);
			if (!win.equals (currentWindowName));{  //ensure switching to child window
				driver.switchTo().window(win);
			}
		}
		driver.findElement(By.name("email")).sendKeys("sumathi");
		driver.findElement(By.name("pass")).sendKeys("123");
		
		Thread.sleep(5000);
		driver.close(); //closes child window only whereas driver.quit() closes both parent and child window
	}

}
