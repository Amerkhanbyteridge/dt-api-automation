package com.dt.api.baseclass;
import static io.restassured.RestAssured.baseURI;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;

import com.dt.api.main.Endpoints;

public class Baseclass {

	JSONObject request = new JSONObject();
	public Logger logger = LogManager.getLogger(getClass());
	

	@BeforeClass
	public void init() throws FileNotFoundException, IOException {
		request = new JSONObject();
		baseURI = Endpoints.baseURI;
		

	}
}

