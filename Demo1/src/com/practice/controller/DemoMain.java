package com.practice.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.practice.application.DemoApplication;
import com.practice.application.DemoProperties;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("ConfigSuffix : "+System.getProperty("ConfigSuffix"));
		//System.out.println(DemoApplication.getConfigSuffix());
		try {
			System.out.println("First Name : "+DemoProperties.getFirstName());
			System.out.println("Last Name : "+DemoProperties.getLastName());
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
}
