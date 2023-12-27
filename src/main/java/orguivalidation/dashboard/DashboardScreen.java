package orguivalidation.dashboard;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.BaseDriver;
import org.openqa.selenium.OutputType;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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
}
