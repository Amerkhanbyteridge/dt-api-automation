package com.dt.api.collection;

import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.dt.api.baseclass.Baseclass;
import com.dt.api.main.Config;
import com.dt.api.main.Endpoints;

import io.restassured.http.ContentType;

public class testDELETE_deletecollection extends Baseclass {

	@Test
	public void testDELETE001() throws FileNotFoundException, IOException {
		given().headers("accept", "application/json", "authorization", "bearer " + Config.getToken())
				.contentType(ContentType.JSON).log().all().when()
				.delete(Endpoints.deletecollection) 
				.then().statusCode(200).log().all();
	}
}



