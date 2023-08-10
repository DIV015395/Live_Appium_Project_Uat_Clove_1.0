//For chekin and no show print


//for late checking verify
//amanora
//6/08/2023
//Rajesh1


package org.schedule.testcase.secondpage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.algorithm.CurrentFormattedDate;
import org.schedule.SchedulePage;

public class TestCase10 extends SchedulePage {
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_previousDate")
    public AndroidElement previousDate;
    int l = CurrentFormattedDate.currentDate();
    int date = 06;
    public TestCase10(AndroidDriver driver) {
        super(driver);
    }

    public void dataBack() {
        while (date <= l) {
            previousDate.click();
            l--;
        }
    }
}
