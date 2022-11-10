package com.dt.api.properties;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import com.dt.api.baseclass.Baseclass;
import com.dt.api.main.Config;
import com.dt.api.main.Endpoints;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class testGET_propertybyID extends Baseclass{
	
	@Test
	public void testGetPropertyID() throws FileNotFoundException, IOException {
		Response response = given().headers("Authorization","bearer "+Config.getToken(), "accept" ,"application/json").log().all()
		.get(Endpoints.propertybyID ,Config.getpropertyID()).andReturn();
		ResponseBody body= response.getBody();
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getBody().toString());
		System.out.println(body.asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		assertEquals(response.getStatusCode(), 200);	
	}


}
