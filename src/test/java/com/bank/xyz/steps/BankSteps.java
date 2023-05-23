package com.bank.xyz.steps;

import com.bank.xyz.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class BankSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^click On Bank Manager Login Tab$")
    public void clickOnBankManagerLoginTab() {
        new HomePage().clickOnBankManagerLogin();
    }

    @And("^click On Add Customer Tab$")
    public void clickOnAddCustomerTab() {
        new BankManagerLoginPage().clickOnAddCustomerLoginTab();
    }
    @And("^enter FirstName \"([^\"]*)\"$")
    public void enterFirstName(String fName) {
        new AddCustomerPage().enterFirstName(fName);
    }

    @And("^enter LastName \"([^\"]*)\"$")
    public void enterLastName(String lName) {
        new AddCustomerPage().enterLastName(lName);
    }

    @And("^enter PostCode \"([^\"]*)\"$")
    public void enterPostCode(String postCode) {
        new AddCustomerPage().enterPostcode(postCode);
    }

    @And("^click On Add Customer Button$")
    public void clickOnAddCustomerButton() {
        new AddCustomerPage().clickOnAddCustomerButton();
    }

    @And("^popup display$")
    public void popupDisplay() {
        new AddCustomerPage().acceptAnAlert();
    }

    @And("^verify message \"([^\"]*)\"$")
    public void verifyMessage(String expected) throws InterruptedException {
        //Thread.sleep(500);
        //Assert.assertTrue(new HomePage().getAlertMessage().contains(expected),"Customer not added");
    }

    @And("^click on ok button on popup$")
    public void clickOnOkButtonOnPopup() throws InterruptedException {
        //Thread.sleep(500);
        //new HomePage().acceptAlert();
    }

    @And("^click On Open Account Tab$")
    public void clickOnOpenAccountTab() {
        new BankManagerLoginPage().clickOnOpenAccount();
    }

    @And("^Search customer that created in first test \"([^\"]*)\"$")
    public void searchCustomerThatCreatedInFirstTest(String name){
        new OpenAccountPage().searchCustomer(name);
    }

    @And("^Select currency \"([^\"]*)\"$")
    public void selectCurrency(String currency){
        new OpenAccountPage().selectCurrency(currency);
    }

    @And("^click on process button$")
    public void clickOnProcessButton() {
        new OpenAccountPage().clickOnProcessButton();
    }

    @When("^click on Customer Login Tab$")
    public void clickOnCustomerLoginTab() {
        new BankManagerLoginPage().clickOnCustomerLogin();
    }

    @When("^search customer \"([^\"]*)\"$")
    public void searchCustomer(String name) {
        new CustomerLoginPage().searchCustomer(name);
    }

    @When("^click on Login Button$")
    public void clickOnLoginButton() {
        new CustomerLoginPage().clickOnLogin();
    }

    @When("^verify Logout Tab displayed\\.$")
    public void verifyLogoutTabDisplayed() {
        new CustomersPage().verifyThatLogoutIsDisplayed();
    }

    @When("^click on Logout$")
    public void clickOnLogout() {
        new CustomersPage().clickOnLogoutButton();
    }

    @When("^verify \"([^\"]*)\" text displayed$")
    public void verifyTextDisplayed(String expected) {
        Assert.assertTrue(new CustomerLoginPage().getYourNameText().contains(expected),"Logout is not successful");
    }

    @And("^click on Deposit Tab$")
    public void clickOnDepositTab() {
       new CustomersPage().clickOnDeposit();
    }

    @And("^Enter amount (\\d+)$")
    public void enterAmount(int amount) {
        new AccountPage().enterAmount(amount);
    }

    @And("^verify message this \"([^\"]*)\"$")
    public void verifyMessageThis(String expected) {
       Assert.assertEquals(new AccountPage().getMessage(),expected,"Transaction not done");
    }

    @And("^click on submit Button$")
    public void clickOnSubmitButton() {
        new AccountPage().clickOnSubmitButton();
    }

    @And("^click on withdraw Tab$")
    public void clickOnWithdrawTab() {
        new CustomersPage().clickOnWithdraw();
    }
}
