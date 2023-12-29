package org.logout;

import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.BaseDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;
public class MenuLogout extends BaseDriver {
    ExtentTest test;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_home_chat")
    private AndroidElement homeChat;
    @AndroidFindBy(id = "com.clove.clover.uat:id/openDrawer")
    private AndroidElement menu;
    @AndroidFindBy(id = "com.clove.clover.uat:id/nav_logout")
    private AndroidElement menuLogout;
    @AndroidFindBy(id = "android:id/button1")
    private AndroidElement yesButton;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_login_titleLogin")
    private AndroidElement titleLogin;

    public MenuLogout(AndroidDriver driver, ExtentTest test) {
        super(driver);
        this.test = test;
    }

    public void setHomeChat() {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            homeChat.click();
            test.pass("Successful Click on Dashboard Chat button");
        } catch (Exception e) {
            test.fail("Failed to click on Dashboard Chat button");
        }
    }

    public void setMenu() {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            menu.click();
            test.pass("Successful Click on Menu Button");
        } catch (Exception e) {
            test.fail("Failed to click on Menu Button ");
        }

    }

    public void setLogoutFromMenu() {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            menuLogout.click();
            test.pass("Successful Click on Logout Button");
        } catch (Exception e) {
            test.fail("Failed Click on Logout Button");

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
