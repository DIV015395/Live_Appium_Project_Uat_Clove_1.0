package orguivalidation.login;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.BaseDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LoginScreen extends BaseDriver {
    LoginText loginText = new LoginText();
    ExtentTest test;
    @AndroidFindBy(id = "android.widget.ImageView")
    private AndroidElement loginscreenimageview;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_login_titleLogin")
    private AndroidElement logintitletext;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_login_titleProceed")
    private AndroidElement titleproceedtext;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_login_username")
    private AndroidElement loginusernametext;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_login_password")
    private AndroidElement loginpasswordtext;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_login_go")
    private AndroidElement logingotext;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_login_bottomMessage")
    private AndroidElement loginbottommessage;

    public LoginScreen(AndroidDriver driver, ExtentTest test) {
        super(driver);
        this.test = test;
    }

    public void loginTitle() {
        if (logintitletext.getText() != null) {
            Assert.assertEquals(logintitletext.getText(), loginText.loginTitleText());
            test.info(loginText.loginTitleText());
            test.pass("Assert Method Verified");
        } else {
            test.fail("Failed Login Title Text Validation");
        }
    }

    public void titleProceed() {
        if (titleproceedtext.getText() != null) {
            Assert.assertEquals(titleproceedtext.getText(), loginText.titleProceedText());
            test.info(titleproceedtext.getText());
            test.pass("Assert Method Verified");
        } else {
            test.fail("Failed Title Proceed Text Validation");
        }
    }

    public void loginUsername() {
        if (loginusernametext.getText() != null) {
            Assert.assertEquals(loginusernametext.getText(), loginText.loginUsernameText());
            test.info(loginusernametext.getText());
            test.pass("Assert Method Verified");
        } else {
            test.fail("Failed Login Username Text Validation");
        }
    }

    public void loginPassword() {
        if (loginpasswordtext.getText() != null) {
            Assert.assertEquals(loginpasswordtext.getText(), loginText.loginPasswordText());
            test.info(loginpasswordtext.getText());
            test.pass("Assert Method Verified");
        } else {
            test.fail("Failed Login password Text Validation");
        }
    }

    public void loginGo() {
        if (logingotext.getText() != null) {
            Assert.assertEquals(logingotext.getText(), loginText.loginGoText());
            test.info(logingotext.getText());
            test.pass("Assert Method Verified");
        } else {
            test.fail("Failed Login Go Text Validation");
        }
    }

    public void loginBottomMessage() {
        if (loginbottommessage.getText() != null) {
            Assert.assertEquals(loginbottommessage.getText(), loginText.loginBottomMessage());
            test.info(loginbottommessage.getText());
            test.pass("Assert Method Verified");
        } else {
            test.fail("Failed Login Bottom Message Text Validation");
        }
    }

    public void captureAndAttachScreenshot() {
        try {
            // Take screenshot using Appium
            String screenshotPath = takeScreenshot();
            System.out.println(screenshotPath);

            // Attach screenshot to the Extent Report without a description
            test.addScreenCaptureFromPath(screenshotPath);
            test.addScreenCaptureFromPath("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\loginresources\\screenshot.png");
            test.pass("Screenshot captured and attached");
            test.pass("Screenshot captured and attached", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\loginresources\\screenshot.png").build());
        } catch (Exception e) {
            test.fail("Failed to capture and attach screenshot: " + e.getMessage());
        }
    }


    private String takeScreenshot() {
        try {
            // Take screenshot using Appium
            TakesScreenshot ts = driver;
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);

            // Specify the directory path to save the screenshot
            String directoryPath = "C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\loginresources";
            String screenshotPath = directoryPath + "\\screenshot.png";

            // Create directories if they don't exist
            Files.createDirectories(Paths.get(directoryPath));

            // Save the screenshot to a file
            Files.write(Paths.get(screenshotPath), screenshot);

            return screenshotPath;
        } catch (IOException e) {
            throw new RuntimeException("Failed to save screenshot: " + e.getMessage());
        }
    }
}
