package uivalidation;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.applogin.testcase.TestCase5;
import org.desiredcapabilities.DesireCap;
import org.extentreport.ExtentManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.schedule.testcase.firstpage.TestCase1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import orguivalidation.schedule.ScheduleScreen;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ScheduleUITest {
    public AppiumDriver driver;
    public ExtentReports extent = ExtentManager.getInstance();
    public ExtentTest test;

    @BeforeClass
    public void driverLaunch() {
        test = extent.createTest("Driver Launch", "Driver Launch");
        try {
            DesiredCapabilities caps = DesireCap.desire();
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            test.log(Status.FAIL, "Click function is not working");
        }
    }
    @Test(priority = 1, description = "Redirect to Dashboard Page")
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
    @Test(priority = 2,description = "Redirect to Schedule Screen")
    public void redirectToSchedulePage()
    {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        TestCase1 obj = new TestCase1((AndroidDriver) driver, test);
        obj.homeSchedule();
    }
    @Test(priority = 3,description = "Schedule Page UI Validation")
    public void scheduleScreenTest()
    {
        ScheduleScreen scheduleScreen = new ScheduleScreen((AndroidDriver) driver,test);
        scheduleScreen.scheduleTitle();
        scheduleScreen.schedulePreviousDateIcon();
        scheduleScreen.scheduleCurrentDate();
        scheduleScreen.scheduleNextDateIcon();
        scheduleScreen.scheduleSelectedITem();
        scheduleScreen.scheduleSelectedItemIcon();
        scheduleScreen.scheduleDoctorSelectedDropdownText();
        scheduleScreen.scheduleAddAppointmentIcon();
        scheduleScreen.scheduleMenuOpenDrawerIcon();
        scheduleScreen.scheduleExpensesIcon();
        scheduleScreen.scheduleScheduleIcon();
        scheduleScreen.scheduleViewGroup();
    }
    @AfterClass
    public void driverClose() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.quit();
        extent.flush();
    }

}
