package com.lh.selenium.test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.lh.selenium.base.DriverBase;
import com.lh.selenium.base.SelectDriver;

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
		driver.get("http://www.baidu.com");
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

	public static void main(String[] args) {
		DriverBase d=new DriverBase("firefox");
		d.get("https://blog.csdn.net/u011541946/article/details/73865109");
		d.takeScreenShot();
		
	}

}
