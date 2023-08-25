package org.loginstepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.applogin.testcase.TestCase1;

public class LoginStepDefinition1 {
    private final TestCase1 testCase;

    public LoginStepDefinition1(TestCase1 testCase) {
        this.testCase = testCase;
    }

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        // Implement corresponding logic from AppLogin class
        testCase.userName();
    }

    @When("the user enters empty password")
    public void the_user_enters_empty_password() {
        // Implement corresponding logic from AppLogin class
    }

    @When("clicks on the Go button")
    public void clicks_on_the_go_button() {
        // Implement corresponding logic from AppLogin class
        testCase.goClickButton();
    }

    @Then("a toast message {string} should be displayed")
    public void a_toast_message_should_be_displayed(String expectedMessage) {
        // Implement corresponding logic from TestCase1 class
        testCase.toastMessage();
        testCase.toastMassageValidation();
    }
}
