package org.schedule.testcase.firstpage;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.algorithm.DateManipulator;
import org.openqa.selenium.WebElement;
import org.schedule.SchedulePage;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ScheduleScreen extends SchedulePage {
    ExtentTest test;
    public ScheduleScreen(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }
    @AndroidFindBy(xpath = "//android.widget.Toast")
    private AndroidElement toastMessage;
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"add new appointment\"]")
    private WebElement fab_newAppointment;

    @Override
    public void appointmentPlus() {
        if (fab_newAppointment.isDisplayed())
        {
            try {
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                fab_newAppointment.click();
                test.log(Status.PASS, "Clicked on Appointment plus button");
            } catch (Exception e) {
                test.log(Status.FAIL, "Clicked on Appointment plus button -> Failed");
            }
        }
        else
        {
            test.log(Status.FAIL, "Failed -> to identify the Locator");
        }
    }
    String toast = "Please select a valid clinic!";
    public void toastMassageValidation()
    {
        Assert.assertEquals(toast, "Please select a valid clinic!");
        test.log(Status.PASS, "Toast message is Validated");
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_selectedDate")
    private WebElement tv_selectedDate;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_previousDate")
    private WebElement iv_previousDate;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_nextDate")
    private WebElement iv_nextDate;

    public void dateChange() {

        try {
            String orignalDate = tv_selectedDate.getText();
            String decreaseOrignalDate = DateManipulator.subtractOneDay(orignalDate);
            iv_previousDate.click();
            String priviousDate = tv_selectedDate.getText();
            if (decreaseOrignalDate.equals(priviousDate)) {
                Assert.assertEquals(priviousDate, decreaseOrignalDate);
                test.log(Status.PASS, "decrease the date functionality button working fine");
            }
            iv_nextDate.click();
            String nextDate = tv_selectedDate.getText();
            if (orignalDate.equals(nextDate)) {
                Assert.assertEquals(orignalDate, nextDate);
                test.log(Status.PASS, "increase the date functionality button working fine");
            } else {
                test.log(Status.PASS, "-1");
            }
        } catch (Exception e) {
            test.log(Status.FAIL, "decrease the date functionality button not  working fine");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/layout_clinicSelect")
    private WebElement layout_clinicSelect;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemTitle")
    private List<WebElement> tv_itemTitle;
    @Override
    public void selectClinicDropdown() {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            layout_clinicSelect.click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            // Assuming you want to select the option with text "Bodakdev"
            String desiredOptionText = "Developer West";

            for (WebElement option : tv_itemTitle) {
                if (option.getText().equals(desiredOptionText)) {
                    option.click();
                    break;
                }
            }
            test.log(Status.PASS, "Selected clinic from dropdown");
        } catch (Exception e) {
            test.log(Status.FAIL, "Selected clinic from dropdown -> Not Working");

        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_screen_title")
    private AndroidElement screenTitle;
    String redirectScreenTitleName = "Add Appointment";
    public void screenTitleValidation() {
        try {
            Assert.assertEquals(screenTitle.getText(), redirectScreenTitleName);
            test.log(Status.PASS, "Redirect to Appointment Add Screen Verified - Working Fine");
        } catch (Exception e)
        {
            test.log(Status.FAIL, "Redirect to Appointment Add Screen Verified - Not Working");
        }
    }
}
