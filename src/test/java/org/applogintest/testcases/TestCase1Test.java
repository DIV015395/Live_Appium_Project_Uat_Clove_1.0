package org.applogintest.testcases;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.applogin.testcase.TestCase1;
import org.desiredcapabilities.DesireCap;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestCase1Test {
    public AppiumDriver driver;

    @BeforeClass
    public void driverLaunch() throws MalformedURLException {
        DesiredCapabilities caps = DesireCap.desire();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void main() {
        TestCase1 obj = new TestCase1((AndroidDriver) driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj.testCase();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj.toastMassageValidation();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterClass
    public void driverClose() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.quit();
    }
}


//package org.applogintest.testcases;
//
//import com.aventstack.extentreports.ExtentReports;
//        import com.aventstack.extentreports.ExtentTest;
//        import com.aventstack.extentreports.Status;
//        import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//        import io.appium.java_client.AppiumDriver;
//        import io.appium.java_client.android.AndroidDriver;
//        import org.applogin.testcase.TestCase1;
//        import org.desiredcapabilities.DesireCap;
//        import org.openqa.selenium.remote.DesiredCapabilities;
//        import org.testng.annotations.AfterClass;
//        import org.testng.annotations.BeforeClass;
//        import org.testng.annotations.Test;
//
//        import java.net.MalformedURLException;
//        import java.net.URL;
//        import java.util.concurrent.TimeUnit;
//
//public class TestCase1Test {
//    private ExtentReports extent;
//    private ExtentTest test;
//    private AppiumDriver driver;
//
//    @BeforeClass
//    public void driverLaunch() throws MalformedURLException {
//        // Create ExtentReports and attach the HTML reporter
//        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent-report.html");
//        extent = new ExtentReports();
//        extent.attachReporter(htmlReporter);
//
//        DesiredCapabilities caps = DesireCap.desire();
//        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//    }
//
//    @Test
//    public void main() {
//        // Create a new ExtentTest for the test case
//        test = extent.createTest("Test Case 1");
//
//        TestCase1 obj = new TestCase1((AndroidDriver) driver);
//
//        test.log(Status.INFO, "Navigated to https://www.example.com");
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        obj.testCase();
//
//        test.log(Status.INFO, "Performing toast message validation");
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        obj.toastMassageValidation();
//
//        test.log(Status.PASS, "Test Case 1 passed");
//    }
//
//    @AfterClass
//    public void driverClose() {
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.quit();
//
//        // Flush the extent reports
//        extent.flush();
//    }
//}
//
