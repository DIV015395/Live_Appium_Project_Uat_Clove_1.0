package org.desiredcapabilities;

import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseDriver {
    public AppiumDriver appiumDriver;
    public static AndroidDriver<AndroidElement> driver;
    ExtentTest test;

    public BaseDriver(AndroidDriver<AndroidElement> driver, ExtentTest test) {
        BaseDriver.driver = driver;
        this.test = test;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    public AppiumDriver driverLaunch() {

        try {
            if (appiumDriver == null) {
                DesiredCapabilities caps = DesireCap.desire();
                appiumDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
                test.pass("Drive Launch Successful and Match Server Port and Desirecapibilities");
            }
        } catch (MalformedURLException e) {
            test.fail("Failed to Create the");
        }
        return appiumDriver;
    }
}

