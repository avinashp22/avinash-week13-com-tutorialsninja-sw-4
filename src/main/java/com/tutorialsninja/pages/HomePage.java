package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");


    public void clickOnLoginLink(){clickOnElement(loginLink);}
    public void clickOnRegisterLink(){clickOnElement(registerLink);}

}
