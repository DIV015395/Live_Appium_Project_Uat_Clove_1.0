package org.patientsearch;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.BaseDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PatientSearch extends BaseDriver {
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_selectedItem")
    public WebElement ListClinic;

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_home_patient_search")
    public WebElement home_patient_search;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemTitle")
    public List<WebElement> clinicname;

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_next")
    public WebElement tv_next;
    @AndroidFindBy(id = "com.clove.clover.uat:id/btn_explore_schedule")
    public WebElement btn_explore_schedule;

    @AndroidFindBy(id = "com.clove.clover.uat:id/et_searchQuery")
    public WebElement et_searchQuery;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_patientSearchBy")
    public WebElement patientSearchBy;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemTitle")
    public List<WebElement> listofpatientSearchBy;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_search")
    public WebElement iv_search;


    public PatientSearch(AndroidDriver driver) {
        super(driver);
    }

    public void homePatientSearch() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        home_patient_search.click();
    }

    public void explore() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        tv_next.click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        btn_explore_schedule.click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    public void selectClinic() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        ListClinic.click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        // Assuming you want to select the option with text "Bodakdev"
        String desiredOptionText = "Amanora";

        for (WebElement option : clinicname) {
            if (option.getText().equals(desiredOptionText)) {
                option.click();
                break;
            }
        }
    }

    public void patientSearchByValue() {
        et_searchQuery.sendKeys("1111");
    }

    public void patientSearchByOption() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        patientSearchBy.click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        // Assuming you want to select the option with text "Bodakdev"
        String desiredOptionText = "Mobile";

        for (WebElement option : listofpatientSearchBy) {
            if (option.getText().equals(desiredOptionText)) {
                option.click();
                break;
            }
        }
    }

    public void searchButton() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        iv_search.click();

    }
}
