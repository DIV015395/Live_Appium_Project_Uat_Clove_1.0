Feature: Testing the login functionality

  Scenario: User logs in with empty password
    Given the user is on the login page
    When the user enters empty password
    And clicks on the Go button
    Then a toast message "Please enter password" should be displayed