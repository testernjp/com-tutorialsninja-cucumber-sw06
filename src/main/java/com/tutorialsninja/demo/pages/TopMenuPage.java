package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TopMenuPage extends Utility {

    private static final Logger log = LogManager.getLogger(TopMenuPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*")
    WebElement topMenu ;
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopLink ;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]")
    WebElement desktopsText  ;
    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement  laptopsAndNotebooksLink;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement  laptopAndNotebooksText;
    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement componentsLink ;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]")
    WebElement componentsText ;

    public void selectMenu(String menu) {
        log.info("select menu : " + topMenu.toString());
        List<WebElement> topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements((By) topMenu);
        }
    }
    public void mouseHoverOnDesktopLinkAndClick() {
        log.info("mouseHoverOnDesktopLinkAndClick : " + desktopLink.toString());
        mouseHoverToElementAndClick(desktopLink);
    }

    public String getDesktopsText() {
        log.info("getDesktopsText: " + desktopsText.toString());
        return getTextFromElement(desktopsText);
    }

    public void mouseHoverOnLaptopAndNotebooksLinkAndClick() {
        log.info("mouseHoverOnLaptopAndNotebooksLinkAndClick: " + laptopsAndNotebooksLink.toString());
        mouseHoverToElementAndClick(laptopsAndNotebooksLink);
    }

    public String getLaptopsAndNotebooksText() {
        log.info("getLaptopsAndNotebooksTex: " + laptopAndNotebooksText.toString());
        return getTextFromElement(laptopAndNotebooksText);
    }

    public void mouseHoverOnComponentsLinkAndClick() {
        log.info("mouseHoverOnComponentsLinkAndClick: " + componentsLink.toString());
        mouseHoverToElementAndClick(componentsLink);
    }

    public String getComponentsText() {
        log.info("getComponentsText: " + componentsText.toString());
        return getTextFromElement(componentsText);
    }
}