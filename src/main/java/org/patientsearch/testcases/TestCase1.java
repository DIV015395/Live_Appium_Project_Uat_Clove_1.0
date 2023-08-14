//Patient Details validation

package org.patientsearch.testcases;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class TestCase1 {
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_patientSearch_patientName")
    public WebElement patientName;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_patientSearch_contactNo")
    public WebElement contactNo;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_patientSearch_patientId")
    public WebElement patientId;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_patientSearch_doctorName")
    public WebElement doctorName;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_patientSearch_clinicName")
    public WebElement clinicName;

    public void patientDetails() {

    }

}
