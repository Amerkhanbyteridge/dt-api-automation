package com.dt.api.users;

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
import com.dt.api.main.TestData;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class testPOST_UpdatePassword extends Baseclass {

	protected Response reps;

	@SuppressWarnings("unchecked")
	@BeforeClass
	public void init() throws FileNotFoundException, IOException {
		// reps=
		// given().header("Content-Type","application/json").contentType(ContentType.JSON).when().log().all().get(TestData.setnewpassworddata).andReturn();
		// body.asPrettyString();
		
		  request.put("email", Config.getemailID()); 
		  request.put("newPassword",Config.getPassword()); 
		  System.out.println(request.toJSONString());
		 

	}

	@Test
	public void testPost() throws FileNotFoundException, IOException {
		given().header("Authorization", "bearer " + Config.getToken(), "accept", "application/json")
				.contentType(ContentType.JSON).body(request.toJSONString()).when().post(Endpoints.setnewpassword).then().statusCode(200)
				.log().all();
	}

}
