@regression
Feature: Bank test
  As a user i want to test all functions of Bank

  Scenario: Bank manager should add customer successfully
    Given I am on home page
    When click On Bank Manager Login Tab
    And click On Add Customer Tab
    And enter FirstName "Prime"
    And enter LastName "Testing"
    And enter PostCode "E13DS"
    And click On Add Customer Button
    And popup display
    Then verify message "Customer added successfully"
    And click on ok button on popup

  Scenario: Bank manager should open account successfully
    Given I am on home page
    When click On Bank Manager Login Tab
    And click On Open Account Tab
    And Search customer that created in first test "Hermoine Granger"
    And Select currency "Pound"
    And click on process button
    Then verify message "Account created successfully"
    And click on ok button on popup

  Scenario: customer Should Login And Logout Successfully
    Given I am on home page
    When click on Customer Login Tab
    And search customer "Hermoine Granger"
    And click on Login Button
    And verify Logout Tab displayed.
    And click on Logout
    Then verify "Your Name" text displayed

  Scenario: Customer should deposit money successfully
    Given I am on home page
    When click on Customer Login Tab
    When search customer "Hermoine Granger"
    And click on Login Button
    And click on Deposit Tab
    And Enter amount 100
    And click on submit Button
    And verify message this "Deposit Successful"

  Scenario: Customer should withdraw money successfully
    Given I am on home page
    When click on Customer Login Tab
    When search customer "Hermoine Granger"
    And click on Login Button
    And click on withdraw Tab
    And Enter amount 50
    And click on submit Button
    And verify message this "Transaction successful"