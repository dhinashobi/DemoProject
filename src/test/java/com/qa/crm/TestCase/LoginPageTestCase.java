package com.qa.crm.TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.TestBase.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginPageTestCase extends TestBase {
	public static LoginPage loginpage;
	public static HomePage homepage;
	

	public LoginPageTestCase() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		 loginpage = new LoginPage(); 
	}
	
	@Test(priority=1)
	public void LoginPageTitleTestCase() {
		String title = loginpage.vaildateLoginpageTitle();
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	
	@Test(priority=2)
	public void crmImageTest() {
		boolean flag = loginpage.validateCRMImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest() {
		homepage = loginpage.validLogin(prop.getProperty("username"), prop.getProperty("password"));		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
