package com.dt.api.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import org.json.simple.JSONObject;

public class Config {

	// Using Config to set key and value in config.properties
	@SuppressWarnings("unchecked")
	public Config(String key, String value) throws FileNotFoundException, IOException {


		String propertyFilePath = System.getProperty("user.dir")+
				"\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(propertyFilePath);
		prop.load(input);
		input.close();
		OutputStream output = new FileOutputStream(propertyFilePath);
		prop.put(key, value);
		//prop.setProperty("token", value);
		prop.store(output, null);
		output.close();
		System.out.println("value--"+value);

	}

	@SuppressWarnings("unchecked")
	public static String getToken() throws FileNotFoundException, IOException {



		String propertyFilePath = System.getProperty("user.dir")+
				"\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(propertyFilePath);
		prop.load(input);
		String token = prop.getProperty("token"); 
		
		return token;
	}

	public static String getemailID() throws FileNotFoundException, IOException {



		String propertyFilePath = System.getProperty("user.dir")+
				"\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String emailID = prop.getProperty("emailID"); 
		return emailID;
	}

	public static String getPassword() throws FileNotFoundException, IOException {



		String propertyFilePath = System.getProperty("user.dir")+
				"\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String password = prop.getProperty("password"); 
		return password;
	}

}
