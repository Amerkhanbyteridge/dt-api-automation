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
import io.restassured.internal.http.Status;

public class testPUT_propertyDetail extends Baseclass {

	@SuppressWarnings("unchecked")
	@BeforeClass
	public void init() throws FileNotFoundException, IOException {

		request.put("propertyTypeId", Config.getpropertyTypeId());
		request.put("name", Config.getname());
		request.put("apartment", Config.getapartment());
		request.put("imageURL", "");
		request.put("street", Config.getstreet());
		request.put("city", Config.getcity());
		request.put("state", Config.getstate());
		request.put("country", Config.getcountry());
		request.put("zipCode", Config.getzipCode());
		logger.info(request.toJSONString());
		baseURI = Endpoints.baseURI;
	}

	@Test

	public void testPUT() throws FileNotFoundException, IOException {
		given().headers("accept", "application/json", "Authorization", "bearer " + Config.getToken())
				.contentType(ContentType.JSON).log().all().body(request.toJSONString()).when()
				.put(Endpoints.updateproperty, Config.getpropertyID()).then().statusCode(200).log().all();
	}

}
