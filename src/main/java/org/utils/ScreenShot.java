package org.utils;

import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ScreenShot extends BaseDriver {
    ExtentTest test;

    public ScreenShot(AndroidDriver driver, ExtentTest test) {
        super(driver);
        this.test = test;
    }

    public String takeScreenshot(String screenshotName) {
        try {
            TakesScreenshot ts = driver;
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            String directoryPath = "C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen";
            String screenshotPath = directoryPath + "\\" + screenshotName;
            Files.createDirectories(Paths.get(directoryPath));
            Files.write(Paths.get(screenshotPath), screenshot);
            test.pass("ScreenShot Store Successfully");
            return screenshotName;
        } catch (IOException e) {
            test.fail("Failed to save screenshot: " + e.getMessage());
            throw new RuntimeException("Failed to save screenshot: " + e.getMessage());
        }
    }
}
