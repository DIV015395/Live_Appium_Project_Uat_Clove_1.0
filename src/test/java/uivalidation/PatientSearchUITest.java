package uivalidation;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.applogin.testcase.TestCase5;
import org.utils.DesireCap;
import org.extentreport.ExtentManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.patientsearch.PatientSearch;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import orguivalidation.patientsearch.PatientSearchScreen;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class PatientSearchUITest
{
    public AppiumDriver driver;
    public ExtentReports extent = ExtentManager.getInstance();
    public ExtentTest test;
    @BeforeClass
    public void driverLaunch() {
        test = extent.createTest("DashBoard Page UI Validation", "DashBoard Page UI Validation");
        try {
            DesiredCapabilities caps = DesireCap.desire();
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            test.log(Status.FAIL, "Click function is not working");
        }
    }
    @Test(priority = 1)
    public void redirectToDashboard()
    {
        TestCase5 obj = new TestCase5((AndroidDriver) driver, test);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj.userName();
        obj.userPassword();
        obj.goClickButton();
        obj.permissonAllowed();
        obj.toastMassage();
        obj.toastMassageValidation();
    }
    @Test(priority = 2)
    public void redirectToPatientSearch() {
        PatientSearch obj = new PatientSearch((AndroidDriver) driver, test);
        obj.homePatientSearch();
        obj.explore();
    }
    @Test(priority = 3)
    public void patientSearchUIValidation()
    {
        PatientSearchScreen obj = new PatientSearchScreen((AndroidDriver) driver, test);
        obj.patientSearchTitle();
        obj.patientIvSearchIcon();

    }
    @AfterClass
    public void driverClose() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.quit();
        extent.flush();
    }

}
