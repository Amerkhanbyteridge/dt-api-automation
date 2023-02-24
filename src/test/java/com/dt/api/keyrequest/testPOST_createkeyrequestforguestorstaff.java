package com.dt.api.keyrequest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dt.api.baseclass.Baseclass;
import com.dt.api.main.Config;
import com.dt.api.main.ConfigAuth;
import com.dt.api.main.Endpoints;

import io.restassured.http.ContentType;

public class testPOST_createkeyrequestforguestorstaff extends Baseclass{

	@SuppressWarnings("unchecked")
	@BeforeClass
	public void init() throws FileNotFoundException, IOException {
		
		//request.put("userId", ConfigAuth.getuserId());
		//request.put("staffId", ConfigAuth.getstaffId());
		request.put("email", ConfigAuth.getemail());
		request.put("firstName", ConfigAuth.getfirstname());
		request.put("lastName", ConfigAuth.getlastname());
		 request.put("propertyId", ConfigAuth.getpropertyID());
		 request.put("type", ConfigAuth.gettype());
		 request.put("collectionIds", ConfigAuth.getcollectionIds());
		request.put("phone", ConfigAuth.getphone());
		request.put("requestKeyName", ConfigAuth.getrequestKeyName());
		request.put("startDate", ConfigAuth.getstartDate());
		request.put("startTime", ConfigAuth.getstartTime());
		request.put("endDate", ConfigAuth.getendDate());
		request.put("endTime", ConfigAuth.getendTime());
		request.put("neverExpires", false);
		request.put("usePhoneNumberAsKey", false);
		request.put("phoneNumberCountryCode", ConfigAuth.getphoneNumberCountryCode());
		
		
		logger.info(request.toJSONString());	
	}
	
	@Test
	public void testPost001() throws FileNotFoundException, IOException {
		given().header("Authorization", "bearer " + Config.getToken(), "accept", "application/json")
				.contentType(ContentType.JSON).body(request.toJSONString()).when().post(Endpoints.createkeyrequestforguestorstaff).then()
				.statusCode(201).log().all();

	}

}
