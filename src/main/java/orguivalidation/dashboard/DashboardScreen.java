package orguivalidation.dashboard;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.BaseDriver;
import org.openqa.selenium.OutputType;
import org.testng.Assert;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class DashboardScreen extends BaseDriver {
    ExtentTest test;
    @AndroidFindBy(id = "com.clove.clover.uat:id/ic_home_logout")
    private AndroidElement dashboardLogoutIcon;
    @AndroidFindBy(id = "com.clove.clover.uat:id/ic_home_notifications")
    private AndroidElement dashboardNotificationIcon;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_navigationHeader_avatar")
    private AndroidElement dashboardProfileImage;
    @AndroidFindBy(id = "com.clove.clover.uat:id/edit_image")
    private AndroidElement dashboardEditIcon;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_home_welcome")
    private AndroidElement dashboardWelcomeText;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_home_doctorName")
    private AndroidElement dashboardDoctorNameText;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_home_defaultFacility")
    private AndroidElement dashboardDefaultLocationIcon;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_home_defaultFacility")
    private AndroidElement dashboardDefaultLocationText;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_home_doctorRole")
    private AndroidElement dashboardRoleIcon;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_home_doctorRole")
    private AndroidElement dashboardRoleNameText;

    public DashboardScreen(AndroidDriver driver, ExtentTest test) {
        super(driver);
        this.test = test;
    }

    public void dashboardLogoutIconExtract() {
        try {
            File screenshotFile = dashboardLogoutIcon.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\dashboardLogoutIcon.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract dashboard Logout Icon", MediaEntityBuilder.createScreenCaptureFromPath("dashboardLogoutIcon.png").build());
        } catch (IOException e) {
            e.printStackTrace();
            test.fail("Failed to dashboard Logout Icon" + e.getMessage());
        }
    }

    public void dashboardNotificationIconExtract() {
        try {
            File screenshotFile = dashboardNotificationIcon.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\dashboardNotificationIcon.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract dashboard Notification Icon", MediaEntityBuilder.createScreenCaptureFromPath("dashboardNotificationIcon.png").build());
        } catch (IOException e) {
            e.printStackTrace();
            test.fail("Failed to dashboard Notification Icon" + e.getMessage());
        }
    }

    public void dashboardProfileImageExtract() {
        try {
            File screenshotFile = dashboardProfileImage.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\dashboardProfileImage.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract dashboard Profile Image", MediaEntityBuilder.createScreenCaptureFromPath("dashboardProfileImage.png").build());
        } catch (IOException e) {
            e.printStackTrace();
            test.fail("Failed to dashboard Profile Image" + e.getMessage());
        }
    }

    public void dashboardEditIconExtract() {
        try {
            File screenshotFile = dashboardEditIcon.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\dashboardEditIcon.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract dashboard Edit Icon", MediaEntityBuilder.createScreenCaptureFromPath("dashboardEditIcon.png").build());
        } catch (IOException e) {
            e.printStackTrace();
            test.fail("Failed to dashboard Edit Icon" + e.getMessage());
        }
    }

    public void dashboardWelcomeTextTest() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(dashboardWelcomeText.getText());
        if (dashboardWelcomeText.getText() != null) {
            Assert.assertEquals(dashboardWelcomeText.getText(), DashboardText.dashboardWelcomeText());
            test.info(dashboardWelcomeText.getText());
            test.pass("Assert Method Verified");
        } else {
            test.fail("Failed dashboard Welcome Text");
        }
    }

    public void dashboardDoctorNameText() {
        if (dashboardDoctorNameText.getText() != null) {
            Assert.assertEquals(dashboardDoctorNameText.getText(), DashboardText.dashboardDoctorName());
            test.info(dashboardDoctorNameText.getText());
            test.pass("Assert Method Verified");
        } else {
            test.fail("Failed dashboard Doctor Name Text");
        }
    }

    public void dashboardDefaultLocationIcon() {
        try {
            File screenshotFile = dashboardDefaultLocationIcon.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\dashboardDefaultLocationIcon.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract dashboard Default Location Icon", MediaEntityBuilder.createScreenCaptureFromPath("dashboardDefaultLocationIcon.png").build());
        } catch (IOException e) {
            e.printStackTrace();
            test.fail("Failed to dashboard Default Location Icon" + e.getMessage());
        }
    }

    public void dashboardDefaultLocationText() {
        if (dashboardDefaultLocationText.getText() != null) {
            Assert.assertEquals(dashboardDefaultLocationText.getText(), DashboardText.dashboardDoctorName());
            test.info(dashboardDefaultLocationText.getText());
            test.pass("Assert Method Verified");
        } else {
            test.fail("Failed dashboard Default Location Text");
        }
    }

    public void dashboardRoleIcon() {
        try {
            File screenshotFile = dashboardRoleIcon.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\dashboardRoleIcon.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract dashboard Role Icon", MediaEntityBuilder.createScreenCaptureFromPath("dashboardRoleIcon.png").build());
        } catch (IOException e) {
            e.printStackTrace();
            test.fail("Failed to dashboard Role Icon" + e.getMessage());
        }

    }

    public void dashboardRoleNameText() {
        if (dashboardRoleNameText.getText() != null) {
            Assert.assertEquals(dashboardRoleNameText.getText(), DashboardText.dashboardDoctorName());
            test.info(dashboardRoleNameText.getText());
            test.pass("Assert Method Verified");
        } else {
            test.fail("Failed dashboard Role Name Text");
        }

    }
}
