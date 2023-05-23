package com.bank.xyz.pages;

import com.bank.xyz.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());

    public AddCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]")
    WebElement postCode;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement addCustomerButton;
    public void enterFirstName(String name){
        sendTextToElement(firstName,name);
        log.info("Send text " + firstName.toString());
    }
    public void enterLastName(String name){
        sendTextToElement(lastName,name);
        log.info("Send text " + lastName.toString());
    }
    public void enterPostcode(String postcode){
        sendTextToElement(postCode,postcode);
        log.info("Send text " + postcode.toString());
    }
    public void clickOnAddCustomerButton(){
        clickOnElement(addCustomerButton);
        log.info("Click on " + addCustomerButton.toString());
    }
    public void acceptAnAlert(){
        acceptAlert();
        log.info("Accept alert");
    }
}
