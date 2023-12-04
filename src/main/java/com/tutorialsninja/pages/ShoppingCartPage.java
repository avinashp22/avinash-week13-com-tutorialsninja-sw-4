package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage  extends Utility {

    By shoppingCartText = By.xpath("//div[@id='content']//h1");
    By productNameText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By deliveryDateText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]");
    By modelNameText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]");
    By totalAmountText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    By changeQtyLink = By.xpath("//input[contains(@name, 'quantity')]");
    By updateQtyLink = By.xpath("//button[contains(@data-original-title, 'Update')]");
    By modifiedCartText = By.xpath("//div[@id='checkout-cart']/div[1]");
    By checkOut = By.xpath("//a[@class='btn btn-primary']");


    public String verifyShoppingCartText() {
        return getTextFromElement(shoppingCartText);
    }

    public String verifyProductName() {
        return getTextFromElement(productNameText);
    }

    public String verifyTheDeliveryDate() {
        return getTextFromElement(deliveryDateText);
    }

    public String verifyTheModelName() {
        return getTextFromElement(modelNameText);
    }

    public String verifyTheTotalAmount() {
        return getTextFromElement(totalAmountText);
    }

    public void changeTheQty() {
        driver.findElement(changeQtyLink).clear();
        sendTextToElement(changeQtyLink, "2");
    }

    public void updateTheQty() {
        clickOnElement(updateQtyLink);
    }

    public String verifyTheModifyCartText() {
        return getTextFromElement(modifiedCartText);
    }

    public void clickOnCheckOutButton() {
        clickOnElement(checkOut);
    }

}
