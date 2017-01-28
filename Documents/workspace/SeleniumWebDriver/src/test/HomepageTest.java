package test;

import java.util.List;
import static org.testng.Assert.*;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automation.HomePage;

public class HomepageTest {
	
	HomePage hm = new HomePage();
	
	@Test
	public void verifySocialLinks () {
		List <WebElement> list = hm.getSocialNetworkingelements();
		System.out.println("List of Elements: " + list.size());
		assertEquals (4, list.size());	
	}
	
	@Test
	public void verifyLoginLink () {
		WebElement element = hm.getLoginLink();
		element.click();
		
	}
	
}
