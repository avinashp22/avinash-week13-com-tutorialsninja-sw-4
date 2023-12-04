package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class MyAccountPage extends Utility {

    By logOutText = By.xpath("//h1[contains(text(),'Account Logout')]");
    By continueButton2 = By.xpath("//a[contains(text(),'Continue')]");
    By myAccountText = By.xpath("//h2[normalize-space()='My Account']");
    By continueButton3 = By.xpath("//a[@class= 'btn btn-primary']");

    public String verifyTheLogOutText() {
        return getTextFromElement(logOutText);
    }

    public void clickOnContinueButton2() {
        clickOnElement(continueButton2);
    }

    public String verifyMyAccountText() {
        return getTextFromElement(myAccountText);
    }

    public void clickOnContinue3() {
        clickOnElement(continueButton3);
    }

}
