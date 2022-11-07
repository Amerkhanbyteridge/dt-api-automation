package com.dt.api.keyrequest.put;

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

public class testPUT_reactivekeyforguestorstaff {


	JSONObject request = new JSONObject();

	@SuppressWarnings("unchecked")
	@BeforeClass
	public void init() throws FileNotFoundException, IOException {
		request = new JSONObject();
		request.put("startDate", Config.getstartdate());
		request.put("startTime", Config.getstartTime());
		request.put("endDate", Config.getenddate());
		request.put("endTime", Config.getendTime());
		request.put("neverExpires", true);
		System.out.println(request.toJSONString());
		baseURI = Endpoints.baseURI;
	}

	@Test

	public void testPUT001() throws FileNotFoundException, IOException {
		given().headers("accept", "application/json", "Authorization", "bearer " + Config.getToken())
				.contentType(ContentType.JSON).log().all()
				.body(request.toJSONString()).when().put(Endpoints.reactivekeyforguestorstaff,Config.getkeyID()).then().statusCode(200);
	}


}
