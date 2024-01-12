package orguivalidation.schedule;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.cucumber.java.bs.A;
import org.algorithm.DateManipulator;
import org.desiredcapabilities.BaseDriver;
import org.desiredcapabilities.ImageUtils;
import org.openqa.selenium.OutputType;
import org.testng.Assert;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScheduleScreen extends BaseDriver
{
    ExtentTest test;
    public ScheduleScreen(AndroidDriver driver, ExtentTest test)
    {
        super(driver);
        this.test = test;
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_screen_title")
    private AndroidElement scheduleScreen;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_previousDate")
    private AndroidElement previousDateIcon;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_selectedDate")
    private AndroidElement scheduleCurrentDate;

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_nextDate")
    private AndroidElement nextDateIcon;


    public void scheduleTitle()
    {
        if (scheduleScreen.getText() != null)
        {
            Assert.assertEquals(scheduleScreen.getText(), ScheduleText.scheduleTitleText());
            test.info(scheduleScreen.getText());
            test.pass("Assert Method Verified : Schedule Title Text");
        }
        else
        {
            test.fail("Failed to verify schedule title text");
        }
    }
    public void schedulePreviousDateIcon()
    {
        try
        {
            File screenshotFile = previousDateIcon.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\schedulePreviousDateIcon.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract schedule previous date Icon", MediaEntityBuilder.createScreenCaptureFromPath("schedulePreviousDateIcon.png").build());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            test.fail("Failed to schedule previous date Icon" + e.getMessage());
        }
    }
    public void scheduleCurrentDate()
    {
        if (scheduleCurrentDate.getText() != null)
        {
            Assert.assertEquals(scheduleCurrentDate.getText(), DateManipulator.currentDate());
            test.info(scheduleCurrentDate.getText());
            test.pass("Assert Method Verified : Schedule Current date");
        }
        else
        {
            test.fail("Failed to verify schedule Current Date");
        }
    }
    public void scheduleNextDateIcon()
    {
        try
        {
            File screenshotFile = nextDateIcon.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\scheduleNextDateIcon.png");
            ImageIO.write(image, "png", outputFile);
//
//            BufferedImage loadedImage = ImageIO.read(new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\scheduleNextDateIcon.png"));
//            byte[] actualImageBytes = ImageUtils.convertImageToBytes(loadedImage);
//            System.out.println("actual Images next Bite :"+actualImageBytes);
            test.pass("Extract schedule next date Icon", MediaEntityBuilder.createScreenCaptureFromPath("scheduleNextDateIcon.png").build());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            test.fail("Failed to schedule next date Icon" + e.getMessage());
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_selectedItem")
    private AndroidElement scheduleSelectedItem;
    public void scheduleSelectedITem()
    {
        if (scheduleSelectedItem.getText() != null)
        {
            Assert.assertEquals(scheduleSelectedItem.getText(), ScheduleText.scheduleDropdownClinicText());
            test.info(scheduleSelectedItem.getText());
            test.pass("Assert Method Verified : Schedule clinic  Text");
        }
        else
        {
            test.fail("Failed to verify Schedule Clinic text");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_changeSelectedItem")
    private AndroidElement scheduleSelectedItemIcon;

    public void scheduleSelectedItemIcon()
    {
        try
        {
            File screenshotFile = scheduleSelectedItemIcon.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\scheduleSelectedItemIcon.png");
            ImageIO.write(image, "png", outputFile);
//            BufferedImage loadedImage = ImageIO.read(new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\scheduleSelectedItemIcon.png"));
//            byte[] actualImageBytes = ImageUtils.convertImageToBytes(loadedImage);
//            System.out.println("actual Images Bite :"+actualImageBytes);
//
//            BufferedImage loadedImages = ImageIO.read(new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\scheduleSelectedItemIcons.png"));
//            byte[] actualImageBytess = ImageUtils.convertImageToBytes(loadedImages);
//            System.out.println("actual Images Bite :"+actualImageBytess);
//
//

            test.pass("Extract schedule Selected Item Icon", MediaEntityBuilder.createScreenCaptureFromPath("scheduleSelectedItemIcon.png").build());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            test.fail("Failed to schedule Selected Item Icon" + e.getMessage());
        }
    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.TextView")
    private AndroidElement scheduleDoctorSelectedDropdownText;

    public void scheduleDoctorSelectedDropdownText()
    {
        if (scheduleDoctorSelectedDropdownText.getText() != null)
        {
            Assert.assertEquals(scheduleDoctorSelectedDropdownText.getText(), ScheduleText.scheduleDoctorSelectedDropdownText());
            test.info(scheduleDoctorSelectedDropdownText.getText());
            test.pass("Assert Method Verified : Schedule Doctor Name  Text");
        }
        else
        {
            test.fail("Failed to verify Schedule Doctor Name text");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/fab_newAppointment")
    private AndroidElement scheduleAddAppointmentIcon;
    public void scheduleAddAppointmentIcon()
    {
        try
        {
            File screenshotFile = scheduleAddAppointmentIcon.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\scheduleAddAppointmentIcon.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract schedule Add Appointment Icon", MediaEntityBuilder.createScreenCaptureFromPath("scheduleAddAppointmentIcon.png").build());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            test.fail("Failed to schedule Add Appointment Icon" + e.getMessage());
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/openDrawer")
    private AndroidElement scheduleMenuOpenDrawerIcon;

    public void scheduleMenuOpenDrawerIcon()
    {
        try
        {
            File screenshotFile = scheduleMenuOpenDrawerIcon.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\scheduleMenuOpenDrawerIcon.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract schedule Menu Open Drawer Icon", MediaEntityBuilder.createScreenCaptureFromPath("scheduleMenuOpenDrawerIcon.png").build());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            test.fail("Failed to schedule Menu Open Drawer Icon" + e.getMessage());
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/ll_expenses")
    private AndroidElement scheduleExpensesIcon;


    public void scheduleExpensesIcon()
    {
        try
        {
            File screenshotFile = scheduleExpensesIcon.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\scheduleExpensesIcon.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract schedule Expenses Icon", MediaEntityBuilder.createScreenCaptureFromPath("scheduleExpensesIcon.png").build());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            test.fail("Failed to schedule Expenses Icon" + e.getMessage());
        }
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/ivSchedule")
    private AndroidElement scheduleScheduleIcon;
    public void scheduleScheduleIcon()
    {
        try
        {
            File screenshotFile = scheduleScheduleIcon.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\scheduleScheduleIcon.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract schedule Schedule Icon", MediaEntityBuilder.createScreenCaptureFromPath("scheduleScheduleIcon.png").build());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            test.fail("Failed to schedule Schedule Icon" + e.getMessage());
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/img_view_group")
    private AndroidElement scheduleViewGroup;

    public void scheduleViewGroup()
    {
        try
        {
            File screenshotFile = scheduleViewGroup.getScreenshotAs(OutputType.FILE);
            BufferedImage image = ImageIO.read(screenshotFile);
            File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\scheduleViewGroup.png");
            ImageIO.write(image, "png", outputFile);
            test.pass("Extract schedule View Group Icon", MediaEntityBuilder.createScreenCaptureFromPath("scheduleViewGroup.png").build());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            test.fail("Failed to schedule View Group Icon" + e.getMessage());
        }
    }
}
