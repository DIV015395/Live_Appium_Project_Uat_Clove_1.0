package org.Schedule.Test_Case.Clinicname_Validation;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.Schedule.Appointment_Booking;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class All_Clinicname_Validation extends Appointment_Booking
{
    public All_Clinicname_Validation(AndroidDriver driver)
    {
        super(driver);
    }

    public void selectClinicDropdown() throws InterruptedException
    {
        Thread.sleep(15000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        tv_home_schedule.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        layout_clinicSelect.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Wakad\"));"));
        System.out.println(tv_itemTitle.size());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(15000);
        for(int i=0;i<tv_itemTitle.size();i++)
        {
            System.out.println(tv_itemTitle.get(i).getText());
        }
        Thread.sleep(15000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

}
