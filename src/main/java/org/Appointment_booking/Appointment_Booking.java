package org.Appointment_booking;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.Desired_Capabilities.BaseDriver;
import org.openqa.selenium.WebElement;

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

    @AndroidFindBy(id = "com.clove.clover.uat:id/layout_doctorSelect")
    public WebElement layout_doctorSelect;
    int index = 4;

    @AndroidFindBy(id = "com.clove.clover.uat:id/fab_newAppointment")
    public WebElement Plus_Buttons;
    public void select_clinic_Doctor(int index)
    {
        layout_clinicSelect.click();
        // Assuming the dropdown options are represented by a list of elements
        // and the desired option is at index 3 (zero-based index)
        String Clinic_Id = "com.clove.clover.uat:id/layout_clinicSelect" + index;
        WebElement option = driver.findElementById(Clinic_Id);
        option.click();

        //select Doctors
        layout_doctorSelect.click();
        String Doctor_Id = "com.clove.clover.uat:id/layout_doctorSelect" + index;
        WebElement doctor_name = driver.findElementById(Doctor_Id);
        doctor_name.click();

        //click on plus buttons
        Plus_Buttons.click();
    }
}
