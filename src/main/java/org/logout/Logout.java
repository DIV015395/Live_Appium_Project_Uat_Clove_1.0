package org.logout;

import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.BaseDriver;
import org.testng.Assert;

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

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_login_titleLogin")
    private AndroidElement titleLogin;

    public void setLogoutFromDashboard() {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            logout.click();
            test.pass("Click on Logout button Successful");
        } catch (Exception e) {
            test.fail("Failed to Click on Logout button");
        }
    }

    public void clickOnYesButton() {
        try {
            yesButton.click();
            test.pass("Click on Yes Button Successful");
        } catch (Exception e) {
            test.fail("Failed to click on yes Button");
        }
    }

    public void redirectLoginPage() {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            Assert.assertEquals(titleLogin.getText(), "Login");
            test.pass("Successful Redirect to Login Page");
        } catch (Exception e) {
            test.fail("Failed to Redirect to Login Page");
        }

    }
}
