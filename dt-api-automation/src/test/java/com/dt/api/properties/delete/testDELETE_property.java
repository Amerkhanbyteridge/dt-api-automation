package com.dt.api.properties.delete;

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

public class testDELETE_property {

	JSONObject request = new JSONObject();
	@BeforeClass
	public void init() throws FileNotFoundException, IOException {
		baseURI=Endpoints.baseURI;	
	}
	
	@Test
	public void testDELETEProp() throws FileNotFoundException, IOException {
		given().headers("accept", "application/json", "authorization", "bearer " +Config.getToken())
				.contentType(ContentType.JSON).log().all().when().delete(Endpoints.deleteproperty , Config.getpropertyID()) /// users/{email}/{propertyId}","vindhyar@byteridge.com","ab41414a-da06-425d-bda7-3912d1aef1a6
				.then().statusCode(400).log().all();
	
	}

}
