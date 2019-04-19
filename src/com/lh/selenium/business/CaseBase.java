package com.lh.selenium.business;

import com.lh.selenium.base.DriverBase;

public class CaseBase {
	
	public DriverBase InitDriver(String driver) {
		return new DriverBase(driver);
	}

}
