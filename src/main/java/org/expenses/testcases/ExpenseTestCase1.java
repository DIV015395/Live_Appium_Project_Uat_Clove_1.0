package org.expenses.testcases;

import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import org.expenses.ExpensesListing;

public class ExpenseTestCase1 extends ExpensesListing {
    ExtentTest test;

    public ExpenseTestCase1(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }
}
