package com.dt.api.ExtentReports;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
    static ExtentReports extent;
    final static String filePath = "./test-output/html/DT_TestReport";
    
    public synchronized static ExtentReports getReporter() {
    	String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    	String repName = "Test-report-"+timestamp+".html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(filePath);
        if (extent == null) {
            extent = new ExtentReports(filePath +timestamp+".html", true);
            reporter.config().setReportName(repName);
            reporter.config().setDocumentTitle("DeviceThread AUtomation Report");
            reporter.config().setTheme(Theme.STANDARD);
        }
        
        return extent;
    }
}