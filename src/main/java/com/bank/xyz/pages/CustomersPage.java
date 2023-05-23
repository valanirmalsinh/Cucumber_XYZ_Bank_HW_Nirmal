package com.bank.xyz.pages;

import com.bank.xyz.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomersPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomersPage.class.getName());
    public CustomersPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement logoutButton;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Deposit']")
    WebElement deposit;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement withdraw;
    public void clickOnDeposit(){
        clickOnElement(deposit);
        log.info("Click on " + deposit.toString());
    }
    public void clickOnWithdraw(){
        clickOnElement(withdraw);
        log.info("Click on " + withdraw.toString());
    }
    public boolean verifyThatLogoutIsDisplayed(){
        log.info("Logout button displayed");
        boolean button=driver.findElement(By.xpath("//button[@class='btn logout']")).isDisplayed();
        if (button) {
            return true;
        } else {
            return false;
        }
    }
    public void clickOnLogoutButton(){
        clickOnElement(logoutButton);
        log.info("Click on " + logoutButton.toString());
    }
}