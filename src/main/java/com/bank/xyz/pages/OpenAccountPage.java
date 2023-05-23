package com.bank.xyz.pages;

import com.bank.xyz.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());
    public OpenAccountPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement searchCustomer;
    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement selectCurrency;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement processButton;
    public void searchCustomer(String name){
        selectByVisibleTextFromDropDown(searchCustomer,name);
        log.info("Select " + searchCustomer.toString());
    }
    public void selectCurrency(String currency){
        selectByVisibleTextFromDropDown(selectCurrency,currency);
        log.info("Select " + selectCurrency.toString());
    }
    public void clickOnProcessButton(){
        clickOnElement(processButton);
        log.info("Click on " + processButton.toString());
    }
    public void acceptAnAlert(){
        acceptAlert();
        log.info("Accept alert");
    }
}
