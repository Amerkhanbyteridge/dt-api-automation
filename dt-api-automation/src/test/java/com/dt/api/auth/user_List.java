package com.dt.api.auth;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class  user_List {
	public String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbElkIjoidmlzaHZhaml0d2F2aGFsZTE5OTZAZ21haWwuY29tIiwiZmlyc3ROYW1lIjoiVmlzaHZhaml0IiwibGFzdE5hbWUiOiJXYXZoYWxlIiwicGhvbmVOdW1iZXIiOiIiLCJpYXQiOjE2NjY5MzQ3MTcsImV4cCI6MTY2NjkzODMxN30.ebBqeFLPfDIvXjye9UHEp8Wz26I2wNJT-Ho5MFCAn_8";
	public void testGet001() {
		baseURI = "https://api-qa.dthreaddev.com/api";
		Response response = given().headers("Authorization","bearer "+token, "accept" ,"application/json")
		.get("/api/properties/{propertyId}/users").andReturn();
		 System.out.println(response.getStatusCode());
		 System.out.println(response.getTime());
		 System.out.println(response.getBody().toString());
		 System.out.println(response.getStatusLine());
		 System.out.println(response.getHeader("content-type"));
		 assertEquals(response.getStatusCode(),200);
		
		
}}
