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

import com.dt.api.main.Config;
import com.dt.api.main.Endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class testPOST_AcceptInvitation {

	JSONObject request = new JSONObject();
	Response response;
	@SuppressWarnings("unchecked")
	@BeforeClass
	public void init() throws FileNotFoundException, IOException {
		request = new JSONObject();
		request.put("roleId", Config.getroleID());
		request.put("propertyId", Config.getpropertyID());
		request.put("isAccepted", "true");
		baseURI=Endpoints.baseURI;
		System.out.println(request.toJSONString());
		
	}
	
	
	@Test
	public void testPost001() throws FileNotFoundException, IOException {
		given().header("Authorization", "bearer " + Config.getToken(), "accept", "application/json")
				.contentType(ContentType.JSON).body(request.toJSONString()).when().post(Endpoints.acceptinvite).then()
				.statusCode(400).log().all();
		

	}

}
