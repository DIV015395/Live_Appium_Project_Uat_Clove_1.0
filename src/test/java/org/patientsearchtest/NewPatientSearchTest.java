package org.patientsearchtest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLoginNew;
import org.utils.NewBaseDriver;
import org.extentreport.ExtentManager;
import org.patientsearch.NewPatientSeach;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NewPatientSearchTest {

    public AppiumDriver driver;
    public ExtentReports extent;
    public ExtentTest test;
    @BeforeClass
    public void driverLaunch()
    {
        extent = ExtentManager.getInstance();
        test = extent.createTest("Patient Search", "Patient Search");
        NewBaseDriver newBaseDriver = new NewBaseDriver((AndroidDriver) driver, test);
        driver = newBaseDriver.driverLaunch();
    }
    @Test(priority = 1)
    public void loginApp() {
        AppLoginNew appLoginNew = new AppLoginNew((AndroidDriver) driver,test);
        appLoginNew.loginPositiveScenario();
    }
    @Test(priority = 2)
    public void patientSearch() {
        NewPatientSeach newPatientSeach = new NewPatientSeach((AndroidDriver) driver, test);
        //
        newPatientSeach.homePatientSearch();
        newPatientSeach.explore();
        //Patient search explore completed
         //
        newPatientSeach.patientSearchByValueEmail();
        newPatientSeach.selectClinic();
        newPatientSeach.patientSearchByOptionEmail();
        newPatientSeach.searchButton();
        newPatientSeach.patientNameFromListValidation();
        newPatientSeach.patientClinicNameFromListValidation();
        //data clear from ro
        newPatientSeach.clearPatientSearchByValue();
        //
        newPatientSeach.patientSearchByValueName();
        newPatientSeach.patientSearchByOptionName();
        newPatientSeach.searchButton();
        newPatientSeach.patientNameFromListValidation();
        newPatientSeach.patientClinicNameFromListValidation();
        //data clear from ro
        newPatientSeach.clearPatientSearchByValue();
        //
        newPatientSeach.patientSearchByValuePatientId();
        newPatientSeach.patientSearchByOptionPatientId();
        newPatientSeach.searchButton();
        newPatientSeach.patientIdFromListValidation();
        newPatientSeach.patientClinicNameFromListValidation();
        //
        //data clear from ro
        newPatientSeach.clearPatientSearchByValue();
        //
        newPatientSeach.patientSearchByValuePatientPhone();
        newPatientSeach.patientSearchByOptionMobile();
        newPatientSeach.searchButton();
        newPatientSeach.patientContactNumberFromListValidation();
        newPatientSeach.patientClinicNameFromListValidation();

        ///
        newPatientSeach.threeDotButton();
        newPatientSeach.selectAddFile();
        newPatientSeach.oralImages();
        newPatientSeach.saveButton();
        newPatientSeach.titleToastMessageValidation();
        //
        newPatientSeach.fileTitleField();
        newPatientSeach.saveButton();
        newPatientSeach.uploadToastMessageValidation();
        //
        newPatientSeach.setAttachFiles();
        newPatientSeach.allowPermission();
        newPatientSeach.setCamera();
        newPatientSeach.setCamera();
        newPatientSeach.setShutterButton();
        newPatientSeach.setDoneCapture();
        newPatientSeach.attachFileTitleValidation();
        //
        newPatientSeach.attachFilesCancel();
        newPatientSeach.attachFileTitleValidation();
        //




        test.pass("Test is successful pass");
    }
    @AfterClass
    public void driverClose() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.quit();
        extent.flush();
    }
}
