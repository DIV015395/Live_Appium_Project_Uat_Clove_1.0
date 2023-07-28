package org.expenses;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.concurrent.TimeUnit;

public class AddExpenses extends Expenses {
    @AndroidFindBy(id = "com.clove.clover.uat:id/add_expense")
    public AndroidElement addexpense;

    public AddExpenses(AndroidDriver driver) {
        super(driver);
    }

    public void setAddexpense() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        addexpense.click();
    }
}
