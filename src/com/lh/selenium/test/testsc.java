package com.lh.selenium.test;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class testsc {
	private static Logger logger = Logger.getLogger(testsc.class);

	@Test
	public void tt() {
		logger.debug("sdsd");
	}
	public static void main(String[] args) {
		testsc a=new testsc();
		a.tt();
	}

}
