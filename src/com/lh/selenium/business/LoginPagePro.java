package com.lh.selenium.business;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lh.selenium.base.DriverBase;
import com.lh.selenium.handle.loginPageHandle;

public class LoginPagePro extends CaseBase{
	
	 loginPageHandle lp;
	 DriverBase driver;
	 @BeforeClass
	 public void beforeClass() {
		 driver=InitDriver("firefox");
		 lp=new loginPageHandle(driver);
		 driver.get("http://106.39.94.231:9080/sinoiaaf/");
	 }
	 @Test
	 public void testLogin() {
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 lp.sendPasswrod("hz51512242whd");
		 lp.sendUserName("390589484@qq.com");
		 lp.submitLogin();
	 }
	 @AfterClass
	 public void afterClass() {
		
	 }

}
