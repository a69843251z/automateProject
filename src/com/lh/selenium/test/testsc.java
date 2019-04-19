package com.lh.selenium.test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.lh.selenium.base.DriverBase;
import com.lh.selenium.base.SelectDriver;
import com.lh.selenium.util.getByLocator;

public class testsc {
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "D:\\myElipseProject\\automate\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.baidu.com");
		driver.close();
	}
	@Test
	public void test2() {
		String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);
	}
	@Test
	public void test3() {
		System.setProperty("webdriver.gecko.driver", "D:\\myElipseProject\\automate\\resources\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin","D:\\computerSoftware\\firefoxExplore\\firefox.exe");
		WebDriver driver= new FirefoxDriver();
		DriverBase a=new DriverBase("firefox");
		driver.get("http://www.baidu.com");
		a.takeScreenShot();
		driver.findElement(By.id("123")).sendKeys("123");
		
		
		driver.close();
	}
	@Test
	public void test4() {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		Calendar cal=Calendar.getInstance();
		Date date=cal.getTime();
		String dataStr=sf.format(date);
		String path=this.getClass().getSimpleName()+"_"+dataStr+".png";
	}
	
	@Test
	public void test5() {
		 throw new RuntimeException("123");
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\myElipseProject\\automate\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://106.39.94.231:9080/sinoiaaf/");
		By by_password=getByLocator.getLocator("password");
		driver.findElement(by_password).sendKeys("123");

	}

}
