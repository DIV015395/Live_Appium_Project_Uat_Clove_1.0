package org.schedule;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

public class ClinicNameValidation extends AppointmentBooking
{
    Set<String> uniqueStrings = new TreeSet<>();

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
        System.out.println(tv_itemTitle.size());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        for (int i = 0; i < tv_itemTitle.size(); i++)
        {
            System.out.println(tv_itemTitle.get(i).getText());
            uniqueStrings.add(tv_itemTitle.get(i).getText());
        }
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Wakad\"));"));
        for (int i = 0; i < tv_itemTitle.size(); i++)
        {
            System.out.println(tv_itemTitle.get(i).getText());
            uniqueStrings.add(tv_itemTitle.get(i).getText());
        }

        System.out.println("____________________________________________________");
        System.out.println("++++++++++++++++All Clinic String++++++++++++++++++++");
        System.out.println(uniqueStrings.size());

        for (String str : uniqueStrings)
        {
            System.out.println(str);
        }
    }
}
