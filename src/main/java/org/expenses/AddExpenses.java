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

    @AndroidFindBy(id = "com.clove.clover.uat:id/et_item_name")
    public AndroidElement name;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_item_quantity")
    public AndroidElement quantity;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_item_amount")
    public AndroidElement amount;

    public void setAddexpense() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        addexpense.click();
    }

    public void informationExpenses() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        name.sendKeys("Manjeet sharma");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        quantity.sendKeys("3");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        amount.sendKeys("3000");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}
