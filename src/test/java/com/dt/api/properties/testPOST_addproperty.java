package com.dt.api.properties;

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

public class testPOST_addproperty extends Baseclass {

	@SuppressWarnings("unchecked")
	@BeforeClass
	public void init() throws FileNotFoundException, IOException {

		//request.put("id", Config.getID());
		request.put("name", Config.getname());
		request.put("imageURL", "");
		request.put("propertyTypeId", Config.getpropertyTypeId());
		request.put("apartment", Config.getapartment());
		request.put("street", Config.getstreet());
		request.put("city", Config.getcity());
		request.put("state", Config.getstate());
		request.put("country", Config.getcountry());
		request.put("zipCode", Config.getzipCode());
		request.put("latitude", "");
		request.put("longitude", "");
		baseURI=Endpoints.baseURI;
		logger.info(request.toJSONString());	
	}
	
	@Test
	public void testPost001() throws FileNotFoundException, IOException {
		given().header("Authorization", "bearer " + Config.getToken(), "accept", "application/json")
				.contentType(ContentType.JSON).body(request.toJSONString()).when().post(Endpoints.addproperty).then()
				.statusCode(201).log().all();

	}

}
