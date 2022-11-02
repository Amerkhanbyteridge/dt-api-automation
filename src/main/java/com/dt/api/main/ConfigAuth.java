package com.dt.api.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class ConfigAuth {
	
	@SuppressWarnings("unchecked")
	public ConfigAuth(String key, String value) throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(propertyFilePath);
		
		prop.load(input);
		input.close();
		OutputStream output = new FileOutputStream(propertyFilePath);
		prop.put(key, value);
		// prop.setProperty("token", value);
		prop.store(output, null);
		output.close();
		System.out.println("value--" + value);

	}


	
	public static String getToken() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(propertyFilePath);
		prop.load(input);
		String token = prop.getProperty("token");

		return token;
	}
	
	public static String getToken2() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(propertyFilePath);
		prop.load(input);
		String token2 = prop.getProperty("token2");

		return token2;
	}
	
	
	
	public static String getemailID() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String emailID = prop.getProperty("emailID");
		return emailID;
	}

	public static String getPassword() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String password = prop.getProperty("password");
		return password;
	}
	public static String getemail() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String emailID = prop.getProperty("emailID");
		return emailID;
	}
	public static String getfirstname() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String firstname = prop.getProperty("firstname");
		return firstname;
	}

	public static String getlastname() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String lastname = prop.getProperty("lastname");
		return lastname;
	}
	public static String getpropertyID() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String propertyId = prop.getProperty("propertyId");
		return propertyId;
	}
	public static String getroleID() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String roleId = prop.getProperty("roleId");
		return roleId;
	}
	
	public static String getphonenumber() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

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
