
package com.dt.api.session;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.dt.api.baseclass.Baseclass;
import com.dt.api.main.Config;
import com.dt.api.main.Endpoints;
//import com.dt.api.reporting.ExtentTestManager;

import io.restassured.http.ContentType;

public class testPOST_Session extends Baseclass {

	@SuppressWarnings("unchecked")
	@BeforeClass
	public void init() throws FileNotFoundException, IOException {

		request.put("email", Config.getemailID());
		request.put("password", Config.getPassword());
		baseURI = Endpoints.baseURI;

	}

	@Test
	public void testPost() throws FileNotFoundException, IOException {

		String sessionToken = given().header("accept", "application/json").contentType(ContentType.JSON).log().all()
				.body(request.toJSONString()).when().post("/api/sessions/").then().statusCode(200).extract()
				.path("data.sessionToken");

		new Config("token", sessionToken);
		logger.info("token is: " +sessionToken);
		//ExtentTestManager.getTest().log(Status.INFO, sessionToken);
		logger.info("token is: " +Config.getToken());
	}

}