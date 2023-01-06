package com.inetbanking.TestCases;

import org.testng.annotations.Test;

//import static org.testng.Assert.assertFalse;
//import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.inetbanking.PageObjects.LoginPage;
public class TC_01_logintest extends BaseClass {
	
	@Test
	public void loginTest() throws InterruptedException {
		driver.get(url);
//		logger.info("url is opened");
		LoginPage lp = new LoginPage(driver);
		lp.setusername(username);
//		logger.info("username entered");
		Thread.sleep(2000);
		lp.setpassword(password);
//		logger.info("password entered");
		Thread.sleep(2000);
		lp.loginbutton();
		Thread.sleep(2000);
//		logger.info("login test passed");
		String title = driver.getTitle();
		System.out.println(title);
	}

}
