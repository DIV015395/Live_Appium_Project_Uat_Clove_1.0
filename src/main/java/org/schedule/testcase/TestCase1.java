package org.schedule.testcase;
import io.appium.java_client.android.AndroidDriver;
import org.schedule.AppointmentBooking;

import java.util.concurrent.TimeUnit;
public class TestCase1 extends AppointmentBooking
{
    public TestCase1(AndroidDriver driver) {
        super(driver);
    }
    @Override
    public void homeSchedule() throws InterruptedException {
        Thread.sleep(20000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        tv_home_schedule.click();
    }
    @Override
    public void appointmentPlus()
    {
        fab_newAppointment.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        fab_newAppointment.getText();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        System.out.println(fab_newAppointment.getText());
    }
}
