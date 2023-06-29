package org.Patient_Search;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.Desired_Capabilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Patient_Search_POM extends BaseDriver
{
    public Patient_Search_POM(AndroidDriver driver)
    {
       super(driver);
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_home_patient_search")
    public WebElement home_patient_search;

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_next")
    public WebElement tv_next;

    @AndroidFindBy(id = "com.clove.clover.uat:id/btn_explore_schedule")
    public WebElement btn_explore_schedule;

    public void explore() throws InterruptedException {
        Thread.sleep(1000);
        home_patient_search.click();
        Thread.sleep(1000);
        tv_next.click();
        Thread.sleep(1000);
        btn_explore_schedule.click();
        Thread.sleep(1000);
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_searchQuery")
    public WebElement et_searchQuery;

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_search")
    public WebElement iv_search;
    public void patientSearch() throws InterruptedException {
        Thread.sleep(1000);
        et_searchQuery.sendKeys("7011131498");
        Thread.sleep(1000);
        iv_search.click();
        Thread.sleep(1000);
    }
}
