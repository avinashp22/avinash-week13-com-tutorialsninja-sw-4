package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LaptopsAndNotebooksPage extends Utility {

    By laptopNotebooksText = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    By sort = By.id("input-sort");
    By selectProduct = By.linkText("MacBook");

    public String verifyLaptopNotebooksText() {
        return getTextFromElement(laptopNotebooksText);
    }

    public void selectSortBy(String sortBy) {
        selectByVisibleTextFromDropDown(sort, sortBy);
    }

    public void selectProductMacBook() {
        clickOnElement(selectProduct);
    }

}
