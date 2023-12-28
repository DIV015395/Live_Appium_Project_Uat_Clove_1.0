package orguivalidation.dashboard;

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
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_home_chat")
    private AndroidElement dashboardChatText;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_home_chat")
    private AndroidElement dashboardHomeChatIcon;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_home_chat_subtext")
    private AndroidElement dashboardHomeChatSubtext;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_home_expense")
    private AndroidElement dashboardHomeExpenseText;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_home_expense")
    private AndroidElement dashboardHomeExpenseIcon;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_home_expense_subtext")
    private AndroidElement dashboardHomeExpenseSubtext;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_home_schedule")
    private AndroidElement dashboardHomeSchedule;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_home_schedule")
    private AndroidElement dashboardHomeScheduleIcon;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_home_schedule_subtext")
    private AndroidElement dashboardHomeScheduleSubtext;

//    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_home_patient_search")
//    private AndroidElement dashboardHomePatientSearch;
//    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_home_patient_search")
//    private AndroidElement dashboardHomePatientSearchIcon;


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
            Assert.assertEquals(dashboardDefaultLocationText.getText(), DashboardText.dashboardDefaultLocationText());
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
            Assert.assertEquals(dashboardRoleNameText.getText(), DashboardText.dashboardRoleNameText());
            test.info(dashboardRoleNameText.getText());
            test.pass("Assert Method Verified");
        } else {
            test.fail("Failed dashboard Role Name Text");
        }
    }

    public void dashboardChatText() {
        if (dashboardChatText.getText() != null) {
            Assert.assertEquals(dashboardChatText.getText(), DashboardText.dashboardChatText());
            test.info(dashboardChatText.getText());
            test.pass("Assert Method Verified");
        } else {
            test.fail("Failed dashboard Chat Text");
        }
    }

    public void dashboardHomeChatIcon() {
        try {
            File screenshotFile = dashboardHomeChatIcon.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\dashboardHomeChatIcon.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract dashboard Home Chat Icon", MediaEntityBuilder.createScreenCaptureFromPath("dashboardHomeChatIcon.png").build());
        } catch (IOException e) {
            e.printStackTrace();
            test.fail("Failed to dashboard Home Chat Icon" + e.getMessage());
        }
    }

    public void dashboardHomeChatSubtext() {
        if (dashboardHomeChatSubtext.getText() != null) {
            Assert.assertEquals(dashboardHomeChatSubtext.getText(), DashboardText.dashboardHomeChatSubtext());
            test.info(dashboardHomeChatSubtext.getText());
            test.pass("Assert Method Verified");
        } else {
            test.fail("Failed dashboard Home Chat Subtext");
        }
    }

    public void dashboardHomeExpenseText() {
        if (dashboardHomeExpenseText.getText() != null) {
            Assert.assertEquals(dashboardHomeExpenseText.getText(), DashboardText.dashboardHomeExpenseText());
            test.info(dashboardHomeExpenseText.getText());
            test.pass("Assert Method Verified");
        } else {
            test.fail("Failed dashboard Home Expense Text");
        }
    }

    public void dashboardHomeExpenseIcon() {
        try {
            File screenshotFile = dashboardHomeExpenseIcon.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\dashboardHomeExpenseIcon.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract dashboard Home Expense Icon", MediaEntityBuilder.createScreenCaptureFromPath("dashboardHomeExpenseIcon.png").build());
        } catch (IOException e) {
            e.printStackTrace();
            test.fail("Failed to dashboard Home Expense Icon " + e.getMessage());
        }
    }

    public void dashboardHomeExpenseSubtext() {
        if (dashboardHomeExpenseSubtext.getText() != null) {
            Assert.assertEquals(dashboardHomeExpenseSubtext.getText(), DashboardText.dashboardHomeExpenseSubtext());
            test.info(dashboardHomeExpenseSubtext.getText());
            test.pass("Assert Method Verified");
        } else {
            test.fail("Failed dashboard Home Expense Subtext");
        }
    }

    public void dashboardHomeSchedule() {
        if (dashboardHomeSchedule.getText() != null) {
            Assert.assertEquals(dashboardHomeSchedule.getText(), DashboardText.dashboardHomeSchedule());
            test.info(dashboardHomeSchedule.getText());
            test.pass("Assert Method Verified");
        } else {
            test.fail("Failed dashboard Home Schedule");
        }
    }

    public void dashboardHomeScheduleIcon() {
        try {
            File screenshotFile = dashboardHomeScheduleIcon.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\dashboardHomeScheduleIcon.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract dashboard Home Schedule Icon", MediaEntityBuilder.createScreenCaptureFromPath("dashboardHomeScheduleIcon.png").build());
        } catch (IOException e) {
            e.printStackTrace();
            test.fail("Failed to dashboard Home Schedule Icon " + e.getMessage());
        }
    }

    public void dashboardHomeScheduleSubtext() {
        if (dashboardHomeScheduleSubtext.getText() != null) {
            Assert.assertEquals(dashboardHomeScheduleSubtext.getText(), DashboardText.dashboardHomeScheduleSubtext());
            test.info(dashboardHomeScheduleSubtext.getText());
            test.pass("Assert Method Verified");
        } else {
            test.fail("Failed dashboard Home Schedule Subtext");
        }
    }

    public void captureAndAttachScreenshot() {
        ScreenShot screenShot = new ScreenShot(driver, test);
        try {
            String screenshotPath = screenShot.takeScreenshot("dashboardWelcomeHomeScreen.png");
            test.pass("Screenshot captured and attached", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
        } catch (Exception e) {
            test.fail("Failed to capture and attach screenshot: " + e.getMessage());
        }
    }
}
