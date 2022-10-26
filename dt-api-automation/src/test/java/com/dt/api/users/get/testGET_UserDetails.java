package com.dt.api.users.get;

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

import groovy.util.logging.Log;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class testGET_UserDetails {
	public String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbElkIjoidmluZGh5YXJAYnl0ZXJpZGdlLmNvbSIsImZpcnN0TmFtZSI6IlZpbmRoeWEiLCJsYXN0TmFtZSI6IlJhamVuZGVyIiwicGhvbmVOdW1iZXIiOiIiLCJpYXQiOjE2NjU3NDYwNzcsImV4cCI6MTY2NTc0OTY3N30.Vn2ZMBsSBcCIgU4OTOSQa8ijGfMe19kAcns5fIQSwt8";

	JSONObject request = new JSONObject();

	@BeforeClass
	public void init() throws FileNotFoundException, IOException {
		request = new JSONObject();
		baseURI = Endpoints.baseURI;

	}

	@Test
	public void testGet001() throws FileNotFoundException, IOException {
		Response response = given()
				.headers("Authorization", "bearer " + Config.getToken(), "accept", "application/json").log().all()
				.get(Endpoints.userdetails ,Config.getemailID()).andReturn();
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getBody().toString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		assertEquals(response.getStatusCode(), 200);
	}
}
