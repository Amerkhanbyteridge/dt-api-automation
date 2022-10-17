package com.dt.api.users.get;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dt.api.main.Config;
import com.dt.api.main.Endpoints;

import io.restassured.response.Response;

public class testGET_UserInvites {
	
	
	JSONObject request;
	
	@BeforeClass
	public void init() throws FileNotFoundException, IOException {
		
		baseURI=Endpoints.baseURI;
		
	}
	
	// Verify the status code is 200 - OK
	
	@Test
	public void testGet001() throws FileNotFoundException, IOException {
	
		Response response = given()
				.headers("Authorization","bearer "+Config.getToken(), "accept" ,"application/json").log().all()
				.get(Endpoints.userInvites).andReturn();
				//Validate 200 - OK
		 		assertEquals(response.getStatusCode(),200);
		
	}
	
	// Verify if the reponse is not null
	@Test
	public void testGet002() throws FileNotFoundException, IOException {
		
		Response response = given()
				.headers("Authorization","bearer "+Config.getToken(), "accept" ,"application/json").log().all()
				.get(Endpoints.userInvites).andReturn();
				//Validate response does not have return null.
		 		assertNotNull(response);
		
	}

}
