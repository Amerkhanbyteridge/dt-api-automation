package com.api.Auth;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dt.api.main.ConfigAuth;
import com.dt.api.main.Endpoints;

import io.restassured.http.ContentType;

public class Session_Auth {
	
	JSONObject request;
	
	@SuppressWarnings("unchecked")
	@BeforeClass
	public void init() throws FileNotFoundException, IOException {
		request = new JSONObject();
		request.put("email", ConfigAuth.getemailID());
		request.put("password", ConfigAuth.getPassword());
		baseURI=Endpoints.baseURI;
		
	}
	
	@Test
	public void testPost() throws FileNotFoundException, IOException {
	
		String sessionToken = given()
		.header("accept" ,"application/json").contentType(ContentType.JSON).log().all()
		.body(request.toJSONString())
		.when()
		.post("/api/sessions/")
		.then()
		.statusCode(200).extract().path("data.sessionToken");
		
		new ConfigAuth("token",sessionToken);
		System.out.println("sessionToken--"+sessionToken);
		System.out.println(ConfigAuth.getToken());
} 
	

}
