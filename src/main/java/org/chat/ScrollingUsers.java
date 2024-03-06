package org.chat;

import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.utils.NewBaseDriver;


public class ScrollingUsers extends NewBaseDriver
{

    AppiumDriver driver;
    ExtentTest test;
    public ScrollingUsers(AndroidDriver<AndroidElement> driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
        this.driver = driver;
    }
    public void scrollingDown()
    {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"chirag.dayal\"))"));
    }
    public void scrollingUp() {
        // Corrected UI Automator selector
        String selector = "new UiScrollable(new UiSelector().scrollable(true)).scrollBackward().scrollIntoView(new UiSelector().text(\"aafreen.haque\"))";

        // Find the element using the corrected selector
        driver.findElement(MobileBy.AndroidUIAutomator(selector));
    }


}
