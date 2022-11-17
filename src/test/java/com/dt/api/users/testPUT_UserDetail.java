package com.dt.api.users;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dt.api.baseclass.Baseclass;
import com.dt.api.main.Config;
import com.dt.api.main.Endpoints;

import io.restassured.http.ContentType;

public class testPUT_UserDetail extends Baseclass {

	@SuppressWarnings("unchecked")
	@BeforeClass
	public void init() throws FileNotFoundException, IOException {
		request = new JSONObject();
		request.put("firstName", Config.getfirstname());
		request.put("lastName", Config.getlastname());
		request.put("phoneNumber", Config.getphonenumber());
		request.put("imageURL", Config.getimage());
		logger.info(request.toJSONString());

	}

	@Test

	public void testPUT() throws FileNotFoundException, IOException {
		given().headers("accept", "application/json", "Authorization", "bearer " + Config.getToken())
				.contentType(ContentType.JSON).log().all().pathParam("email", Config.getemailID())
				.body(request.toJSONString()).when().put(Endpoints.updateuserdetail).then().statusCode(200);
	}

}
