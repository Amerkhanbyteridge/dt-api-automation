package com.dt.api.users.get;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dt.api.main.Config;
import com.dt.api.main.Endpoints;

import io.restassured.internal.http.Status;
import io.restassured.response.Response;

public class testGET_UserInvites {

	JSONObject request = new JSONObject();

	@BeforeClass
	public void init() throws FileNotFoundException, IOException {
		request = new JSONObject();
		baseURI = Endpoints.baseURI;

	}

	@Test
	public void testGet() throws FileNotFoundException, IOException {
		Response response = given()
				.headers("authorization", "bearer " + Config.getToken(), "accept", "application/json")
				.get(Endpoints.userInvites).andReturn();
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getBody().toString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		assertEquals(response.getStatusCode(), 200);

	}

}
