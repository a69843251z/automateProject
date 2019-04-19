package com.lh.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SelectDriver {
	String projectPath=System.getProperty("user.dir");
	public WebDriver DriverName(String DriverName) {
		if(DriverName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+"\\resources\\geckodriver.exe");
			System.setProperty("webdriver.firefox.bin","D:\\computerSoftware\\firefoxExplore\\firefox.exe");
			return new FirefoxDriver();
		}else if(DriverName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", projectPath+"/resources/chromedriver.exe");
			return new ChromeDriver();
		}else {
			System.setProperty("webdriver.ie.driver", "D:\\myElipseProject\\automate\\resources\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
	}

}
