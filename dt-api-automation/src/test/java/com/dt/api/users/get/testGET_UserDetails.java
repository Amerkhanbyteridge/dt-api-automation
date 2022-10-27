package com.dt.api.users.get;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class testGET_UserDetails {
	public String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbElkIjoidmluZGh5YXJAYnl0ZXJpZGdlLmNvbSIsImZpcnN0TmFtZSI6IlZpbmRoeWEiLCJsYXN0TmFtZSI6IlJhamVuZGVyIiwicGhvbmVOdW1iZXIiOiIiLCJpYXQiOjE2NjU3NDYwNzcsImV4cCI6MTY2NTc0OTY3N30.Vn2ZMBsSBcCIgU4OTOSQa8ijGfMe19kAcns5fIQSwt8";
	@Test
	public void testGet001() {
		baseURI = "https://api-qa.dthreaddev.com/api";
		Response response = given().headers("Authorization","bearer "+token, "accept" ,"application/json")
		.get("/api/users/invites").andReturn();
		 System.out.println(response.getStatusCode());
		 System.out.println(response.getTime());
		 System.out.println(response.getBody().toString());
		 System.out.println(response.getStatusLine());
		 System.out.println(response.getHeader("content-type"));
		 assertEquals(response.getStatusCode(),200);
		//.then()
		//.statusCode(200);
	}

}