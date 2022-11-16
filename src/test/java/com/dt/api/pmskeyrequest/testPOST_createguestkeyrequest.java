package com.dt.api.pmskeyrequest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dt.api.baseclass.Baseclass;
import com.dt.api.main.Config;
import com.dt.api.main.Endpoints;

import io.restassured.http.ContentType;

public class testPOST_createguestkeyrequest extends Baseclass {


	@SuppressWarnings("unchecked")
	@BeforeClass
	public void init() throws FileNotFoundException, IOException {
		request = new JSONObject();
		request.put("propertyId", Config.getpropertyID());
		request.put("type", Config.gettype());
		request.put("firstName", Config.getfirstname());
		request.put("lastName", Config.getlastname());
		request.put("email", Config.getemailID());
		request.put("phone", Config.getphonenumber());
		request.put("collectionIds", Config.getcollectionIds());
		request.put("startDate", Config.getstartdate());
		request.put("endDate", Config.getenddate());
		request.put("pmsId", Config.getpmsID());
		request.put("neverExpires", true);
		logger.info(request.toJSONString());	
	}
	
	@Test
	public void testPost001() throws FileNotFoundException, IOException {
		given().header("Authorization", "bearer " + Config.getToken(), "accept", "application/json")
				.contentType(ContentType.JSON).body(request.toJSONString()).when().post(Endpoints.createguestkeyrequest).then()
				.statusCode(201).log().all();

	}
}
