package org.desiredcapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseDriver {
    public static AndroidDriver<AndroidElement> driver;

    public BaseDriver(AndroidDriver<AndroidElement> driver) {
        BaseDriver.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public void baseDriverWait()
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
    }
}

