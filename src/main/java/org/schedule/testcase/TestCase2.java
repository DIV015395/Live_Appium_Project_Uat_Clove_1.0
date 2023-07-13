package org.schedule.testcase;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.schedule.AppointmentBooking;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestCase2 extends AppointmentBooking
{

    public TestCase2(AndroidDriver driver) {
        super(driver);
    }
    @Override
    public void homeSchedule() throws InterruptedException
    {
        Thread.sleep(15000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        tv_home_schedule.click();
    }

    @Override
    public void selectClinicDropdown() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        layout_clinicSelect.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // Assuming you want to select the option with text "Bodakdev"
        String desiredOptionText = "Amanora";
        for (WebElement option : tv_itemTitle)
        {
            if (option.getText().equals(desiredOptionText)) {
                option.click();
                break;
            }
        }
    }
    @Override
    public void appointmentPlus()
    {
        fab_newAppointment.click();
    }
}
