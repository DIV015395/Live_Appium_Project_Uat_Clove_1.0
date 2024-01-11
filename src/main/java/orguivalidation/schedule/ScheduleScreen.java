package orguivalidation.schedule;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;
import orguivalidation.dashboard.DashboardText;

public class ScheduleScreen {
    ExtentTest test;

    public ScheduleScreen(ExtentTest test) {
        this.test = test;
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_screen_title")
    private AndroidElement scheduleScreen;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_previousDate")
    private AndroidElement previousDateIcon;
    public void scheduleTitle()
    {
        if (scheduleScreen.getText() != null) {
            Assert.assertEquals(scheduleScreen.getText(), ScheduleText.scheduleTitleText());
            test.info(scheduleScreen.getText());
            test.pass("Assert Method Verified : Schedule Title Text");
        } else {
            test.fail("Failed to verify schedule title text");
        }
    }
}
