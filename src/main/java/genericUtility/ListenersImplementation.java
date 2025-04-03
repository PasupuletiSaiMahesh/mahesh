package genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener
{
	JavaUtility jUtil=new JavaUtility();
	String dateTimeStamp=jUtil.getCalenderDetails("dd-MM-YYYY hh-mm-ss");
	
	ExtentReports report;
	ExtentTest test;
	
	ThreadLocal<ExtentTest> extentTest= new ThreadLocal<>();
	
	@Override
	public void onTestStart(ITestResult result)
	{
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"-> On Test Start");
		Reporter.log(methodName+"-> on test Start");
		
		//create a field in the generated extends report
		test=report.createTest(methodName);
		
		//Set the current thread's copy of this thread variable to the spicfied value
		extentTest.set(test);
		
	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"-> On Test Success");
		Reporter.log(methodName+"-> on test Success");
		
		//logging the Status
	//	test.log(Status.PASS,methodName+"-Excuted successfully");
		extentTest.get().log(Status.PASS,methodName+"-Excuted successfully");

	}
	@Override 
	public void onTestFailure(ITestResult result)
	{
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"-> On Test Failure");
		Reporter.log(methodName+"-> on test Failure");
		
		
		//logging the status
	//	test.log(Status.FAIL, methodName+"-test Failed");
		extentTest.get().log(Status.FAIL, methodName+"-test Failed");

		
		//logging the throwable message
	//	test.log(Status.INFO, result.getThrowable());
		extentTest.get().log(Status.INFO, result.getThrowable());

		
		//logging the take the Screenshot of the WebPagee
		SeleniumUtility sUtil=new SeleniumUtility();
		
		try
		{
			String path = sUtil.TakingScreenShot(BaseClass.sDriver, dateTimeStamp);
			extentTest.get().addScreenCaptureFromPath(path);
			
		} 
		catch (IOException e) 
		{
		
			e.printStackTrace();
		}
		
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"-> On Test Skipped");
		Reporter.log(methodName+"-> on test Skipped");
		
		//logging the status
   //	test.log(Status.SKIP, methodName+"-test Skipped");
		extentTest.get().log(Status.SKIP, methodName+"-test Skipped");
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		
	}
	@Override
	public void onStart(ITestContext context)
	{
		
		 System.out.println("on Suite start");
		 
		 //configuration of the extent report
		 ExtentSparkReporter reporter =new ExtentSparkReporter(".\\Extent Reports\\report-"+dateTimeStamp+".html");
		 reporter.config().setDocumentTitle("VTiger Execution Report");
		 reporter.config().setReportName("Build 1 VTiger");
		 reporter.config().setTheme(Theme.DARK);
		 
		 //Create an empty Extent Report
		 report=new ExtentReports();
		 report.attachReporter(reporter);
		 report.setSystemInfo("Base os", "Windows");
		 report.setSystemInfo("Base URL", "https://localhost:8888");
		 report.setSystemInfo("Base PlateForm", "Testing-Env");
		 report.setSystemInfo("Base browser", "chrome");
		 report.setSystemInfo(" Reporter", "mahesh");
	}
	@Override
	public void onFinish(ITestContext context) 
	{
		
		System.out.println("on suite finish");
		// Flushing the report
		report.flush();
		
	}
	
	 
	
	
}
