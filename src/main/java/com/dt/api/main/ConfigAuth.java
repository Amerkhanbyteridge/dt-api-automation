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

	public static String getemailID1() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String emailID1 = prop.getProperty("emailID1");
		return emailID1;
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
		String email = prop.getProperty("email");
		return email;
	}
	
	public static String getemail1() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String email1 = prop.getProperty("email1");
		return email1;
	}
	
	public static String getemail2() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String email2 = prop.getProperty("email2");
		return email2;
	}
	
	public static String getfirstname() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

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
	public static String getpropertyID1() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String propertyId1 = prop.getProperty("propertyId1");
		return propertyId1;
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

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String image = prop.getProperty("imageurl");
		return image;
	}
	
	public static String getotp() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String otp = prop.getProperty("otp");
		return otp;
	}
	
	public static String getapartment() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String apartment = prop.getProperty("apartment");
		return apartment;
	}

	public static String getcity() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String city = prop.getProperty("city");
		return city;
	}

	public static String getstate() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String state = prop.getProperty("state");
		return state;
	}

	public static String getcountry() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String country = prop.getProperty("country");
		return country;
	}

	public static String getstreet() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String street = prop.getProperty("street");
		return street;
	}

	public static String getzipCode() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String zipCode = prop.getProperty("zipCode");
		return zipCode;
	}

	public static String getlatitude() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String latitude = prop.getProperty("latitude");
		return latitude;
	}

	public static String getlongitude() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String longitude = prop.getProperty("longitude");
		return longitude;
	}
	public static String getname() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String name = prop.getProperty("name");
		return name;
	}

	public static String getpropertyTypeId() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String propertyTypeId = prop.getProperty("propertyTypeId");
		return propertyTypeId;
	}
	
	public static String getzoneTypeId() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String zoneTypeId = prop.getProperty("zoneTypeId");
		return zoneTypeId;
	}
	
	public static String getroleIds() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String roleIds = prop.getProperty("roleIds");
		return roleIds;
	}
	
	public static String getroleId() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String roleId = prop.getProperty("roleId");
		return roleId;
	}
	public static String getdeviceID() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String deviceID = prop.getProperty("deviceId");
		return deviceID;
	}
	
	
	public static String getdeviceIDs() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String deviceIDs = prop.getProperty("deviceIds");
		return deviceIDs;
	}
	public static String getdevices() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String devices = prop.getProperty("devices");
		return devices;
	}
	public static String getmoveToZoneId() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String moveToZoneId = prop.getProperty("moveToZoneId");
		return moveToZoneId;
	}
	public static String getaction() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String action = prop.getProperty("action");
		return action;
	}
	
	public static String getprotocolId() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String protocolId = prop.getProperty("protocolId");
		return protocolId;
	}

	public static String getpat() throws FileNotFoundException, IOException {

	
		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));

		String pat = prop.getProperty("pat");
		return pat;
	}
	
	public static String getnewPat() throws FileNotFoundException, IOException {

		
		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));

		String newPat = prop.getProperty("newPat");
		return newPat;
	}
	public static String getdevicehudID() throws FileNotFoundException, IOException {


		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));

		String devicehudID = prop.getProperty("devicehudID");
		return devicehudID;}
	
	
	public static String gettokenname() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String tokenname = prop.getProperty("tokenname");
		return tokenname;
	}
	public static String getisActive() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String isActive = prop.getProperty("isActive");
		return isActive;
	}
	public static String gettype() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String type = prop.getProperty("type");
		return type;
	}
	public static String getkeyId() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String keyId = prop.getProperty("keyId");
		return keyId;
	}
	
	public static String getkeyId1() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String keyId1 = prop.getProperty("keyId1");
		return keyId1;
	}
	
	public static String getsendToLock() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String sendToLock = prop.getProperty("sendToLock");
		return sendToLock;
	}
	public static String getsendToGuest() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String sendToGuest = prop.getProperty("sendToGuest");
		return sendToGuest;	
}
	public static String gettypes() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String types = prop.getProperty("types");
		return types;
	}
	public static String getcollectionIds() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String collectionIds = prop.getProperty("collectionIds");
		return collectionIds;
	}
	public static String getrequestKeyName() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String requestKeyName = prop.getProperty("requestKeyName");
		return requestKeyName;
	}
	public static String getstartDate() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String startDate = prop.getProperty("startDate");
		return startDate;
	}
	public static String getstartTime() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String startTime = prop.getProperty("startTime");
		return startTime;
	}
	public static String getendDate() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String endDate = prop.getProperty("endDate");
		return endDate;
	}
	public static String getendTime() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String endTime = prop.getProperty("endTime");
		return endTime;
	}
	public static String getneverExpires() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String neverExpires= prop.getProperty("neverExpires");
		return neverExpires;
	}
	public static String getusePhoneNumberAsKey() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String usePhoneNumberAsKey= prop.getProperty("usePhoneNumberAsKey");
		return usePhoneNumberAsKey;
	}
	
	public static String getphone() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String phone= prop.getProperty("phone");
		return phone;
	}
	public static String getparentId() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String parentId = prop.getProperty("parentId");
		return parentId;
	}
	public static String gettypeId() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String typeId = prop.getProperty("typeId");
		return typeId;
	}
	
	public static String getkeyIDs() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String keyIDs = prop.getProperty("keyIDs");
		return keyIDs;
	}
	
	public static String getid() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String id = prop.getProperty("id");
		return id;
	}
	public static String getzoneID() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String zoneId = prop.getProperty("zoneId");
		return zoneId;
	}
	
	
	public static String getzoneID1() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String zoneId1 = prop.getProperty("zoneId1");
		return zoneId1;
	}
	public static String getzonename() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String zonename = prop.getProperty("zonename");
		return zonename;
	}
	 
	
	
	
	
	public static String getcloudEmailId() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String cloudEmailId = prop.getProperty("cloudEmailId");
		return cloudEmailId;
	}

	public static String gettimezone() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String timezone = prop.getProperty("timezone");
		return timezone;
	}

	public static String getphoneNumberCountryCode() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String phoneNumberCountryCode = prop.getProperty("phoneNumberCountryCode");
		return phoneNumberCountryCode;
	}
	
	public static String getuserId() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String userId = prop.getProperty("userId");
		return userId;
	}
	public static String getstaffId() throws FileNotFoundException, IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\ConfigAuth.properties";

		Properties prop = new Properties();
		prop.load(new FileInputStream(propertyFilePath));
		String staffId = prop.getProperty("staffId");
		return staffId;
	}



	





	

	
}	

