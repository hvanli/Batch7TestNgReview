package com.review.class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class Login extends CommonMethods{

	@BeforeMethod
	public void openBrowser() {
		setUp("chrome", ORANGE_HMR_URL);
	}
	
	@Test
	public void loginValitation() {
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
