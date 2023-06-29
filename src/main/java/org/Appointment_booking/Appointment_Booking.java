package org.Appointment_booking;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.Desired_Capabilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.springframework.ui.context.Theme;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Appointment_Booking extends BaseDriver
{
    public Appointment_Booking(AndroidDriver driver)
    {
        super(driver);
    }
    @AndroidFindBy (id = "com.clove.clover.uat:id/tv_home_schedule")
    public WebElement tv_home_schedule;

    @AndroidFindBy(id = "com.clove.clover.uat:id/layout_clinicSelect")
    public WebElement layout_clinicSelect;

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemTitle")
    public List<WebElement> tv_itemTitle;
    public void selectClinicDropdown() throws InterruptedException {
        tv_home_schedule.click();
        Thread.sleep(3000);
        layout_clinicSelect.click();
        Thread.sleep(4000);
        // Assuming you want to select the option with text "Bodakdev"
        String desiredOptionText = "Bodakdev";
        for (WebElement option : tv_itemTitle) {
            if (option.getText().equals(desiredOptionText)) {
                option.click();
                break;
            }
        }
    }


    @AndroidFindBy(id = "com.clove.clover.uat:id/layout_doctorSelect")
    public WebElement layout_doctorSelect;


    @AndroidFindBy(id = "com.clove.clover.uat:id/fab_newAppointment")
    public WebElement fab_newAppointment;

    public void selectDoctorDropdown() throws InterruptedException {
        layout_doctorSelect.click();
        Thread.sleep(4000);
        // Assuming you want to select the option with text "Bodakdev"
        String desiredOptionText = "Anshu Agrawal";
        for (WebElement option : tv_itemTitle) {
            if (option.getText().equals(desiredOptionText)) {
                option.click();
                break;
            }
        }
        fab_newAppointment.click();
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_contact")
    public WebElement et_contact;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_name")
    public WebElement et_name;

    @AndroidFindBy(id = "com.clove.clover.uat:id/rv_timeSlots")
    public WebElement rv_timeSlots;
    @AndroidFindBy(id="com.clove.clover.uat:id/tv_timeSlot")
    public List<WebElement> tv_timeSlot;
    public void Patient_Dashboard()
    {
        et_contact.sendKeys("7011131498");
        et_name.sendKeys("ManjeetSharma");

        rv_timeSlots.click();
        String desiredOptionTime = "18:";
        for (WebElement option : tv_timeSlot) {
            if (option.getText().equals(desiredOptionTime))
            {
                option.click();
                break;
            }
        }
    }
}
