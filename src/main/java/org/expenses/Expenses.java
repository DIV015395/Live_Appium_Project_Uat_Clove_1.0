package org.expenses;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.BaseDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Expenses extends BaseDriver {
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

    public Expenses(AndroidDriver driver) {
        super(driver);
    }

    public void expensesClick() throws InterruptedException {
        Thread.sleep(20000);
        expense.click();
    }

    public void setClinic() {
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
    }

    public void nextButton() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        nextbutton.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        explore.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        next.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        explore.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}
