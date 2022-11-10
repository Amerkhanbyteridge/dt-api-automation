package com.dt.api.users;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dt.api.main.Config;
import com.dt.api.main.Endpoints;

import io.restassured.http.ContentType;

public class testPOST_Invitation {
	JSONObject request = new JSONObject();

	@SuppressWarnings("unchecked")
	@BeforeClass
	public void init() throws FileNotFoundException, IOException {
		request = new JSONObject();// given().header("accept","application/json")
		//.contentType(ContentType.JSON).body(request.toJSONString()).when().get(TestData.inviteuserdata).andthen. return();
		request.put("email", Config.getemailID());
		request.put("firstName", Config.getfirstname());
		request.put("lastName", Config.getlastname());
		request.put("propertyId", Config.getpropertyID());
		request.put("roleId", Config.getroleID());
		System.out.println(request.toJSONString());
		baseURI = Endpoints.baseURI;
	}
	@Test
	public void testPost() throws FileNotFoundException, IOException {
		given().header("Authorization", "bearer " + Config.getToken(), "accept", "application/json")
				.contentType(ContentType.JSON).body(request.toJSONString()).when().post(Endpoints.inviteuser).then()
				.statusCode(400).log().all();

	}

}
