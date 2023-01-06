package com.inetbanking.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	By username = By.xpath("//input[@name ='uid']");
	By password = By.xpath("//input[@name ='password']");
	By loginbutton = By.xpath("//input[@name ='btnLogin']");
	
	public void setusername(String u) {
		driver.findElement(username).sendKeys(u);
	}
	public void setpassword(String p) {
		driver.findElement(password).sendKeys(p);
	}
	public void loginbutton() {
		driver.findElement(loginbutton).click();
	}
}
