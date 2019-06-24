package com.practice.application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.practice.literals.DemoLiterals;

public class DemoApplication {

	public static String getConfigSuffix() {
		return System.getProperty("ConfigSuffix");
	}
	
	public static Properties getProperties() throws FileNotFoundException,IOException {
		InputStream input= new FileInputStream("src/config/"+DemoLiterals.applicationName+getConfigSuffix()+".properties");
		Properties prop = new Properties();
		prop.load(input);
		return prop;
	}
}