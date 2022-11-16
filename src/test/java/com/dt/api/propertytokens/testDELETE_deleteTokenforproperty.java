package com.dt.api.propertytokens;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.dt.api.ExtentReports.Reporting;
import com.dt.api.baseclass.Baseclass;
import com.dt.api.main.Config;
import com.dt.api.main.Endpoints;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.http.ContentType;
import io.restassured.response.ResponseBody;

public class testDELETE_deleteTokenforproperty extends Baseclass{

	@Test
	public void testDELETE001() throws FileNotFoundException, IOException {
		response = httpRequest.delete(Endpoints.deleteTokenforproperty).andReturn();
		ResponseBody body = response.getBody();
		logger.info("Status code is: " + response.getStatusCode());
		Reporting.getTest().log(LogStatus.INFO, "Status code is: " + response.getStatusCode());
		logger.info("Response time is: " + response.getTime());
		Reporting.getTest().log(LogStatus.INFO, "Response time is: " + response.getTime());
		logger.info("Response body is: " + body.asPrettyString());
		Reporting.getTest().log(LogStatus.INFO, "Response body is: " + body.asPrettyString());
		logger.info("Status line is: " + response.getStatusLine());
		Reporting.getTest().log(LogStatus.INFO, "Status line is: " + response.getStatusLine());
		logger.info("Content type is: " + response.getHeader("content-type"));
		Reporting.getTest().log(LogStatus.INFO, "Content type is: " + response.getHeader("content-type"));
		assertEquals(response.getStatusCode(), 200);
	}

}
