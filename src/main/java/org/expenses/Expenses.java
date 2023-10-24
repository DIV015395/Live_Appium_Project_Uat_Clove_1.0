package org.expenses;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.BaseDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Expenses extends BaseDriver {
    ExtentTest test;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_home_expense")
    public AndroidElement expense;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_selectedItem")
    public AndroidElement cliniclist;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemTitle")
    public List<WebElement> clinics;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_next")
    public AndroidElement nextbutton;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_next")
    public AndroidElement explore;
    @AndroidFindBy(id = "com.clove.clover.uat:id/rl_next")
    public AndroidElement next;

    public Expenses(AndroidDriver driver, ExtentTest test) {
        super(driver);
        this.test = test;
    }

    public void expensesClick() {

        try {
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            expense.click();
            test.log(Status.PASS, "Click on Expense menu button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Expense button. Not Working");
        }

    }

    public void setClinic() {

        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            cliniclist.click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            // Assuming you want to select the option with text "Bodakdev"
            String desiredOptionText = "Developer West";

            for (WebElement option : clinics) {
                if (option.getText().equals(desiredOptionText)) {
                    option.click();
                    break;
                }
            }
            test.log(Status.PASS, "Click on Clinic selected from dropdown. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Clinic selected from dropdown. Not Working");
        }

    }

    public void nextButton() {
        try {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            nextbutton.click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            explore.click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            next.click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            explore.click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            test.log(Status.PASS, "Click on Explore button. Working");

        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Explore button. Not Working");
        }

    }
}
