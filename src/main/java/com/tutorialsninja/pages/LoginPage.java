package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By loginLink = By.xpath("//h2[contains(text(),'Returning Customer')]");
    By emailField = By.id("input-email");
    By passwordField = By.id("input-password");
    By loginButton = By.xpath("//form[contains(@action,'login')]//input[@type='submit']");

    public String verifyTheLoginText() {return getTextFromElement(loginLink); }

    public void enterEmail1(String email1) {sendTextToElement(emailField, email1);}

    public void enterPassword1(String password1) {sendTextToElement(passwordField, password1);}

    public void clickOnLoginButton() {clickOnElement(loginButton);}
}
