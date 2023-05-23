package com.bank.xyz.pages;

import com.bank.xyz.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    public AccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amountLink;
    @CacheLookup
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement successMessage;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement depositAndWithdrawButton;

    public void enterAmount(int amount){
        sendTextToElement(amountLink,amount);
        log.info("Send text " + amountLink.toString());
    }
    public String getMessage(){
        log.info("Get text " + successMessage.toString());
        return getTextFromElement(successMessage);
    }
    public void clickOnSubmitButton(){
        clickOnElement(depositAndWithdrawButton);
        log.info("Click on " + depositAndWithdrawButton.toString());
    }
}
