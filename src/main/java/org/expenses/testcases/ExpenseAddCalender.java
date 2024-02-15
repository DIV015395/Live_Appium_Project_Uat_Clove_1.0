package org.expenses.testcases;

import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import org.expenses.ExpensesListingAdd;

public class ExpenseAddCalender extends ExpensesListingAdd {

    ExtentTest test;

    public ExpenseAddCalender(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }

}
