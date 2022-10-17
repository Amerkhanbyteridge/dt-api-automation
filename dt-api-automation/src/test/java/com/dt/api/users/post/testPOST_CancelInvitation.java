package com.dt.api.users.post;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class testPOST_CancelInvitation {
	public String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbElkIjoidmluZGh5YXJAYnl0ZXJpZGdlLmNvbSIsImZpcnN0TmFtZSI6IlZpbmRoeWEiLCJsYXN0TmFtZSI6IlJhamVuZGVyIiwicGhvbmVOdW1iZXIiOiIiLCJpYXQiOjE2NjU3NDc1NDgsImV4cCI6MTY2NTc1MTE0OH0.-bGaHIhe-kwG5g1-Iu9qykhEKKsH23ewQbWYQmszKTE";
	@SuppressWarnings("unchecked")
	@Test
	public void testPost() {
		
		JSONObject request = new JSONObject();
		request.put("email", "vindhyar@byteridge.com");
		request.put("propertyId", "db1acab2-9e53-45b2-a9ca-84b51f7aa517");
		
		//System.out.println(request);
		System.out.println(request.toJSONString());
		
		baseURI="https://api-qa.dthreaddev.com/api";
		given()
		.header("Authorization","bearer "+token,"accept" ,"application/json").contentType(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.post("/users/acceptinvitation")
		.then()
		.statusCode(400);
		
}

}
