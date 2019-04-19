package com.lh.selenium.util;

import org.openqa.selenium.By;

public class getByLocator {
	

	public static By getLocator(String key) {
		String projectPath=System.getProperty("user.dir");
		ProUtil pro = new ProUtil(projectPath+"\\resources\\element.properties");
		String value = pro.getKey(key);
		String[] values = value.split(">");
		String type = values[0];
		String word = values[1];
		if (type.equals("id")) {
			return By.id(word);
		} else if (type.equals("className")) {
			return By.className(word);
		} else if (type.equals("linkText")) {
			return By.linkText(word);
		} else if (type.equals("tagName")) {
			return By.tagName(word);
		} else if (type.equals("xpath")) {
			return By.xpath(word);
		} else if (type.equals("cssSelector")) {
			return By.cssSelector(word);
		} else if (type.equals("partialLinkText")) {
			return By.partialLinkText(word);
		} else {
			return null;
		}

	}

}
