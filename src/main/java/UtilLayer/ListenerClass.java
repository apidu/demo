package UtilLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListenerClass extends ExtendsReports implements ITestListener {
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	
	// Executes on test suit execution starts
	public void onStart(ITestContext context) {
		System.out.println("Suite is stated");
		extent = ExtendsReports.extentsetup();
	}

	// Executes on @test execution starts
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test case is started :"+result.getMethod().getMethodName());
		extentTest =extent.createTest(result.getMethod().getMethodName());
		
	}
	
	// Executes on @test execution pass
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test case is pass :"+result.getMethod().getMethodName());
		extentTest.log(Status.PASS, result.getMethod().getMethodName());
		
		
	}

	// Executes on @test execution fail
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test case is fail :"+result.getMethod().getMethodName());
		extentTest.log(Status.FAIL, result.getMethod().getMethodName());
	}

	// Executes on @test execution skip
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test case is skip :"+result.getMethod().getMethodName());
		extentTest.log(Status.SKIP, result.getMethod().getMethodName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		extentTest.log(Status.INFO, result.getMethod().getMethodName());
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		extentTest.log(Status.INFO, result.getMethod().getMethodName());
	}

	
	// Executes on test execution finished or completed
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}

}
