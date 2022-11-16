package com.dt.api.zones;


import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dt.api.baseclass.Baseclass;
import com.dt.api.main.Config;
import com.dt.api.main.Endpoints;
import com.mongodb.diagnostics.logging.Logger;

import io.restassured.http.ContentType;

public class testPOST_addzone extends Baseclass{



	@SuppressWarnings("unchecked")
	@BeforeClass
	public void init() throws FileNotFoundException, IOException {
		request = new JSONObject();
		request.put("name",Config.getname());
		request.put("zoneTypeId",Config.getzonetypeId());
		request.put("propertyId",Config.getpropertyID());
		request.put("parentId", Config.getparentId());
		logger.info(request.toJSONString());

	}

	@Test
	public void testPost001() throws FileNotFoundException, IOException {

		given().header("Authorization", "bearer " + Config.getToken(), "accept", "application/json")
				.contentType(ContentType.JSON).body(request.toJSONString()).when()
				.post(Endpoints.addzone).then().statusCode(201).log().all();

	}

}
