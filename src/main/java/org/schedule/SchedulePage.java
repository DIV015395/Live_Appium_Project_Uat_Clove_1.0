package org.schedule;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.BaseDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class SchedulePage extends BaseDriver {
   public ExtentTest test;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_home_schedule")
    private WebElement tv_home_schedule;
    @AndroidFindBy(id = "com.clove.clover.uat:id/layout_clinicSelect")
    private WebElement layout_clinicSelect;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemTitle")
    public List<WebElement> tv_itemTitle;
    @AndroidFindBy(id = "com.clove.clover.uat:id/layout_doctorSelect")
    public WebElement layout_doctorSelect;
    @AndroidFindBy(id = "com.clove.clover.uat:id/fab_newAppointment")
    public WebElement fab_newAppointment;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_selectedDate")
    public WebElement scheduleCalender;


    public SchedulePage(AndroidDriver driver, ExtentTest test) {
        super(driver);
        this.test = test;
    }

    ResourceBundle resourceBundle = ResourceBundle.getBundle("schedule");
    String doctorName = resourceBundle.getString("doctorName");
    String clinicName = resourceBundle.getString("clinicName");

    public void homeSchedule() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        tv_home_schedule.click();
        test.log(Status.PASS, "Home schedule button clicked ");
    }
    public void scheduleCalenderDate() {
        System.out.println(scheduleCalender.getText());
    }
    public void selectClinicDropdown() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        layout_clinicSelect.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // Assuming you want to select the option with text "Bodakdev"
        String desiredOptionText = clinicName;

        for (WebElement option : tv_itemTitle) {
            if (option.getText().equals(desiredOptionText)) {
                option.click();
                break;
            }
        }
        test.log(Status.PASS, "Clinic is selected from dropdown");
    }

    public void selectDoctorDropdown() {
        layout_doctorSelect.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // Assuming you want to select the option with text "Bodakdev"
        String desiredOptionText = doctorName;
        for (WebElement option : tv_itemTitle) {
            if (option.getText().equals(desiredOptionText)) {
                option.click();
                break;
            }
        }
        test.log(Status.PASS, "Doctor is selected from dropdown");
    }

    public void appointmentPlus() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        fab_newAppointment.click();
        test.log(Status.PASS, "Clicked on Appointment plus button");
    }


}
