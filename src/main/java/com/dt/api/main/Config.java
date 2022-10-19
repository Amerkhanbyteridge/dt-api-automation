package com.dt.api.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;

public class Config {

	
	@SuppressWarnings("unchecked")
	public Config(String name, String value) throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		prop.setProperty(name, value);

	}

	@SuppressWarnings("unchecked")
	public static String getToken() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String token = prop.getProperty("token");
		return token;
	}

	public static String getemailID() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String emailID = prop.getProperty("emailID");
		return emailID;
	}

	public static String getPassword() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String password = prop.getProperty("password");
		return password;
	}

	public static String getroleID() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String roleId = prop.getProperty("roleId");
		return roleId;
	}

	public static String getpropertyID() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String propertyId = prop.getProperty("propertyId");
		return propertyId;
	}

	public static String getfirstname() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String firstname = prop.getProperty("firstname");
		return firstname;
	}

	public static String getlastname() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String lastname = prop.getProperty("lastname");
		return lastname;
	}

	public static String getotp() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String otp = prop.getProperty("otp");
		return otp;
	}

	public static String getphonenumber() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String phonenumber = prop.getProperty("phonenumber");
		return phonenumber;
	}

	public static String getimage() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String image = prop.getProperty("imageurl");
		return image;
	}

}
