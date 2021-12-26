package com.crm.vtiger.GenericUtils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class ListenerImplement extends BaseClass implements ITestListener {
	
	ExtentReports report;
	ExtentTest test;
	
	public void onTestStart(ITestResult result) {
		
		//Step3: Create test method
		test=report.createTest(result.getMethod().getMethodName());
		
	}

	public void onTestSuccess(ITestResult result) {
		// Step4: Log for Pass methods
		test.log(Status.PASS, result.getMethod().getMethodName()+" is Passed");
		
	}

	public void onTestFailure(ITestResult result) {
		Object obj=result.getInstance();
		WebDriver driver=null;
		try {
			driver=(WebDriver) result.getTestClass().getRealClass().getSuperclass().getDeclaredField("driver").get(obj);
		}catch(Throwable e1) {
			e1.printStackTrace();
		}
		EventFiringWebDriver takescreenshot=new EventFiringWebDriver(BaseClass.staticDriver);
		File source = takescreenshot.getScreenshotAs(OutputType.FILE);
		String screenshotPath = "./screenshots/"+result.getMethod().getMethodName()+"_"+JavaUtility.getCurrentDate()+".png";
		File dest=new File(screenshotPath);
		try {
			//FileUtils.copyFile(source, new File("./screenshot/"+result.getMethod().getMethodName()+"_"+JavaUtility.getCurrentDate()+".png"));
			FileUtils.copyFile(source, dest);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		// Step5: Log for failure methods
		test.log(Status.FAIL, result.getMethod().getMethodName()+" is Failed");
		test.log(Status.FAIL, result.getThrowable());
		test.addScreenCaptureFromPath(screenshotPath);
	}
	
	
	

	public void onTestSkipped(ITestResult result) {
		//step6: Log for skip methods
		test.log(Status.SKIP, result.getMethod().getMethodName()+"is Skipped");
		test.log(Status.SKIP, result.getThrowable());
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//Step1: Configuration
		ExtentSparkReporter htmlReporter=new ExtentSparkReporter("./extentreport/"+JavaUtility.getCurrentDate()+".html");
		 htmlReporter.config().setTheme(Theme.DARK);
		 htmlReporter.config().setDocumentTitle("Vtiger Automation  Report");
		 htmlReporter.config().setReportName("Execution Report");
		 
		 //Step2: Attaching report and system info
		 report=new ExtentReports();
		 report.attachReporter(htmlReporter);
		 report.setSystemInfo("OS", "Windows");
		 report.setSystemInfo("Url", "http://localhost:8888/");
		report.setSystemInfo("Platform", "Windows10");
		report.setSystemInfo("Repoter Name", "ARIJIT");
	}

	public void onFinish(ITestContext context) {
		// Step7: Flush the report
		report.flush();
	}
	

}
