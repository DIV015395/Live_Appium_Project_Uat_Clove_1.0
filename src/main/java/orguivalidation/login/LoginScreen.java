package orguivalidation.login;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.BaseDriver;
import org.desiredcapabilities.ScreenShot;
import org.openqa.selenium.OutputType;
import org.testng.Assert;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class LoginScreen extends BaseDriver {
    LoginText loginText = new LoginText();
    ExtentTest test;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_cloveLogo")
    private AndroidElement loginscreenimageview;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_login_titleLogin")
    private AndroidElement logintitletext;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_login_titleProceed")
    private AndroidElement titleproceedtext;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_login_username")
    private AndroidElement loginusernametext;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_login_username")
    private AndroidElement loginusernameicon;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_login_password")
    private AndroidElement loginpasswordtext;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_login_password")
    private AndroidElement loginpasswordicon;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_login_go")
    private AndroidElement logingotext;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_save")
    private AndroidElement ivsave;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_login_bottomMessage")
    private AndroidElement loginbottommessage;

    public LoginScreen(AndroidDriver driver, ExtentTest test) {
        super(driver);
        this.test = test;
    }
    public void extractImage() {
        try {
            File screenshotFile = loginscreenimageview.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\loginicon.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract Login Icon", MediaEntityBuilder.createScreenCaptureFromPath("loginicon.png").build());
        } catch (IOException e) {
            e.printStackTrace();
            test.fail("Failed to extract the Login Icon " + e.getMessage());
        }
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
    public void loginUsernameIcon() {
        try {
            File screenshotFile = loginusernameicon.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\loginusernameicon.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract Login username Icon", MediaEntityBuilder.createScreenCaptureFromPath("loginusernameicon.png").build());
        } catch (IOException e) {
            e.printStackTrace();
            test.fail("Failed to extract the Login username Icon " + e.getMessage());
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

    public void loginPasswordIcon() {
        try {
            File screenshotFile = loginpasswordicon.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\loginpasswordicon.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract Login password Icon", MediaEntityBuilder.createScreenCaptureFromPath("loginpasswordicon.png").build());
        } catch (IOException e) {
            e.printStackTrace();
            test.fail("Failed to extract the Login password Icon " + e.getMessage());
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

    public void ivSaveIcon() {
        try {
            File screenshotFile = ivsave.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\loginsaveicon.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract Login Icon", MediaEntityBuilder.createScreenCaptureFromPath("loginsaveicon.png").build());
        } catch (IOException e) {
            e.printStackTrace();
            test.fail("Failed to extract the Login save Icon " + e.getMessage());
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
        ScreenShot screenShot = new ScreenShot(driver, test);
        try {
            String screenshotPath = screenShot.takeScreenshot("loginsscreen.png");
            test.pass("Screenshot captured and attached", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
        } catch (Exception e) {
            test.fail("Failed to capture and attach screenshot: " + e.getMessage());
        }
    }
}
