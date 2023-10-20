package org.expenses;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.concurrent.TimeUnit;

public class ExpensesAdd extends Expenses {
    @AndroidFindBy(id = "com.clove.clover.uat:id/add_expense")
    private AndroidElement addexpense;

    public ExpensesAdd(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_calender")
    private AndroidElement calenderButton;

    @AndroidFindBy(id = "com.clove.clover.uat:id/mdtp_cancel")
    private AndroidElement calenderCancel;

    @AndroidFindBy(id = "com.clove.clover.uat:id/mdtp_ok")
    private AndroidElement calenderOk;

    @AndroidFindBy(id = "com.clove.clover.uat:id/et_item_name")
    private AndroidElement name;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_item_quantity")
    private AndroidElement quantity;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_item_amount")
    private AndroidElement amount;

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_notesAddEdit")
    private AndroidElement remarksButton;

    @AndroidFindBy(id = "com.clove.clover.uat:id/et_text")
    private AndroidElement remarksTextSend;

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_actionDone")
    private AndroidElement remarkDone;

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_actionDelete")
    private AndroidElement remarksDelete;

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_back_arrow")
    private AndroidElement remarksBackArrow;

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_attachFiles")
    private AndroidElement attachFiles;
    @AndroidFindBy(id = "com.clove.clover.uat:id/save_text")
    private AndroidElement saveText;

    public void setAddexpense() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        addexpense.click();
    }

    public void setCalenderButton() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        calenderButton.click();
    }

    public void setCalenderOk() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        calenderOk.click();
    }

    public void setCalenderCancel() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        calenderCancel.click();
    }

    public void setName() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        name.sendKeys("Manjeet sharma");
    }

    public void setQuantity() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        quantity.sendKeys("3");

    }

    public void setAmount() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        amount.sendKeys("3000");
    }

    public void setRemarksButton() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        remarksButton.click();
    }

    public void setRemarksTextSend() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        remarksTextSend.sendKeys("Expense Added");
    }

    public void setRemarkDone() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        remarkDone.click();
    }

    public void setRemarksDelete() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        remarksDelete.click();
    }

    public void setRemarksBackArrow() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        remarksBackArrow.click();
    }

    public void setSaveText() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        saveText.click();
    }
}
