package uivalidation;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.desiredcapabilities.DesireCap;
import org.extentreport.ExtentManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import orguivalidation.login.LoginScreen;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CompleteUIScreenValidation {
    public AppiumDriver driver;
    public ExtentReports extent;
    public ExtentTest test;

    @BeforeClass
    public void driverLaunch() {
        extent = ExtentManager.getInstance();
        test = extent.createTest("Login Page UI Validation", "Login Page UI Validation");
        try {
            DesiredCapabilities caps = DesireCap.desire();
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            test.log(Status.FAIL, "Click function is not working");
        }
    }

    @Test
    public void loginScreenTest() {
        LoginScreen objLoginScreen = new LoginScreen((AndroidDriver) driver, test);
        objLoginScreen.loginTitle();
        objLoginScreen.titleProceed();
        objLoginScreen.loginUsername();
        objLoginScreen.loginPassword();
        objLoginScreen.loginGo();
        objLoginScreen.loginBottomMessage();
        objLoginScreen.captureAndAttachScreenshot();
    }

    public void loginRedirectToDashboard() {

    }

    @AfterClass
    public void driverClose() {
        driver.quit();
        extent.flush();
    }
}
