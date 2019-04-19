package com.lh.selenium.page;

import org.openqa.selenium.WebElement;

import com.lh.selenium.base.DriverBase;
import com.lh.selenium.util.getByLocator;

public class LoginPage extends BasePage{
	public LoginPage(DriverBase driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	public WebElement getUserElement() {
		return driver.findElement(getByLocator.getLocator("username"));	
	}
	public WebElement getPasswordElement() {
		return driver.findElement(getByLocator.getLocator("userpass"));	
	}
	public WebElement getLoginButtonElement() {
		return driver.findElement(getByLocator.getLocator("loginbutton"));	
	}
	public WebElement getAutoSigninElement() {
		return driver.findElement(getByLocator.getLocator("autoSignin"));	
	}
	public WebElement getNameInfoElement() {
		return driver.findElement(getByLocator.getLocator("nameInfo"));	
	}


}
