package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopLink;
    @CacheLookup
    @FindBy(linkText = "Show AllDesktops")
    WebElement showAllDesktops;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']//select[@id='input-sort']")
    WebElement positionZtoA;
    @CacheLookup
    @FindBy(xpath = "//h4/a")
    WebElement allProductName;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Currency']")
    WebElement currency;
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement positionAtoZ;
    @CacheLookup
    @FindBy(id = "input-limit")
    WebElement enterQty;
    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(css = "body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible")
    WebElement successMessage;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart1;
    @CacheLookup
    @FindBy(xpath = "//td[normalize-space()='Product 21']")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath = "//td[normalize-space()='Model']")
    WebElement model;
    @CacheLookup
    @FindBy(xpath = "//td[contains(text(),'Total')]")
    WebElement total;

    public void mouseHoverOnDesktopLinkAndClick() {
        log.info("hover On desktop link " + desktopLink.toString());
        mouseHoverToElementAndClick(desktopLink);
    }

    public void clickOnShowAllDesktops() {
        clickOnElement(showAllDesktops);
        log.info("click On show All Desktops " + showAllDesktops.toString());
    }

    public void selectPositionByZtoA() {
        selectByVisibleTextFromDropDown(positionZtoA, "Name(ZtoA)");
        log.info("Select position A to Z " + positionZtoA.toString());
    }

    public String getAllProductNameText() {
        log.info("Getting all product name " + allProductName.toString());
        return getTextFromElement(allProductName);
    }

    public void MouseHoverOnCurrencyDropdownAndClick() {
        log.info("mouse hover on currency " + currency.toString());
        selectByVisibleTextFromDropDown(currency, "Euro");
    }

    public void selectPositionByAtoZ() {
        log.info("Select position By A to Z " + positionAtoZ.toString());
        selectByVisibleTextFromDropDown(positionAtoZ, "Name (A - Z)");
    }

    public void enterQuantity() {
        log.info("Enter quantity " + enterQty.toString());
        sendTextToElement(enterQty, "");
    }

    public void clickOnAddToCart() {
        log.info("Click on add to cart " + addToCart.toString());
        clickOnElement(addToCart);
    }

    public String getSuccessText() {
        log.info("Getting success message " + successMessage.toString());
        return getTextFromElement(successMessage);

    }

    public String clickOnShoppingCart() {
        log.info("Click on shopping Cart " + shoppingCart1.toString());
        return getTextFromElement(shoppingCart1);

    }

    public void clickOnShoppingCart1() {
        log.info("Click on shopping cart " + shoppingCart.toString());
        clickOnElement(shoppingCart);
    }

    public String verifyProductName() {
        log.info("Verify product name " + productName.toString());
        return getTextFromElement(productName);

    }

    public String verifyModel() {
        log.info("Verify model " + model.toString());
        return getTextFromElement(model);

    }

    public String verifyTotal() {
        log.info("Verify total " + total.toString());
        return getTextFromElement(total);

    }
}