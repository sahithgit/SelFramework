package com.inetbanking.TestCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.inetbanking.PageObjects.AddCustomerPage;
import com.inetbanking.PageObjects.LoginPage;
import com.inetbanking.TestCases.TC_01_logintest;

public class TC_02_AddCustomertest extends BaseClass{
	public String customername = "sahith";
	public String dob = "04-12-1997";
	public String address = "Hyderabad";
	public String city = "Hyderabad";
	public String state = "Hyderabad";
	public String pin = "501511";
	public String mobno = "9696966966";
//	public String email = "sahith1@gmail.com";
	public String pp = "Sahith";
	
	@Test
	public void addcustomertest() throws InterruptedException {

		driver.get(url);
		LoginPage lp = new LoginPage(driver);
		lp.setusername(username);	
		Thread.sleep(2000);
		lp.setpassword(password);
		Thread.sleep(2000);
		lp.loginbutton();
		Thread.sleep(2000);
		
		AddCustomerPage ad = new AddCustomerPage(driver);
		ad.setAddCustomerbutton();
		Thread.sleep(2000);
		ad.setCustomername(customername);
		Thread.sleep(2000);
		ad.setDob(dob);
		Thread.sleep(2000);
		ad.setAddress(address);
		Thread.sleep(2000);
		ad.setCity(city);
		Thread.sleep(2000);
		ad.setState(state);
		Thread.sleep(2000);
		ad.setPin(pin);
		Thread.sleep(2000);
		ad.setMobileno(mobno);
		Thread.sleep(2000);
		String email = randomString()+"@gmail.com";
		ad.setEmail(email);
		Thread.sleep(2000);
		ad.setPassword(pp);
		Thread.sleep(2000);
		ad.setSubmitbutton();
		String msg = driver.findElement(By.xpath("//p[@class ='heading3']")).getText();
		System.out.println(msg);
		
		
		
	}
	public String randomString() {
		String gen = RandomStringUtils.randomAlphabetic(8);
		return gen;
		
	}

}
