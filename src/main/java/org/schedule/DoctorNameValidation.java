package org.schedule;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

public class DoctorNameValidation extends AppointmentBooking
{
    Set<String> uniqueStrings = new TreeSet<>();

    public DoctorNameValidation(AndroidDriver driver) {
        super(driver);
    }
    @Override
    public void homeSchedule() throws InterruptedException {
        Thread.sleep(15000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        tv_home_schedule.click();
    }

    public void doctorNameValidation() throws InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        layout_doctorSelect.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(tv_itemTitle.size());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        for (int i = 0; i < tv_itemTitle.size(); i++)
        {
            System.out.println(tv_itemTitle.get(i).getText());
            uniqueStrings.add(tv_itemTitle.get(i).getText());
        }
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Jaipur C Scheme\"));"));
        for (int i = 0; i < tv_itemTitle.size(); i++)
        {
            System.out.println(tv_itemTitle.get(i).getText());
            uniqueStrings.add(tv_itemTitle.get(i).getText());
        }
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Monica Raj\"));"));
        for (int i = 0; i < tv_itemTitle.size(); i++)
        {
            System.out.println(tv_itemTitle.get(i).getText());
            uniqueStrings.add(tv_itemTitle.get(i).getText());
        }
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Pramila Mahala\"));"));
        for (int i = 0; i < tv_itemTitle.size(); i++)
        {
            System.out.println(tv_itemTitle.get(i).getText());
            uniqueStrings.add(tv_itemTitle.get(i).getText());
        }
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Rasalika Agrawal\"));"));
        for (int i = 0; i < tv_itemTitle.size(); i++)
        {
            System.out.println(tv_itemTitle.get(i).getText());
            uniqueStrings.add(tv_itemTitle.get(i).getText());
        }
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Shubhjit Mehta\"));"));
        for (int i = 0; i < tv_itemTitle.size(); i++)
        {
            System.out.println(tv_itemTitle.get(i).getText());
            uniqueStrings.add(tv_itemTitle.get(i).getText());
        }
    }
}
