package com.dt.api.users.post;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.dt.api.main.Config;

import io.restassured.http.ContentType;

public class testPOST_ForgetPassword {
	public String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbElkIjoidmluZGh5YXJAYnl0ZXJpZGdlLmNvbSIsImZpcnN0TmFtZSI6IlZpbmRoeWEiLCJsYXN0TmFtZSI6IlJhamVuZGVyIiwicGhvbmVOdW1iZXIiOiIiLCJpYXQiOjE2NjU3NDc1NDgsImV4cCI6MTY2NTc1MTE0OH0.-bGaHIhe-kwG5g1-Iu9qykhEKKsH23ewQbWYQmszKTE";
	@SuppressWarnings("unchecked")
	@Test
	public void testPost() throws FileNotFoundException, IOException {
		
		JSONObject request = new JSONObject();
		request.put("email", "vindhyar@byteridge.com");
		
		baseURI="https://api-qa.dthreaddev.com/api";
		given()
		.header("Authorization","bearer "+Config.getToken(),"accept" ,"application/json").contentType(ContentType.JSON).log().all()
		.body(request.toJSONString())
		.when()
		.post("/users/forgetpassword")
		.then()
		.statusCode(200);
		
}


}
