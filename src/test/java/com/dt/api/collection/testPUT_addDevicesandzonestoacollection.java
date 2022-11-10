package com.dt.api.collection;

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

public class testPUT_addDevicesandzonestoacollection extends Baseclass {

	@SuppressWarnings("unchecked")
	@BeforeClass
	public void init() throws FileNotFoundException, IOException {
		request = new JSONObject();
		request.put("name", Config.getname());
		logger.info(request.toJSONString());
		baseURI = Endpoints.baseURI;
	}

	@Test

	public void testPUT001() throws FileNotFoundException, IOException {
		given().headers("accept", "application/json", "Authorization", "bearer " + Config.getToken())
				.contentType(ContentType.JSON).log().all().body(request.toJSONString()).when()
				.put(Endpoints.addDevicesandzonestoacollection, Config.getcollectionIds()).then().statusCode(200);
	}
}
