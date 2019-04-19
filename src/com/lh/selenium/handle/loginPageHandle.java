package com.lh.selenium.handle;

import com.lh.selenium.base.DriverBase;
import com.lh.selenium.page.LoginPage;

public class loginPageHandle {
	LoginPage lp;
	public loginPageHandle(DriverBase driver) {
		// TODO Auto-generated constructor stub
		lp = new LoginPage(driver);
	}
	/**
	 * 输入用户名
	 * */
	public void sendUserName(String username) {
		lp.sendkeys(lp.getNameInfoElement(), username);
	}
	/**
	 * 输入密码
	 * */
	public void sendPasswrod(String password) {
		lp.sendkeys(lp.getPasswordElement(), password);
	}
	/**
	 * 点击登录
	 * */
	public void submitLogin() {
		lp.click(lp.getLoginButtonElement());
	}
	
}
