package com.dt.api.ExtentReports;

import java.util.HashMap;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Reporting {

	@SuppressWarnings("rawtypes")
	static Map extentTestMap = new HashMap();
	static ExtentReports extent = ExtentManager.getReporter();

	@SuppressWarnings("deprecation")
	public static synchronized ExtentTest getTest() {
		return (ExtentTest) extentTestMap.get((int) (long) (Thread.currentThread().getId()));
	}

	@SuppressWarnings("deprecation")
	public static synchronized void endTest() {
		extent.endTest((ExtentTest) extentTestMap.get((int) (long) (Thread.currentThread().getId())));
	}

	public static synchronized ExtentTest startTest(String testName) {
		return startTest(testName, "");
	} 

	@SuppressWarnings({ "unchecked", "deprecation" })
	public static synchronized ExtentTest startTest(String testName, String desc) {
		ExtentTest test = extent.startTest(testName, desc);
		extentTestMap.put((int) (long) (Thread.currentThread().getId()), test);

		return test;
	}
}
