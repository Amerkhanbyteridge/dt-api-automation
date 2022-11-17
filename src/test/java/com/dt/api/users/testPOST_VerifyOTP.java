package com.dt.api.users;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dt.api.baseclass.Baseclass;
import com.dt.api.main.Config;
import com.dt.api.main.Endpoints;

import io.restassured.http.ContentType;

public class testPOST_VerifyOTP extends Baseclass {


	@SuppressWarnings("unchecked")
	@BeforeClass
	public void init() throws FileNotFoundException, IOException {
		request = new JSONObject();
		request.put("otp", Config.getotp());
		request.put("emailID", Config.getemailID());
		System.out.println(request.toJSONString());
	}

	@Test
	public void testPost() throws FileNotFoundException, IOException {

		given().header("Authorization", "bearer " + Config.getToken(), "accept", "application/json")
				.contentType(ContentType.JSON).body(request.toJSONString()).when()
				.post(Endpoints.veriifyforgotpasswordotp).then().statusCode(400).log().all();

	}

}
