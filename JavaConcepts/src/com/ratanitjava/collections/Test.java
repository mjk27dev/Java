package com.ratanitjava.collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test {

	public static void main(String[] args) throws IOException {
		
		//load data from properties file
		
		FileInputStream fileInputStream = new FileInputStream("app.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);

		//read the data from properties file
		
		System.out.println(properties.getProperty("username"));
		System.out.println(properties.getProperty("password"));
	}

}
