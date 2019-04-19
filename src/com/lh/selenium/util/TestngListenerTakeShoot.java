package com.lh.selenium.util;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.lh.selenium.base.DriverBase;

public class TestngListenerTakeShoot extends TestListenerAdapter{
	 @Override
	  public void onTestSuccess(ITestResult tr) {
		 super.onTestSuccess(tr);;
	  }

	  @Override
	  public void onTestFailure(ITestResult tr ) {
		  super.onTestFailure(tr);                                                                                                                                                                                                                      
	  }

	  @Override
	  public void onTestSkipped(ITestResult tr) {
		  super.onTestSkipped(tr);
	  }

	  @Override
	  public void onTestFailedButWithinSuccessPercentage(ITestResult tr) {
		  super.onTestFailedButWithinSuccessPercentage(tr);
	  }

	  @Override
	  public void onStart(ITestContext testContext) {
		  super.onStart(testContext);
	  }

	  @Override
	  public void onFinish(ITestContext testContext) {
		  super.onFinish(testContext);
	  }

}
