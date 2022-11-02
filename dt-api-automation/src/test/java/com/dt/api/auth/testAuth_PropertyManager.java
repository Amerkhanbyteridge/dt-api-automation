package com.dt.api.auth;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dt.api.main.Config;
import com.dt.api.main.Endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class testAuth_PropertyManager {
	public String token ="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbElkIjoidmlzaHZhaml0d2F2aGFsZTE5OTZAZ21haWwuY29tIiwiZmlyc3ROYW1lIjoiVmlzaHZhaml0IiwibGFzdE5hbWUiOiJXYXZoYWxlIiwicGhvbmVOdW1iZXIiOiIiLCJpYXQiOjE2NjY5Mzg2NTYsImV4cCI6MTY2Njk0MjI1Nn0.A8cC9ssZt0iNxq-TwVu8hQyZe4PlI55nAOrjXBW1jUI";
	//public String propertyID = "";
	@Test
	public void testInviteUser() throws FileNotFoundException,  {
		
		JSONObject request = new JSONObject();
		request.put("email", "Srinas@byteridge.com");
		request.put("firstName", "srinivas");
		request.put("lastName", "m");
		request.put("propertyId", "5746c2a9-ae05-4972-874c-e7144114da46");
		request.put("roleId", "e441ad2a-8d55-471c-ba2b-992bb8d3e171");
		
		System.out.println(request.toJSONString());
		
		baseURI="https://api-qa.dthreaddev.com/api";
		given()
		.header("Authorization","bearer "+Config.getToken(),"accept" ,"application/json").contentType(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.post("/users/invitation")
		.then()
		.statusCode(200);
		

	}	
	@Test
	public void userList() {
		baseURI = "https://api-qa.dthreaddev.com/api";
		Response response = given().headers("Authorization","bearer "+Config.getToken(), "accept" ,"application/json").log().all()
		.get("/api/properties/{propertyId}/users").andReturn();
		 System.out.println(response.getStatusCode());
		 System.out.println(response.getTime());
		 System.out.println(response.getBody().toString());
		 System.out.println(response.getStatusLine());
		 System.out.println(response.getHeader("content-type"));
		 assertEquals(response.getStatusCode(),200);
		
	
	}
}
