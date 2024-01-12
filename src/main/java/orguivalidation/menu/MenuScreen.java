package orguivalidation.menu;
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


public class MenuScreen extends BaseDriver {
    ExtentTest test;
    public MenuScreen(AndroidDriver driver, ExtentTest test) {
        super(driver);
        this.test = test;
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_navigationHeader_cloveLogo")
    private AndroidElement menuCloveLogo;
    public void menuCloveLogo()
    {
        try {
            File screenshotFile = menuCloveLogo.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\menuCloveLogo.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract Menu Clove Logo", MediaEntityBuilder.createScreenCaptureFromPath("menuCloveLogo.png").build());
        } catch (IOException e) {
            e.printStackTrace();
            test.fail("Failed to extract Menu Clove Logo " + e.getMessage());
        }

    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/view_navigationHeader_divider_cloveIcon")
    private AndroidElement menuDividerCloveIcon;
    public void menuDividerCloveIcon()
    {
        try {
            File screenshotFile = menuDividerCloveIcon.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\menuDividerCloveIcon.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract Menu Divider Clove Icon", MediaEntityBuilder.createScreenCaptureFromPath("menuDividerCloveIcon.png").build());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            test.fail("Failed to Menu Divider Clove Icon" + e.getMessage());
        }

    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/rl_navigationHeader_userInfo")
    private AndroidElement menuUserInfo;
    public void menuUserInfo()
    {
        try {
            File screenshotFile = menuUserInfo.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\menuUserInfo.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract Menu User Info", MediaEntityBuilder.createScreenCaptureFromPath("menuUserInfo.png").build());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            test.fail("Failed to Menu User Info" + e.getMessage());
        }

    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/nav_expenses")
    private AndroidElement menuNavExpenses;
    public void menuNavExpenses()
    {
        try {
            File screenshotFile = menuNavExpenses.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\menuNavExpenses.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract Menu Nav Expenses", MediaEntityBuilder.createScreenCaptureFromPath("menuNavExpenses.png").build());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            test.fail("Failed to Menu Nav Expenses" + e.getMessage());
        }

    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/nav_schedule")
    private AndroidElement menuNavSchedule;
    public void menuNavSchedule()
    {
        try {
            File screenshotFile = menuNavSchedule.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\menuNavSchedule.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract Menu Nav Schedule", MediaEntityBuilder.createScreenCaptureFromPath("menuNavSchedule.png").build());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            test.fail("Failed to Menu Nav Schedule" + e.getMessage());
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/nav_chat")
    private AndroidElement menuNavChat;
    public void menuNavChat()
    {
        try {
            File screenshotFile = menuNavChat.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\menuNavChat.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract Menu Nav Chat", MediaEntityBuilder.createScreenCaptureFromPath("menuNavChat.png").build());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            test.fail("Failed to Menu Nav Chat" + e.getMessage());
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/nav_patient_search")
    private AndroidElement menuNavPatientSearch;
    public void menuNavPatientSearch()
    {
        try {
            File screenshotFile = menuNavPatientSearch.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\menuNavPatientSearch.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract Menu Nav Patient Search", MediaEntityBuilder.createScreenCaptureFromPath("menuNavPatientSearch.png").build());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            test.fail("Failed to Menu Nav Patient Search" + e.getMessage());
        }

    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.View")
    private AndroidElement menuFrameLayoutView;
    public void menuFrameLayoutView()
    {
        try {
            File screenshotFile = menuFrameLayoutView.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\menuFrameLayoutView.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract Menu Frame Layout View", MediaEntityBuilder.createScreenCaptureFromPath("menuFrameLayoutView.png").build());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            test.fail("Failed to Menu Frame Layout View" + e.getMessage());
        }


    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/nav_assets")
    private AndroidElement menuNavAssets;
    public void menuNavAssets()
    {
        try {
            File screenshotFile = menuNavAssets.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\menuNavAssets.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract Menu Nav Assets", MediaEntityBuilder.createScreenCaptureFromPath("menuNavAssets.png").build());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            test.fail("Failed to Menu Nav Assets" + e.getMessage());
        }

    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/nav_patient_education_info")
    private AndroidElement menuPatientEducationInfo;
    public void menuPatientEducationInfo()
    {
        try {
            File screenshotFile = menuPatientEducationInfo.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\menuPatientEducationInfo.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract Menu Patient Education Info", MediaEntityBuilder.createScreenCaptureFromPath("menuPatientEducationInfo.png").build());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            test.fail("Failed to Menu Patient Education Info" + e.getMessage());
        }

    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/nav_notification")
    private AndroidElement menuNavNotification;
    public void menuNavNotification()
    {
        try {
            File screenshotFile = menuNavNotification.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\menuNavNotification.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract Menu Nav Notification", MediaEntityBuilder.createScreenCaptureFromPath("menuNavNotification.png").build());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            test.fail("Failed to Menu Nav Notification" + e.getMessage());
        }

    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/nav_help")
    private AndroidElement menuNavHelp;
    public void menuNavHelp()
    {
        try {
            File screenshotFile = menuNavHelp.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\menuNavHelp.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract Menu Nav Help", MediaEntityBuilder.createScreenCaptureFromPath("menuNavHelp.png").build());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            test.fail("Failed to Menu Nav Help" + e.getMessage());
        }

    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.View")
    private AndroidElement menuFrameLayoutView2;
    public void menuFrameLayoutView2()
    {
        try {
            File screenshotFile = menuFrameLayoutView2.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\menuFrameLayoutView2.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract Menu Frame Layout View2", MediaEntityBuilder.createScreenCaptureFromPath("menuFrameLayoutView2.png").build());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            test.fail("Failed to Menu Frame Layout View2" + e.getMessage());
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/nav_about")
    private AndroidElement menuNavAbout;
    public void menuNavAbout()
    {
        try {
            File screenshotFile = menuNavAbout.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\menuNavAbout.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract Menu Nav About", MediaEntityBuilder.createScreenCaptureFromPath("menuNavAbout.png").build());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            test.fail("Failed to Menu Nav About" + e.getMessage());
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/nav_logout")
    private AndroidElement menuNavLogout;
    public void menuNavLogout()
    {
        try {
            File screenshotFile = menuNavLogout.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\menuNavLogout.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract Menu Nav Logout", MediaEntityBuilder.createScreenCaptureFromPath("menuNavLogout.png").build());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            test.fail("Failed to Menu Nav Logout" + e.getMessage());
        }
    }

}
