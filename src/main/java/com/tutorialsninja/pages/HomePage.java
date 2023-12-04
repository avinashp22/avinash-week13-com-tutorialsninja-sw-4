package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

    public void selectMenu(String menu) {
        List<WebElement> topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }


    By selectCurrency = By.xpath("//span[contains(text(),'Currency')]");
    By poundSterling = By.xpath("//button[normalize-space()='£Pound Sterling']");
    By desktopLink = By.linkText("Desktops");
    By laptopNotebooks = By.linkText("Laptops & Notebooks");
    By components = By.linkText("Components");
    By accountOption = By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li");
    By muAccountLink = By.xpath("//span[contains(text(),'My Account')]");


    public void mouseHoverOnDesktops() {mouseHoverToElementAndClick(desktopLink);  }

    public void mouseHoverOnLaptopNotebooks() {mouseHoverToElementAndClick(laptopNotebooks);  }

    public void mouseHoverOnComponents() {mouseHoverToElementAndClick(components); }

    public void clickOnCurrency() {clickOnElement(selectCurrency);}

    public void selectPoundSterling() {mouseHoverToElementAndClick(poundSterling); }

    public void clickOnMyAccount() {clickOnElement(muAccountLink);}

  // 1.1 create method with name "selectMyAccountOptions" it has one parameter name"option" of type string
   //1.2 This method should click on the options whatever name is passed as parameter.

    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = getListOfElements(accountOption);
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = getListOfElements(accountOption);
        }
    }



}
