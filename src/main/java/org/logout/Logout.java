package org.logout;

import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.BaseDriver;

import java.util.concurrent.TimeUnit;

public class Logout extends BaseDriver {
    ExtentTest test;
    @AndroidFindBy(id = "com.clove.clover.uat:id/ic_home_logout")
    private AndroidElement logout;
    @AndroidFindBy(id = "android:id/button1")
    private AndroidElement yesButton;

    public Logout(AndroidDriver driver, ExtentTest test) {
        super(driver);
        this.test = test;
    }

    public void setLogoutFromDashboard() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        logout.click();
    }

}
