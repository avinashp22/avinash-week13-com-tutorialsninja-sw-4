package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class DesktopsPage extends Utility {

    By sortBy = By.id("input-sort");
    By desktopsText = By.xpath("//h2[contains(text(),'Desktops')]");
    By product = By.xpath("//a[contains(text(),'HP LP3065')]");

    public void clickOnSortBy(String sort) {
        selectByVisibleTextFromDropDown(sortBy, sort);
    }

    public String verifyDesktopsText() {
        return getTextFromElement(desktopsText);
    }

    public void clickOnProduct() {
        clickOnElement(product);
    }

}
