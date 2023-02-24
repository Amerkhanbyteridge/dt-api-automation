package com.dt.api.users;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dt.api.ExtentReports.Reporting;
import com.dt.api.baseclass.Baseclass;
import com.dt.api.main.Config;
import com.dt.api.main.Endpoints;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.Validatable;
import io.restassured.response.ValidatableResponse;

public class testPOST_Invitation extends Baseclass {
	JSONObject request = new JSONObject();

	@SuppressWarnings("unchecked")
	@BeforeClass
	public void init() throws FileNotFoundException, IOException {
		request = new JSONObject();// given().header("accept","application/json")
		//.contentType(ContentType.JSON).body(request.toJSONString()).when().get(TestData.inviteuserdata).andthen. return();
		request.put("email", Config.getemailID());
		request.put("firstName", Config.getfirstname());
		request.put("lastName", Config.getlastname());
		request.put("propertyId", Config.getpropertyID());
		request.put("roleId", Config.getroleID());
		
		request.put("groupId", Config.getgroupId());
		
		System.out.println(request.toJSONString());
		baseURI = Endpoints.baseURI;
	}
	@Test
	public void testPost() throws FileNotFoundException, IOException {
		 given().header("Authorization", "Bearer " + Config.getToken())
				.header("Content-Type", "application/json").body(request.toJSONString()).when().post(Endpoints.inviteuser).then()
				.statusCode(200).log().all();


	}

}
