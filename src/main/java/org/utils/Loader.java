package org.utils;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Loader extends BaseDriver
{
    ExtentTest test;
    @AndroidFindBy(id = "com.clove.clover.uat:id/animation")
    private AndroidElement loaderAnimation;
    public Loader(AndroidDriver driver, ExtentTest test)
    {
        super(driver);
         this.test = test;
    }
    public void loaderAnimation() {
        long startTime = 0;
        long endTime = 0;

        // Maximum wait time in seconds
        int maxWaitTimeSeconds = 120; // You can adjust this based on your requirement

        // Check if the loader is initially visible
        if (loaderAnimation.isDisplayed()) {
            startTime = System.currentTimeMillis();

            // Keep checking for the loader to become invisible with a loop
            while (System.currentTimeMillis() - startTime < maxWaitTimeSeconds * 1000) {
                // Break the loop if the loader is no longer visible
                if (!loaderAnimation.isDisplayed()) {
                    endTime = System.currentTimeMillis();
                    break;
                }
            }
        } else {
            test.fail("Failed to Identify the Loader");
        }

        // Calculate the duration if the loader was visible
        long duration = endTime - startTime;

        System.out.println("Loader buffering time: " + duration + " ms");
        test.pass("Loader buffering time: " + duration + " ms");
    }


}
