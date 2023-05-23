package com.bank.xyz.pages;

import com.bank.xyz.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());
    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerSearch;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Your Name :']")
    WebElement yourNameText;
    public void searchCustomer(String name){
        selectByVisibleTextFromDropDown(customerSearch,name);
        log.info("Select " + customerSearch.toString());
    }
    public void clickOnLogin(){
        clickOnElement(loginButton);
        log.info("Click on " + loginButton.toString());
    }
    public String getYourNameText(){
        log.info("Get text " + yourNameText.toString());
        return getTextFromElement(yourNameText);
    }
}
