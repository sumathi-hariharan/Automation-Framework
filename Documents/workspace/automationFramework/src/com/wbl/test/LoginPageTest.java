package com.wbl.test;

import org.junit.Test;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;

import com.wbl.common.CommonTest;
import com.wbl.page.LoginPage;
import com.wbl.pageflow.LoginPageFlow;

public class LoginPageTest extends CommonTest{
	LoginPage lp;
	
	@BeforeClass
	public void beforeClass() {
		lp = new LoginPage(driver);
		LoginPageFlow.goToLogin(driver);
		
	}
	
	@Test
	public void testLogin() {
		assertEquals("QA/QE/SDET Training.", lp.login());
	}
	
	@Test
	public void testBreadCrumbs() {
		assertEquals(3, lp.breadCrumbs());
	}
	
	@Test
	public void testForgotPassword() {
		assertTrue(lp.forgotPassword());
	}
	
}
