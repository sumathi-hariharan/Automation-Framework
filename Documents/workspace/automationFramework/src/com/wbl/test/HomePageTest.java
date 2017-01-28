package com.wbl.test;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

//import org.junit.Test;
import org.testng.annotations.BeforeClass;

import com.wbl.common.CommonTest;
import com.wbl.page.HomePage;

public class HomePageTest extends CommonTest{

	HomePage hm;
	
	@BeforeClass
	public void beforeClass() {
		hm = new HomePage(driver);
	}
	
	@Test
	public void testslides(){
		assertEquals(6,hm.countSlides());
	}
	
	@Test
	public void testVideo(){
		assertTrue(hm.videoElement());
	}
	
}
