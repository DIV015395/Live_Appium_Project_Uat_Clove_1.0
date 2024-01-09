package org.applogintest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.applogin.AppLogin;
import org.desiredcapabilities.BaseDriver;
import org.extentreport.ExtentManager;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class AppLoginTest {
    public AppiumDriver driver;
    public ExtentReports extent;
    public ExtentTest test;

    @Test
    public void main() throws InterruptedException, MalformedURLException {
        extent = ExtentManager.getInstance();
        test = extent.createTest("Test Case login", "Description of main login");
        BaseDriver baseDriver = new BaseDriver((AndroidDriver) driver, test);
        baseDriver.driverLaunch();
        AppLogin obj = new AppLogin((AndroidDriver) driver, test);
        obj.userName();
        obj.userPassword();
        obj.goClickButton();
        obj.permissonAllowed();
    }
}