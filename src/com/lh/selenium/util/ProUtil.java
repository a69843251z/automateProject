package com.lh.selenium.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class ProUtil {
	Properties pro;
	String proPath;
	public ProUtil(String path) {
		// TODO Auto-generated constructor stub
		proPath=path;
		this.pro=readProperites();
	}
	public Properties readProperites() {
		Properties properties=new Properties();
		try {
			InputStream inputsream=new FileInputStream(proPath);
			BufferedInputStream in=new BufferedInputStream(inputsream);
			try {
				properties.load(in);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties;
	}
	
	public String getKey(String key) {
		String value=pro.getProperty(key);
		if(value==null) {
			System.out.println("無此"+key+"值");
			return null;
		}else {
			return value;
		}
	}
	public static void main(String[] args) {
		ProUtil a=new ProUtil("D:\\myElipseProject\\automate\\resources\\fqzBasic.properties");
		System.out.println(a.getKey("sdsds"));
	}
	

}
