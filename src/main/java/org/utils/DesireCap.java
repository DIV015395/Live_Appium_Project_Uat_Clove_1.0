package org.utils;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class DesireCap {
    public static DesiredCapabilities desire() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.0");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_XL");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
//        caps.setCapability(MobileCapabilityType.APP, "C:\\cloveapps\\bases.apk");
//        caps.setCapability(MobileCapabilityType.APP, "C:\\cloveapps\\cashhandoveralloc.apk");
        caps.setCapability(MobileCapabilityType.APP, "C:\\cloveapps\\clove_doctor_uat_20240130_1.apk");
        return caps;
    }
}