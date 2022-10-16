package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.BaseTestClass;
import pageObjects.LoginPage;

public class launchURL extends BaseTestClass{
	
	public LoginPage lp;
	
	public launchURL() {
		super();
	}
	
	@Test
	public void urlTest() {
		initializeBrowser();
		lp = new LoginPage(driver);
		
		Assert.assertEquals(lp.pageTitle(), "Swag Labs");
		
		//lp.EnterUserName("standard_user");
		lp.enterUser("standard_user");
		lp.enterpasswrd("secret_sauce");
		lp.clickLogin();
	}

}
