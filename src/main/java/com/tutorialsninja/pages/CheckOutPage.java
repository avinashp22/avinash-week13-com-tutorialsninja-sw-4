package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {

    By checkOutText = By.xpath("//h1[normalize-space()='Checkout']");
    By newCustomerText = By.xpath("//h2[normalize-space()='New Customer']");
    By guestCheckOut = By.xpath("//input[@value='guest']");
    By continueButton = By.xpath("//input[@id='button-account']");
    By firstName = By.xpath("//input[@id='input-payment-firstname']");
    By lastName = By.xpath("//input[@id='input-payment-lastname']");
    By email = By.xpath("//input[@id='input-payment-email']");
    By telephone = By.xpath("//input[@id='input-payment-telephone']");
    By address1 = By.xpath("//input[@id='input-payment-address-1']");
    By city = By.xpath("//input[@id='input-payment-city']");
    By postcode = By.xpath("//input[@id='input-payment-postcode']");
    By country = By.xpath("//select[@id='input-payment-country']");
    By region = By.xpath("//select[@id='input-payment-zone']");
    By continueButtonLast = By.xpath("//input[@id='button-guest']");
    By comments = By.xpath("//textarea[@name='comment']");
    By agree = By.xpath("//input[@type='checkbox']");
    By guestContinueButton = By.xpath("//input[@name = 'agree']");
    By warningText = By.xpath("//div[@class='alert alert-warning alert-dismissible']");


    public String verifyCheckOutText() {
        return getTextFromElement(checkOutText);
    }

    public String verifyNewCustomerText() {
        return getTextFromElement(newCustomerText);
    }

    public void clickOnGuestCheckOut() {
        clickOnElement(guestCheckOut);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public void enterFirstName(String firstNme) {
        sendTextToElement(firstName, firstNme);
    }

    public void enterLastName(String lastname) {
        sendTextToElement(lastName, lastname);
    }

    public void enterEmail(String value) {
        sendTextToElement(email, value);
    }

    public void enterPhoneNumber(String value) {
        sendTextToElement(telephone, value);
    }

    public void enterAddress1(String value) {
        sendTextToElement(address1, value);
    }

    public void enterCity(String value) {
        sendTextToElement(city, value);
    }

    public void enterPostCode(String value) {
        sendTextToElement(postcode, value);
    }

    public void selectCountry(String value) {
        selectByVisibleTextFromDropDown(country, value);
    }

    public void selectRegion(String value) {
        selectByVisibleTextFromDropDown(region, value);
    }

    public void clickOnLastContinueCheckOutButton() {
        clickOnElement(continueButtonLast);
    }

    public void enterComments(String value) {sendTextToElement(comments, value);}

    public void clickOnAgree() {
        clickOnElement(agree);
    }

    public void clickOnGuestContinue() {
        clickOnElement(guestContinueButton);
    }

    public String verifyPaymentWarningText() {
        return getTextFromElement(warningText);
    }
}