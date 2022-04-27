package com.github.steed777.pages.googlePage;



import com.github.steed777.pages.MainPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.github.steed777.common.Browser;


public class GooglePage extends MainPage {

    @FindBy(xpath = "//input[contains(@placeholder, 'Логин')]")
    private WebElement loginField;

    @FindBy(xpath = "//h3[contains(text(), 'BORK C804')]")
    private WebElement getEnsurePageLoadedElement;

    @FindBy(xpath = "//img[@alt = 'Google']")
    private WebElement ensurePageLoadedElement;

    @FindBy(xpath = "//input[@title = 'Поиск' ]")
    private WebElement submitButton;

    public void ensurePageLoaded() {
        waitWhileElemIsVisible(ensurePageLoadedElement);
    }

    public void openLoginPage() {
        Browser.getDriver().navigate().to(baseUrl());
        waitForLoad();
    }

    public void sendKeysFieldClick() {
        sendKeys(submitButton);
        waitWhileElemIsVisible(getEnsurePageLoadedElement);
    }

    public void setSourceField() {
        typeSubmit(submitButton, "купить кофемашину bork c804");
    }
}
