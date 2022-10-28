package com.dt.api.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class Config {

	@SuppressWarnings("unchecked")
	public Config(String key, String value) throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

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

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(propertyFilePath);
		prop.load(input);
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

	public static String getname() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String name = prop.getProperty("name");
		return name;
	}

	public static String getpropertyTypeId() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String propertyTypeId = prop.getProperty("propertyTypeId");
		return propertyTypeId;
	}

	public static String getapartment() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String apartment = prop.getProperty("apartment");
		return apartment;
	}

	public static String getcity() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String city = prop.getProperty("city");
		return city;
	}

	public static String getstate() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String state = prop.getProperty("state");
		return state;
	}

	public static String getcountry() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String country = prop.getProperty("country");
		return country;
	}

	public static String getstreet() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String street = prop.getProperty("street");
		return street;
	}

	public static String getzipCode() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String zipCode = prop.getProperty("zipCode");
		return zipCode;
	}

	public static String getlatitude() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String latitude = prop.getProperty("latitude");
		return latitude;
	}

	public static String getlongitude() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String longitude = prop.getProperty("longitude");
		return longitude;
	}

	public static String getroleIds() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String roleIds = prop.getProperty("roleIds");
		return roleIds;
	}

	public static String getID() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String id = prop.getProperty("id");
		return id;
	}
	public static String getzoneID() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String zoneId = prop.getProperty("zoneId");
		return zoneId;
	}
	
	public static String getzonetypeId() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String zoneTypeId = prop.getProperty("zoneTypeId");
		return zoneTypeId;
	}
	public static String getparentId() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String parentId = prop.getProperty("parentId");
		return parentId;
	}
	
	public static String gettypeId() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String typeId = prop.getProperty("typeId");
		return typeId;
	}
	public static String getdeviceID() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String deviceID = prop.getProperty("deviceId");
		return deviceID;
	}
	public static String getdevices() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String devices = prop.getProperty("devices");
		return devices;
	}
	public static String getmoveToZoneId() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String moveToZoneId = prop.getProperty("moveToZoneId");
		return moveToZoneId;
	}
	public static String getaction() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String action = prop.getProperty("action");
		return action;
	}
	
	public static String getprotocolId() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String protocolId = prop.getProperty("protocolId");
		return protocolId;
	}
	public static String getdevicehudID() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String id = prop.getProperty("devicehubID");
		return id;
	}
	public static String getroleType() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String roletype = prop.getProperty("roletype");
		return roletype;
	}
}
