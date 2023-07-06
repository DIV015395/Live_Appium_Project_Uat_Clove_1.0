package org.Schedule.Test_Case;

import io.appium.java_client.android.AndroidDriver;
import org.Schedule.Appointment_Booking;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.Vector;
import java.util.concurrent.TimeUnit;

public class UI_Schedule_Validation extends Appointment_Booking
{
    public UI_Schedule_Validation(AndroidDriver driver) {
        super(driver);
    }
    @Override
    public void selectClinicDropdown() throws InterruptedException
    {
        Thread.sleep(15000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        try {
            tv_home_schedule.click();
        }
        catch (NoSuchElementException e)
        {
            System.out.println("");
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        try {
            layout_clinicSelect.click();
        }
        catch (NoSuchElementException e)
        {
            System.out.println("");
        }

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // Assuming you want to select the option with text "Bodakdev"
        String desiredOptionText = "Amanora";
        String desiredOptionText2 = "Bodakdev";
        for (WebElement option : tv_itemTitle)
        {
            if (option.getText().equals(desiredOptionText))
            {
                try {
                    option.click();
                }
                catch (NoSuchElementException e)
                {
                    System.out.println("not working Amanora");
                }
            }
            layout_clinicSelect.click();
            if (option.getText().equals(desiredOptionText2))
            {
                try {
                    option.click();
                }
                catch (NoSuchElementException e)
                {
                    System.out.println("not working Bodakdev");
                }
            }
//            if (option.getText().equals(desiredOptionText))
//            {
//                try {
//                    option.click();
//                }
//                catch (NoSuchElementException e)
//                {
//                    System.out.println("");
//                }
//            }
        }
    }
}
