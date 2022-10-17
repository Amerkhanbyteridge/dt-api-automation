package com.dt.api.session;

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

public class testPOST_Session {
	
	JSONObject request;
	@BeforeClass
	public void init() throws FileNotFoundException, IOException {
		request = new JSONObject();
		request.put("email", Config.getemailID());
		request.put("password", Config.getPassword());
		baseURI=Endpoints.baseURI;
		
	}
	
	@SuppressWarnings({ "unchecked" })
	@Test
	public void testPost() throws FileNotFoundException, IOException {
	
		String sessionToken = given()
		.header("accept" ,"application/json").contentType(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.post("/api/sessions/")
		.then()
		.statusCode(200).extract().path("data.sessionToken");
		
		new Config("token", sessionToken);
		System.out.println(Config.getToken());
}


}
