package com.dt.api.baseclass;

import static io.restassured.RestAssured.baseURI;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.dt.api.ExtentReports.ExtentManager;
import com.dt.api.ExtentReports.Reporting;
import com.dt.api.main.Endpoints;
import com.relevantcodes.extentreports.LogStatus;

public class Baseclass {

	public JSONObject request = new JSONObject();
	public Logger logger = LogManager.getLogger(getClass());
	
	public Baseclass() {
		// TODO Auto-generated constructor stub
		baseURI = Endpoints.baseURI;
	}
	

	@BeforeClass
	public void init() throws FileNotFoundException, IOException {
		request = new JSONObject();
	}

	@BeforeMethod
	public void beforeMethod(Method method) {

		Reporting.startTest(method.getName());
	}

	@AfterMethod
	protected void afterMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			Reporting.getTest().log(LogStatus.FAIL, result.getThrowable());
		} else if (result.getStatus() == ITestResult.SKIP) {
			Reporting.getTest().log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
		} else {
			Reporting.getTest().log(LogStatus.PASS, "Test passed");
			logger.info(getClass());
		}
		ExtentManager.getReporter().endTest(Reporting.getTest());
		ExtentManager.getReporter().flush();
	}

	


	protected String getStackTrace(Throwable t) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		t.printStackTrace(pw);
		return sw.toString();
	}
}