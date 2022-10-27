package com.dt.api.users.put;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class testPUT_UserDetail {
	public String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbElkIjoidmluZGh5YXJAYnl0ZXJpZGdlLmNvbSIsImZpcnN0TmFtZSI6IlZpbmQiLCJsYXN0TmFtZSI6Imh5YSIsInBob25lTnVtYmVyIjoiIiwiaWF0IjoxNjY1NzU0OTYzLCJleHAiOjE2NjU3NTg1NjN9.0Dg2aup-CvId2VQ14hahSHuTPqdsZO3N68d4dF6loY8";
	@SuppressWarnings("unchecked")
	@Test
	
	public void testPUT()
	{
		JSONObject request = new JSONObject();
		request.put("firstName", "Vinny");
		request.put("lastName", "Rajan");
		request.put("phoneNumber", "");
		request.put("imageURL", "");
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		baseURI="https://api-qa.dthreaddev.com/api";
		given()
		.headers("accept" ,"application/json","Authorization","bearer "+token).contentType(ContentType.JSON).log().all()
		.pathParam("email","vindhyar@byteridge.com")
		.body(request.toJSONString())
		.when()
		.put("/users/{email}")
		.then()
		.statusCode(200);
	}
	

}