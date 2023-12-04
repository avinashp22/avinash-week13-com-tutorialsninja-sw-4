package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage  extends Utility {

    By registerAccountText = By.xpath("//h1[normalize-space()='Register Account']");
    By firstNameField = By.xpath("//input[@id='input-firstname']");
    By lastNameField = By.xpath("//input[@id='input-lastname']");
    By emailField = By.xpath("//input[@id='input-email']");
    By telephoneField = By.xpath("//input[@id='input-telephone']");
    By passwordField = By.xpath("//input[@id='input-password']");
    By passwordConfirmField = By.xpath("//input[@id='input-confirm']");
    By subscribeRadioButtonField = By.xpath("//label[normalize-space()='Yes']");
    By privacyPolicyBox = By.xpath("//input[@name='agree']");
    By continueButton = By.xpath("//input[@value='Continue']");
    By accountCreateText = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    By continueButton1 = By.xpath("//a[contains(text(),'Continue')]");

    public String verifyTheRegisterAccountText() {
        return getTextFromElement(registerAccountText);
    }

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterTelephone(String telephone) {
        sendTextToElement(telephoneField, telephone);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void enterPasswordConfirm(String passwordConfirm) {sendTextToElement(passwordConfirmField, passwordConfirm); }

    public void clickOnSubscribeRadioButtonField() {
        clickOnElement(subscribeRadioButtonField);
    }

    public void clickOnPrivacyPolicyBox() {
        clickOnElement(privacyPolicyBox);
    }

    public void clickOnContinueButton1() {
        clickOnElement(continueButton1);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public String verifyTheAccountCreateText() {
        return getTextFromElement(accountCreateText);
    }

}
