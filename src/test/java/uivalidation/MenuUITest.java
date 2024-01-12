package uivalidation;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLogin;
import org.desiredcapabilities.DesireCap;
import org.extentreport.ExtentManager;
import org.menu.Menu;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.schedule.testcase.firstpage.TestCase1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import orguivalidation.menu.MenuScreen;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MenuUITest {
    public AppiumDriver driver;
    public ExtentReports extent;
    public ExtentTest test;

    @BeforeClass
    public void driverLaunch() {
        extent = ExtentManager.getInstance();
        test = extent.createTest("Testcase 1", "description of schedule first page test case 1");
        Logger logger = LoggerFactory.getLogger(getClass());
        try {
            DesiredCapabilities caps = DesireCap.desire();
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            test.log(Status.FAIL, "Click function is not working");
        }

    }

    @Test(priority = 1)
    public void loginApp() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        AppLogin obj = new AppLogin((AndroidDriver) driver, test);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj.userName();
        obj.userPassword();
        obj.goClickButton();
        obj.permissonAllowed();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test(priority = 2,description = "Redirect to Schedule Page")
    public void schedulePage() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        TestCase1 obj = new TestCase1((AndroidDriver) driver, test);
        obj.homeSchedule();
    }
    @Test(priority = 3,description = "Redirect to Menu Page")
    public void MenuPage()
    {
        Menu menu = new Menu((AndroidDriver) driver, test);
        menu.menuButtonOpenDrawer();
    }
    @Test(priority = 4,description = "Menu UI Validation")
    public void MenuUIValidation()
    {
        MenuScreen menuScreen = new MenuScreen((AndroidDriver) driver, test);
       menuScreen.menuCloveLogo();
       menuScreen.menuDividerCloveIcon();
       menuScreen.menuUserInfo();
       menuScreen.menuNavExpenses();
       menuScreen.menuNavSchedule();
       menuScreen.menuNavChat();
       menuScreen.menuNavPatientSearch();
       menuScreen.menuFrameLayoutView();
       menuScreen.menuNavAssets();
       menuScreen.menuPatientEducationInfo();
       menuScreen.menuNavNotification();
       menuScreen.menuNavHelp();
       menuScreen.menuFrameLayoutView2();
       menuScreen.menuNavAbout();
       menuScreen.menuNavLogout();



    }
    @AfterClass
    public void driverClose() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.quit();
        extent.flush();
    }

}
