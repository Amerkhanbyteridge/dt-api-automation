package com.dt.api.properties.post;

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

public class testPOST_togglefavourite extends Baseclass {


	@SuppressWarnings("unchecked")
	@BeforeClass
	public void init() throws FileNotFoundException, IOException {
	
		request.put("propertyId", Config.getpropertyID());
		request.put("isStarred",true);
		logger.info(request.toJSONString());
		baseURI = Endpoints.baseURI;

	}

	@Test
	public void testPost001() throws FileNotFoundException, IOException {

		given().header("Authorization", "bearer " + Config.getToken(), "accept", "application/json")
				.contentType(ContentType.JSON).body(request.toJSONString()).when()
				.post(Endpoints.togglefavourite).then().statusCode(201).log().all();

	}

}
