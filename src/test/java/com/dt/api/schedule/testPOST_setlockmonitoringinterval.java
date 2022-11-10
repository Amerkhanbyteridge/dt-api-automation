package com.dt.api.schedule;

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

public class testPOST_setlockmonitoringinterval extends Baseclass{

	@SuppressWarnings("unchecked")
	@BeforeClass
	public void init() throws FileNotFoundException, IOException {

		request.put("roleIds", Config.getroleIds());
		request.put("isPending",true);
		request.put("isAccepted", true);
		logger.info(request.toJSONString());
		baseURI = Endpoints.baseURI;

	}

	@Test
	public void testPost001() throws FileNotFoundException, IOException {

		given().header("Authorization", "bearer " + Config.getToken(), "accept", "application/json")
				.contentType(ContentType.JSON).body(request.toJSONString()).when()
				.post(Endpoints.generateTokenforproperty ).then().statusCode(200).log().all();

	}
}
