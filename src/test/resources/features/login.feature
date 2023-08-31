Feature: Testing the login functionality

  @sanity
  Scenario: User logs in with userid password
    Given Launch the driver
    When user will enter the user id
    When user will enter the password
    When user will click on Go button
    When user will click on notification allowed
    Then Toast message "Please enter valid username & password!" will display

  @regression
  Scenario: User logs in with empty password
    Given Launch the driver
    When user will enter the user id
    When user will click on Go button
    Then user will click on notification allowed
    Then Toast message "Please enter valid username & password!" will display

  @regression
  Scenario: User logs in with empty user id
    Given Launch the driver
    When user will enter the password
    When user will click on Go button
    When user will click on notification allowed
    Then Toast message "Please enter valid username & password!" will display

  @regression
  Scenario: User logs in with empty password
    Given Launch the driver
    When user will click on Go button
    When user will click on notification allowed
    Then Toast message "Please enter valid username & password!" will display






