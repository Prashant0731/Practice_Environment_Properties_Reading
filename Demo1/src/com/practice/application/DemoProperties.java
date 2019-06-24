package com.practice.application;

public class DemoProperties{
	
	public static final String firstName= "FIRST_NAME";
	public static final String lastName= "LAST_NAME";
		
	
	public static String getFirstName() throws Exception{
		return DemoApplication.getProperties().getProperty(firstName);
	}
	
	public static String getLastName() throws Exception{
		return DemoApplication.getProperties().getProperty(lastName);	
	}
}
