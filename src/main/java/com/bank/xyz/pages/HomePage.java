package com.bank.xyz.pages;

import com.bank.xyz.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLoginButton;
    public void clickOnBankManagerLogin(){
        clickOnElement(bankManagerLoginButton);
        log.info("Click on " + bankManagerLoginButton.toString());
    }
    public String getAlertMessage(){
        log.info("Click on ");
        return getTextFromAlert();
    }
    public void alertAccept(){
        acceptAlert();
    }
}
