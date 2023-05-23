package com.bank.xyz.pages;

import com.bank.xyz.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankManagerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());

    public BankManagerLoginPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement addCustomerTab;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement openAccountTab;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Customer Login']")
    WebElement customerLogin;
    @CacheLookup
    @FindBy(xpath = "//button[@class='btn home']")
    WebElement homeButton;
    public void clickOnAddCustomerLoginTab(){
        clickOnElement(addCustomerTab);
        log.info("Click on " + addCustomerTab.toString());
    }
    public void clickOnOpenAccount(){
        clickOnElement(openAccountTab);
        log.info("Click on " + openAccountTab.toString());
    }
    public void clickOnCustomerLogin(){
        clickOnElement(customerLogin);
        log.info("Click on " + customerLogin.toString());
    }
    public void clickOnHomeButton(){
        clickOnElement(homeButton);
        log.info("Click on " + homeButton.toString());
    }
}
