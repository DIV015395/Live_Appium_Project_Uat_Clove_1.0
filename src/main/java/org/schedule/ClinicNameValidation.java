package org.schedule;

import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class ClinicNameValidation extends AppointmentBooking
{
    public ClinicNameValidation(AndroidDriver driver)
    {
        super(driver);
    }
    public void nameValidation()
    {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        tv_home_schedule.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        layout_clinicSelect.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Wakad\"));"));
        System.out.println(tv_itemTitle.size());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        for (int i = 0; i < tv_itemTitle.size(); i++)
        {
            System.out.println(tv_itemTitle.get(i).getText());
        }
    }
}
