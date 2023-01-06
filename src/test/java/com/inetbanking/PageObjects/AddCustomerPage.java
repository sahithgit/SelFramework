package com.inetbanking.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCustomerPage {
	WebDriver driver;
	public AddCustomerPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		
	}
	By AddCustomerbutton = By.xpath("//a[@href='addcustomerpage.php']");
	By Customername = By.xpath("//input[@name = 'name']");
	By dob = By.xpath("//input[@id='dob']");
	By Address = By.xpath("//*[@name='addr']");
	By city = By.xpath("//input[@name='city']");
	By state = By.xpath("//input[@name='state']");
	By pin = By.xpath("//input[@name='pinno']");
	By mobileno = By.xpath("//input[@name='telephoneno']");
	By email = By.xpath("//input[@name='emailid']");
	By password = By.xpath("//input[@name='password']");
	By submitbutton = By.xpath("//input[@name='sub']");

	public void setAddCustomerbutton() {
		driver.findElement(AddCustomerbutton).click();
		
	}
	public void setCustomername(String customername) {
		driver.findElement(Customername).sendKeys(customername);
		
	}
	public void setDob(String dobs) {
		driver.findElement(dob).sendKeys(dobs);
	}
	public void setAddress(String addr) {
		driver.findElement(Address).sendKeys(addr);
		
	}
	public void setCity(String c) {
		driver.findElement(city).sendKeys(c);
		
	}
	public void setState(String s) {
		driver.findElement(state).sendKeys(s);
	}
	public void setPin(String p) {
		driver.findElement(pin).sendKeys(p);
		
	}
	public void setMobileno(String mob) {
		driver.findElement(mobileno).sendKeys(mob);
		
	}
	public void setEmail(String e) {
		driver.findElement(email).sendKeys(e);
		
	}
	public void setPassword(String p) {
		driver.findElement(password).sendKeys(p);
		
	}
	public void setSubmitbutton() {
		driver.findElement(submitbutton).click();
		
	}
	
	
}
