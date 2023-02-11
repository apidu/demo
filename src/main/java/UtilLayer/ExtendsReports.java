package UtilLayer;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.Baseclass;

public class ExtendsReports extends Baseclass {
	public static ExtentReports extent;

	public static ExtentReports extentsetup() {

		ExtentSparkReporter sparkreport = new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\abc.html");
		
		extent = new ExtentReports();
		extent.attachReporter(sparkreport);
		return extent;

	}
}
